theory WTT_Safe
  imports "Hybrid-Verification.Hybrid_Verification"
begin

dataspace WTT =
  constants
    H1 :: real  H2 :: real
    L1 :: real  L2 :: real
    LL :: real  HH :: real
    FL :: real  \<epsilon>  :: real
  assumes
    eps_ge0: "\<epsilon> \<ge> 0"
    and HH_hyps: "H1 < HH" "H2 < HH"
    and LL_hyps: "LL < L1" "LL < L2"
  variables
    x1 :: real  x2 :: real
    f1 :: real  f2 :: real
    t  :: real
    V1 :: bool  V2 :: bool  P :: bool
    

context WTT
begin


expression overall_f2 is "(of_bool V2)*(of_bool P)*f2 "

expression overall_f is "(of_bool V1)*f1 - overall_f2"

lemma overall_f2_eq: "overall_f2 = (if V2 \<and> P then f2 else 0)\<^sub>e"
  by expr_simp

lemma overall_f_eq: "overall_f = ((if V1 then f1 else 0) - (if V2 \<and> P then f2 else 0))\<^sub>e"
  by expr_simp

definition "ctrl_safe \<equiv>
  (IF f1 > (HH - x1) / \<epsilon> THEN V1 := False
   ELSE (IF x1 \<le> L1 THEN V1 := True ELSE skip))
; (IF x2 \<le> L2 THEN (P := True; V2 := True) ELSE skip)
; (IF overall_f < (LL - x1) / \<epsilon>
      \<or> f2 \<le> FL
      \<or> overall_f2 > (HH - x2) / \<epsilon>
   THEN (P := False; V2 := False) ELSE skip)"

expression Q is "t \<le> \<epsilon> \<and> 0 \<le> x1 \<and> 0 \<le> x2 \<and> 0 \<le> f1 \<and> 0 \<le> f2"

