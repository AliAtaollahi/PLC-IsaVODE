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
  variables
    x1 :: real  x2 :: real
    f1 :: real  f2 :: real
    t  :: real
    V1 :: bool  V2 :: bool  P :: bool

context WTT
begin

definition "ctrl_safe \<equiv>
  (IF f1 > (HH - x1) / \<epsilon> THEN V1 := False
   ELSE (IF x1 \<le> L1 THEN V1 := True ELSE skip))
; (IF x2 \<le> L2 THEN (P := True; V2 := True) ELSE skip)
; (IF ((if V1 \<and> \<not>(V2 \<and> P) then f1 else if \<not>V1 \<and> (V2 \<and> P) then - f2
        else (if V1 then f1 else 0) - (if V2 \<and> P then f2 else 0))) < (LL - x1) / \<epsilon>
      \<or> f2 \<le> FL
      \<or> (if V2 \<and> P then f2 else 0) > (HH - x2) / \<epsilon>
   THEN (P := False; V2 := False) ELSE skip)
"

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
  "LL \<le> x1 \<and> x1 \<le> HH \<and> LL \<le> x2 \<and> x2 \<le> HH"


lemma inflow_invariance:
  "H{loop_inv} inflow {loop_inv}"
  unfolding inflow_def loop_inv_def
  apply symbolic_exec
  apply nondet_assign
  apply expr_simp
  done

lemma ctrl_invariance:
  "H{loop_inv} ctrl_safe {loop_inv}"
  unfolding ctrl_safe_def loop_inv_def
  by (symbolic_exec; expr_simp)


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
  "H{loop_inv} plant {loop_inv}"
  unfolding plant_def loop_inv_def
  apply (wlp_full local_flow: tank_flow2)
  apply (safe; clarsimp?)

  sorry


lemma step_invariance:
  "H{loop_inv} inflow {loop_inv}
  \<Longrightarrow> H{loop_inv} ctrl_safe {loop_inv}
  \<Longrightarrow> H{loop_inv} plant {loop_inv}
  \<Longrightarrow> H{loop_inv} step_safe {loop_inv}"
  unfolding step_safe_def
  apply normalise_prog
  apply (sequence loop_inv, assumption)+
  apply (sequence loop_inv)
  subgoal
    unfolding loop_inv_def
    by assign expr_simp
  apply assumption
  done

lemma "H{A} (LOOP step_safe INV loop_inv) {S}"
  apply (intro_loops)
  apply (rule step_invariance[OF inflow_invariance ctrl_invariance plant_invariance])
  by expr_simp+


(* property *)
(* abbreviation "inv_wtt \<equiv> (LL \<le> $x1 \<and> $x1 \<le> HH \<and> LL \<le> $x2 \<and> $x2 \<le> HH)" *)
(* abbreviation "program_safe \<equiv> LOOP step_safe INV inv_wtt" *)

end
end