definition "plant \<equiv> {
  x1` = (if V1 then f1 else 0) - (if V2 \<and> P then f2 else 0),
  x2` = (if V2 \<and> P then f2 else 0),
  t`  = 1
| 0 \<le> x1 \<and> 0 \<le> x2 \<and> 0 \<le> f1 \<and> 0 \<le> f2 \<and> t \<le> \<epsilon> }" (* Q *)

definition "inflow \<equiv> f1 := ?; f2 := ?"

definition "step_safe \<equiv> inflow; ctrl_safe; (t := 0); plant"

expression A is 
  "L1 \<le> x1 \<and> x1 \<le> H1 \<and> L2 \<le> x2 \<and> x2 \<le> H2
    \<and> V1 = False \<and> V2 = False \<and> P = False
    \<and> \<epsilon> \<ge> 0 \<and> FL > 0 \<and> LL < L1 \<and> LL < L2
    \<and> L1 < H1 \<and> L2 < H2 \<and> H1 < HH \<and> H2 < HH"

expression S is
  "LL \<le> x1 \<and> x1 \<le> HH \<and> LL \<le> x2 \<and> x2 \<le> HH"

expression loop_inv is
  "LL \<le> x1 \<and> x1 \<le> HH \<and> LL \<le> x2 \<and> x2 \<le> HH \<and> P = V2"

expression post_ctrl is
  "loop_inv 
    \<and> (f1 > (HH - x1) / \<epsilon> \<longrightarrow> V1 = False) 
    \<and> (f1 \<le> (HH - x1) / \<epsilon> \<and> x1 \<le> L1 \<longrightarrow> V1 = True)
    \<and> (f2 \<le> FL \<longrightarrow> P = False \<and> V2 = False)
    \<and> (x2 \<le> L2 \<and> f2 > (HH - x2) / \<epsilon> \<longrightarrow>  P = False \<and> V2 = False)
    \<and> (x2 \<le> L2 \<and> f1 > (HH - x1) / \<epsilon> \<and> - f2 < (LL - x1) / \<epsilon> \<longrightarrow>  P = False \<and> V2 = False)
    \<and> (x2 \<le> L2 \<and> f1 \<le> (HH - x1) / \<epsilon> \<and> x1 \<le> L1 \<and> f1 - f2 < (LL - x1) / \<epsilon> \<longrightarrow>  P = False \<and> V2 = False)
"

(*



*)


lemma inflow_invariance:
  "H{loop_inv} inflow {loop_inv}"
  unfolding inflow_def loop_inv_def
  apply normalise_prog
  apply do_a_discrete
  apply nondet_assign
  apply expr_simp
  done

lemma ctrl_invariance:
  "H{loop_inv} ctrl_safe {loop_inv}"
  unfolding ctrl_safe_def loop_inv_def
  by (symbolic_exec; expr_simp)

lemma ctrl_post:
  "H{loop_inv} ctrl_safe {post_ctrl}"
  unfolding ctrl_safe_def loop_inv_def
  apply (symbolic_exec; expr_simp; clarsimp?)
  done

(*   apply normalise_prog
  apply if_then_else
  subgoal
    apply forward_assign
    apply if_then_else
     apply forward_assign
     apply (rename_tac old_P)
     apply forward_assign
     apply (rename_tac old_V2)
     apply if_then_else
      apply forward_assign
    apply assign
  sorry *)


lemma tank_flow1 [local_flow]: 
  "local_flow_on [x1 \<leadsto> k1, x2 \<leadsto> k2, t \<leadsto> 1] (x1 +\<^sub>L x2 +\<^sub>L t) UNIV UNIV 
    (\<lambda>\<tau>. [x1 \<leadsto> k1 * \<tau> + x1, x2 \<leadsto> k2 * \<tau> + x2, t \<leadsto> \<tau> + t])"
  by local_flow_on_auto

lemma tank_flow2 [local_flow]: 
  "local_flow_on [
    t \<leadsto> 1,
    x1 \<leadsto> (if V1 then f1 else 0) - (if V2 \<and> P then f2 else 0), 
    x2 \<leadsto> (if V2 \<and> P then f2 else 0)
  ] (x1 +\<^sub>L x2 +\<^sub>L t) UNIV UNIV 
  (\<lambda>\<tau>. [
    x1 \<leadsto> ((if V1 then f1 else 0) - (if V2 \<and> P then f2 else 0)) * \<tau> + x1, 
    x2 \<leadsto> (if V2 \<and> P then f2 else 0) * \<tau> + x2, 
    t \<leadsto> \<tau> + t])"
  apply ((clarsimp simp: local_flow_on_def)?, unfold_locales; clarsimp?)
  subgoal for s
    apply expr_simp
    by (cases "V1<s>"; cases "V2<s>"; cases "P<s>"; clarsimp)
      c1_lipschitz+
  subgoal for s \<tau> x1' x2' t'
    by vderiv
  subgoal
    by expr_simp
  done

lemma plant_invariance:
  "H{post_ctrl} plant {loop_inv}"
  using HH_hyps LL_hyps
  unfolding plant_def loop_inv_def
  apply (wlp_full local_flow: tank_flow2)
  apply (intro conjI impI allI; (clarsimp simp: )?)
  (* apply (safe; clarsimp?) *)

  sorry


lemma step_invariance:
  "H{loop_inv} inflow {loop_inv}
  \<Longrightarrow> H{loop_inv} ctrl_safe {post_ctrl}
  \<Longrightarrow> H{post_ctrl} plant {loop_inv}
  \<Longrightarrow> H{loop_inv} step_safe {loop_inv}"
  unfolding step_safe_def
  apply normalise_prog
  apply (sequence loop_inv, assumption)
  apply (sequence post_ctrl, assumption)
  apply (sequence post_ctrl)
  subgoal
    apply assign
    apply expr_simp
    done
  apply assumption
  done

lemma "H{A} (LOOP step_safe INV loop_inv) {S}"
  apply (intro_loops)
    apply (rule step_invariance)
      apply (rule inflow_invariance)
     apply (rule ctrl_post)
    apply (rule plant_invariance)
   apply expr_simp
  apply expr_simp
  done


(* property *)
(* abbreviation "inv_wtt \<equiv> (LL \<le> $x1 \<and> $x1 \<le> HH \<and> LL \<le> $x2 \<and> $x2 \<le> HH)" *)
(* abbreviation "program_safe \<equiv> LOOP step_safe INV inv_wtt" *)

end
end
