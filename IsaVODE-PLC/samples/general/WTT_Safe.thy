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
  x1` = overall_f,
  x2` = overall_f2,
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
    \<and> (x2 \<le> L2 \<and> V1 = True \<and> f1 - f2 \<ge> (LL - x1) / \<epsilon> \<and> f2 > FL \<and> f2 \<le> (HH - x2) / \<epsilon> \<longrightarrow>  P = True \<and> V2 = True)
    \<and> (x2 \<le> L2 \<and> V1 = True \<and> f1 - f2 < (LL - x1) / \<epsilon> \<longrightarrow>  P = False \<and> V2 = False)
    \<and> (x2 \<le> L2 \<and> V1 = False \<and> - f2 < (LL - x1) / \<epsilon> \<longrightarrow>  P = False \<and> V2 = False)
    \<and> (x2 \<le> L2 \<and> f2 > (HH - x2) / \<epsilon> \<longrightarrow>  P = False \<and> V2 = False)
    \<and> (x2 > L2 \<and> V1 = True \<and> f1 - f2 < (LL - x1) / \<epsilon> \<longrightarrow>  P = False \<and> V2 = False)
    \<and> (x2 > L2 \<and> V1 = False \<and> - f2 < (LL - x1) / \<epsilon> \<longrightarrow>  P = False \<and> V2 = False)
    \<and> (x2 > L2 \<and> f2 > (HH - x2) / \<epsilon> \<longrightarrow>  P = False \<and> V2 = False)
"

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

lemma tank_flow1 [local_flow]: 
  "local_flow_on [x1 \<leadsto> k1, x2 \<leadsto> k2, t \<leadsto> 1] (x1 +\<^sub>L x2 +\<^sub>L t) UNIV UNIV 
    (\<lambda>\<tau>. [x1 \<leadsto> k1 * \<tau> + x1, x2 \<leadsto> k2 * \<tau> + x2, t \<leadsto> \<tau> + t])"
  by local_flow_on_auto

lemma tank_flow2 [local_flow]: 
  "local_flow_on [
    t \<leadsto> 1,
    x1 \<leadsto> overall_f, 
    x2 \<leadsto> overall_f2
  ] (x1 +\<^sub>L x2 +\<^sub>L t) UNIV UNIV 
  (\<lambda>\<tau>. [
    x1 \<leadsto> overall_f * \<tau> + x1, 
    x2 \<leadsto> overall_f2 * \<tau> + x2, 
    t \<leadsto> \<tau> + t])"
  by local_flow_on_auto

lemma plant_invariance:
  "H{post_ctrl \<and> t = 0} plant {loop_inv}"
  unfolding plant_def loop_inv_def
  apply (wlp_full local_flow: tank_flow2)
proof(hol_intros; clarify?)
  fix x :: "'st"
    and ta :: "real"
  assume "V2<x>"
    and "V1<x>"
    and "0 \<le> ta"
    and obs: "\<forall>\<tau>. 0 \<le> \<tau> \<and> \<tau> \<le> ta \<longrightarrow> 0 \<le> (f1<x> - f2<x>) * \<tau> + x1<x> 
      \<and> 0 \<le> f2<x> * \<tau> + x2<x> \<and> 0 \<le> f1<x> \<and> 0 \<le> f2<x> \<and> \<tau> \<le> \<epsilon>"
    and "LL \<le> x1<x>"
    and "x1<x> \<le> HH"
    and "LL \<le> x2<x>"
    and "x2<x> \<le> HH"
    and "P<x>"
    and "\<not> (HH - x1<x>) / \<epsilon> < f1<x>"
    and "\<not> f2<x> \<le> FL"
    and "x2<x> \<le> L2 \<and> (LL - x1<x>) / \<epsilon> \<le> f1<x> - f2<x> 
          \<and> FL < f2<x> \<and> f2<x> \<le> (HH - x2<x>) / \<epsilon> 
        \<longrightarrow> P<x>"
    and  "x2<x> \<le> L2 \<longrightarrow> \<not> f1<x> - f2<x> < (LL - x1<x>) / \<epsilon>"
    and "x2<x> \<le> L2 \<longrightarrow> \<not> (HH - x2<x>) / \<epsilon> < f2<x>"
    and  "L2 < x2<x> \<longrightarrow> \<not> f1<x> - f2<x> < (LL - x1<x>) / \<epsilon>"
    and "L2 < x2<x> \<longrightarrow> \<not> (HH - x2<x>) / \<epsilon> < f2<x>"
    and "t<x> = 0"
  hence "f1<x> - f2<x> \<ge> (LL - x1<x>) / \<epsilon>"
    by argo
  hence key: "LL \<le> (f1<x> - f2<x>) * \<epsilon> + x1<x>"
    using eps_ge0
    by (smt (verit) \<open>LL \<le> x1<x>\<close> pos_less_divide_eq 
        zero_le_mult_iff)
  have "ta \<le> \<epsilon>"
    using obs[rule_format, of ta, simplified, OF \<open>0 \<le> ta\<close>]
    by simp
  hence "f1<x> - f2<x> < 0 \<Longrightarrow> (f1<x> - f2<x>) * ta + x1<x> \<ge> (f1<x> - f2<x>) * \<epsilon> + x1<x>"
    using mult_le_cancel_left_neg[of "f1<x> - f2<x>"]
    by simp
  hence goal1: "f1<x> - f2<x> < 0 \<Longrightarrow> LL \<le> (f1<x> - f2<x>) * ta + x1<x>"
    using key 
    by linarith
  have "f1<x> - f2<x> \<ge> 0 \<Longrightarrow> x1<x> \<le> (f1<x> - f2<x>) * ta + x1<x>"
    using \<open>0 \<le> ta\<close>
    by auto
  hence goal2: "f1<x> - f2<x> \<ge> 0 \<Longrightarrow> LL \<le> (f1<x> - f2<x>) * ta + x1<x>"
    using \<open>LL \<le> x1<x>\<close>
    by linarith
  thus goal: "LL \<le> (f1<x> - f2<x>) * ta + x1<x>"
    using goal1 goal2 
    by linarith
next
  fix x :: "'st"
    and ta :: "real"
  assume "V2<x>"
    and "V1<x>"
    and "0 \<le> ta"
    and obs: "\<forall>\<tau>. 0 \<le> \<tau> \<and> \<tau> \<le> ta \<longrightarrow> 0 \<le> (f1<x> - f2<x>) * \<tau> + x1<x> 
      \<and> 0 \<le> f2<x> * \<tau> + x2<x> \<and> 0 \<le> f1<x> \<and> 0 \<le> f2<x> \<and> \<tau> \<le> \<epsilon>"
    and "LL \<le> x1<x>"
    and "x1<x> \<le> HH"
    and "LL \<le> x2<x>"
    and "x2<x> \<le> HH"
    and "P<x>"
    and "\<not> (HH - x1<x>) / \<epsilon> < f1<x>"
    and "\<not> f2<x> \<le> FL"
    and "x2<x> \<le> L2 \<and> (LL - x1<x>) / \<epsilon> \<le> f1<x> - f2<x> \<and> FL < f2<x> 
      \<and> f2<x> \<le> (HH - x2<x>) / \<epsilon> \<longrightarrow> P<x>"
    and "x2<x> \<le> L2 \<longrightarrow> \<not> f1<x> - f2<x> < (LL - x1<x>) / \<epsilon>"
    and "x2<x> \<le> L2 \<longrightarrow> \<not> (HH - x2<x>) / \<epsilon> < f2<x>"
    and "L2 < x2<x> \<longrightarrow> \<not> f1<x> - f2<x> < (LL - x1<x>) / \<epsilon>"
    and "L2 < x2<x> \<longrightarrow> \<not> (HH - x2<x>) / \<epsilon> < f2<x>"
    and "t<x> = 0"
  thus goal1: "(f1<x> - f2<x>) * ta + x1<x> \<le> HH"
    apply (clarsimp simp: field_simps)
    by (smt (verit) mult.commute mult_eq_0_iff mult_le_cancel_left_pos pos_le_divide_eq)
next
  fix x :: "'st"
    and ta :: "real"
  assume "V2<x>"
    and "V1<x>"
    and "0 \<le> ta"
    and "\<forall>\<tau>. 0 \<le> \<tau> \<and> \<tau> \<le> ta \<longrightarrow> 0 \<le> (f1<x> - f2<x>) * \<tau> + x1<x> 
      \<and> 0 \<le> f2<x> * \<tau> + x2<x> \<and> 0 \<le> f1<x> \<and> 0 \<le> f2<x> \<and> \<tau> \<le> \<epsilon>"
    and "LL \<le> x1<x>"
    and "x1<x> \<le> HH"
    and "LL \<le> x2<x>"
    and "x2<x> \<le> HH"
    and "P<x>"
    and "\<not> (HH - x1<x>) / \<epsilon> < f1<x>"
    and "\<not> f2<x> \<le> FL"
    and "x2<x> \<le> L2 \<and> (LL - x1<x>) / \<epsilon> \<le> f1<x> - f2<x> \<and> FL < f2<x> 
      \<and> f2<x> \<le> (HH - x2<x>) / \<epsilon> \<longrightarrow> P<x>"
    and "x2<x> \<le> L2 \<longrightarrow> \<not> f1<x> - f2<x> < (LL - x1<x>) / \<epsilon>"
    and "x2<x> \<le> L2 \<longrightarrow> \<not> (HH - x2<x>) / \<epsilon> < f2<x>"
    and "L2 < x2<x> \<longrightarrow> \<not> f1<x> - f2<x> < (LL - x1<x>) / \<epsilon>"
    and "L2 < x2<x> \<longrightarrow> \<not> (HH - x2<x>) / \<epsilon> < f2<x>"
    and "t<x> = 0"
  thus goal2: "LL \<le> f2<x> * ta + x2<x>"
    apply (clarsimp simp: field_simps)
    by (metis add_increasing2 order.refl zero_le_mult_iff)
next
  fix x :: "'st"
    and ta :: "real"
  assume "V2<x>"
    and "V1<x>"
    and "0 \<le> ta"
    and "\<forall>\<tau>. 0 \<le> \<tau> \<and> \<tau> \<le> ta \<longrightarrow> 0 \<le> (f1<x> - f2<x>) * \<tau> + x1<x> 
      \<and> 0 \<le> f2<x> * \<tau> + x2<x> \<and> 0 \<le> f1<x> \<and> 0 \<le> f2<x> \<and> \<tau> \<le> \<epsilon>"
    and "LL \<le> x1<x>"
    and "x1<x> \<le> HH"
    and "LL \<le> x2<x>"
    and "x2<x> \<le> HH"
    and "P<x>"
    and "\<not> (HH - x1<x>) / \<epsilon> < f1<x>"
    and "\<not> f2<x> \<le> FL"
    and "x2<x> \<le> L2 \<and> (LL - x1<x>) / \<epsilon> \<le> f1<x> - f2<x> \<and> FL < f2<x> 
      \<and> f2<x> \<le> (HH - x2<x>) / \<epsilon> \<longrightarrow> P<x>"
    and "x2<x> \<le> L2 \<longrightarrow> \<not> f1<x> - f2<x> < (LL - x1<x>) / \<epsilon>"
    and "x2<x> \<le> L2 \<longrightarrow> \<not> (HH - x2<x>) / \<epsilon> < f2<x>"
    and "L2 < x2<x> \<longrightarrow> \<not> f1<x> - f2<x> < (LL - x1<x>) / \<epsilon>"
    and "L2 < x2<x> \<longrightarrow> \<not> (HH - x2<x>) / \<epsilon> < f2<x>"
    and "t<x> = 0"
  thus goal3: "f2<x> * ta + x2<x> \<le> HH"
    apply (clarsimp simp: field_simps)
    by (smt (z3) Groups.mult_ac(2) mult_le_0_iff pos_le_divide_eq)
next
  fix x :: "'st"
    and ta :: "real"
  assume "V2<x>"
    and "\<not> V1<x>"
    and "0 \<le> ta"
    and obs: "\<forall>\<tau>. 0 \<le> \<tau> \<and> \<tau> \<le> ta \<longrightarrow> f2<x> * \<tau> \<le> x1<x> 
      \<and> 0 \<le> f2<x> * \<tau> + x2<x> \<and> 0 \<le> f1<x> \<and> 0 \<le> f2<x> \<and> \<tau> \<le> \<epsilon>"
    and "LL \<le> x1<x>"
    and "x1<x> \<le> HH"
    and "LL \<le> x2<x>"
    and "x2<x> \<le> HH"
    and "P<x>"
    and "f1<x> \<le> (HH - x1<x>) / \<epsilon> \<longrightarrow> \<not> x1<x> \<le> L1"
    and "\<not> f2<x> \<le> FL"
    and hyp1: "x2<x> \<le> L2 \<longrightarrow> \<not> - f2<x> < (LL - x1<x>) / \<epsilon>"
    and "x2<x> \<le> L2 \<longrightarrow> \<not> (HH - x2<x>) / \<epsilon> < f2<x>"
    and hyp2: "L2 < x2<x> \<longrightarrow> \<not> - f2<x> < (LL - x1<x>) / \<epsilon>"
    and "L2 < x2<x> \<longrightarrow> \<not> (HH - x2<x>) / \<epsilon> < f2<x>"
    and "t<x> = 0"
  hence "- f2<x> \<ge> (LL - x1<x>) / \<epsilon>"
    by argo
  hence "- f2<x> * \<epsilon> \<ge> (LL - x1<x>)"
    using eps_ge0
    by (metis \<open>LL \<le> x1<x>\<close> le_iff_diff_le_0 less_eq_real_def 
        mult.commute mult_zero_left pos_divide_le_eq)
  hence "LL \<le> x1<x> - f2<x> * \<epsilon>"
    by linarith
  moreover have "... \<le> x1<x> - f2<x> * ta"
    using obs[rule_format, of ta, simplified, OF \<open>0 \<le> ta\<close>]
    by (simp add: \<open>0 \<le> ta\<close> mult_mono)
  ultimately show goal4: "LL \<le> x1<x> - f2<x> * ta"
    by linarith
next
  fix x :: "'st"
    and ta :: "real"
  assume "V2<x>"
    and "\<not> V1<x>"
    and "0 \<le> ta"
    and "\<forall>\<tau>. 0 \<le> \<tau> \<and> \<tau> \<le> ta \<longrightarrow> f2<x> * \<tau> \<le> x1<x> \<and> 0 \<le> f2<x> * \<tau> + x2<x> \<and> 0 \<le> f1<x> \<and> 0 \<le> f2<x> \<and> \<tau> \<le> \<epsilon>"
    and "LL \<le> x1<x>"
    and "x1<x> \<le> HH"
    and "LL \<le> x2<x>"
    and "x2<x> \<le> HH"
    and "P<x>"
    and "f1<x> \<le> (HH - x1<x>) / \<epsilon> \<longrightarrow> \<not> x1<x> \<le> L1"
    and "\<not> f2<x> \<le> FL"
    and "x2<x> \<le> L2 \<longrightarrow> \<not> - f2<x> < (LL - x1<x>) / \<epsilon>"
    and "x2<x> \<le> L2 \<longrightarrow> \<not> (HH - x2<x>) / \<epsilon> < f2<x>"
    and "L2 < x2<x> \<longrightarrow> \<not> - f2<x> < (LL - x1<x>) / \<epsilon>"
    and "L2 < x2<x> \<longrightarrow> \<not> (HH - x2<x>) / \<epsilon> < f2<x>"
    and "t<x> = 0"
  thus goal5: "x1<x> - f2<x> * ta \<le> HH"
    apply (clarsimp simp: field_simps)
    by (metis add_increasing2 mult_sign_intros(1) verit_comp_simplify(2))
next
  fix x :: "'st"
    and ta :: "real"
  assume "V2<x>"
    and "\<not> V1<x>"
    and "0 \<le> ta"
    and "\<forall>\<tau>. 0 \<le> \<tau> \<and> \<tau> \<le> ta \<longrightarrow> f2<x> * \<tau> \<le> x1<x> \<and> 0 \<le> f2<x> * \<tau> + x2<x> \<and> 0 \<le> f1<x> \<and> 0 \<le> f2<x> \<and> \<tau> \<le> \<epsilon>"
    and "LL \<le> x1<x>"
    and "x1<x> \<le> HH"
    and "LL \<le> x2<x>"
    and "x2<x> \<le> HH"
    and "P<x>"
    and "f1<x> \<le> (HH - x1<x>) / \<epsilon> \<longrightarrow> \<not> x1<x> \<le> L1"
    and "\<not> f2<x> \<le> FL"
    and "x2<x> \<le> L2 \<longrightarrow> \<not> - f2<x> < (LL - x1<x>) / \<epsilon>"
    and "x2<x> \<le> L2 \<longrightarrow> \<not> (HH - x2<x>) / \<epsilon> < f2<x>"
    and "L2 < x2<x> \<longrightarrow> \<not> - f2<x> < (LL - x1<x>) / \<epsilon>"
    and "L2 < x2<x> \<longrightarrow> \<not> (HH - x2<x>) / \<epsilon> < f2<x>"
    and "t<x> = 0"
  thus goal6: "LL \<le> f2<x> * ta + x2<x>"
    apply (clarsimp simp: field_simps)
    by (metis add_increasing2 order.refl zero_le_mult_iff)
next
  fix x :: "'st"
    and ta :: "real"
  assume "V2<x>"
    and "\<not> V1<x>"
    and "0 \<le> ta"
    and "\<forall>\<tau>. 0 \<le> \<tau> \<and> \<tau> \<le> ta \<longrightarrow> f2<x> * \<tau> \<le> x1<x> \<and> 0 \<le> f2<x> * \<tau> + x2<x> \<and> 0 \<le> f1<x> \<and> 0 \<le> f2<x> \<and> \<tau> \<le> \<epsilon>"
    and "LL \<le> x1<x>"
    and "x1<x> \<le> HH"
    and "LL \<le> x2<x>"
    and "x2<x> \<le> HH"
    and "P<x>"
    and "f1<x> \<le> (HH - x1<x>) / \<epsilon> \<longrightarrow> \<not> x1<x> \<le> L1"
    and "\<not> f2<x> \<le> FL"
    and "x2<x> \<le> L2 \<longrightarrow> \<not> - f2<x> < (LL - x1<x>) / \<epsilon>"
    and "x2<x> \<le> L2 \<longrightarrow> \<not> (HH - x2<x>) / \<epsilon> < f2<x>"
    and "L2 < x2<x> \<longrightarrow> \<not> - f2<x> < (LL - x1<x>) / \<epsilon>"
    and "L2 < x2<x> \<longrightarrow> \<not> (HH - x2<x>) / \<epsilon> < f2<x>"
    and "t<x> = 0"
  thus goal7: "f2<x> * ta + x2<x> \<le> HH"
    apply (clarsimp simp: field_simps)
    by (smt (verit, ccfv_SIG) mult.commute mult_eq_0_iff pos_le_divide_eq)
next
  fix x :: "'st"
    and ta :: "real"
  assume "\<not> V2<x>"
    and "V1<x>"
    and "0 \<le> ta"
    and "\<forall>\<tau>. 0 \<le> \<tau> \<and> \<tau> \<le> ta \<longrightarrow> 0 \<le> f1<x> * \<tau> + x1<x> \<and> 0 \<le> x2<x> \<and> 0 \<le> f1<x> \<and> 0 \<le> f2<x> \<and> \<tau> \<le> \<epsilon>"
    and "LL \<le> x1<x>"
    and "x1<x> \<le> HH"
    and "LL \<le> x2<x>"
    and "x2<x> \<le> HH"
    and "\<not> P<x>"
    and "\<not> (HH - x1<x>) / \<epsilon> < f1<x>"
    and "f2<x> \<le> FL \<longrightarrow> \<not> P<x>"
    and "FL < f2<x> \<longrightarrow> (LL - x1<x>) / \<epsilon> \<le> f1<x> - f2<x> \<longrightarrow> x2<x> \<le> L2 \<longrightarrow> \<not> f2<x> \<le> (HH - x2<x>) / \<epsilon>"
    and "x2<x> \<le> L2 \<and> f1<x> - f2<x> < (LL - x1<x>) / \<epsilon> \<longrightarrow> \<not> P<x>"
    and "x2<x> \<le> L2 \<and> (HH - x2<x>) / \<epsilon> < f2<x> \<longrightarrow> \<not> P<x>"
    and "L2 < x2<x> \<and> f1<x> - f2<x> < (LL - x1<x>) / \<epsilon> \<longrightarrow> \<not> P<x>"
    and "L2 < x2<x> \<and> (HH - x2<x>) / \<epsilon> < f2<x> \<longrightarrow> \<not> P<x>"
    and "t<x> = 0"
  thus goal8: "LL \<le> f1<x> * ta + x1<x>"
    apply (clarsimp simp: field_simps)
    by (metis add_increasing2 le_numeral_extra(3) zero_le_mult_iff)
next
  fix x :: "'st"
    and ta :: "real"
  assume "\<not> V2<x>"
    and "V1<x>"
    and "0 \<le> ta"
    and "\<forall>\<tau>. 0 \<le> \<tau> \<and> \<tau> \<le> ta \<longrightarrow> 0 \<le> f1<x> * \<tau> + x1<x> \<and> 0 \<le> x2<x> \<and> 0 \<le> f1<x> \<and> 0 \<le> f2<x> \<and> \<tau> \<le> \<epsilon>"
    and "LL \<le> x1<x>"
    and "x1<x> \<le> HH"
    and "LL \<le> x2<x>"
    and "x2<x> \<le> HH"
    and "\<not> P<x>"
    and "\<not> (HH - x1<x>) / \<epsilon> < f1<x>"
    and "f2<x> \<le> FL \<longrightarrow> \<not> P<x>"
    and "FL < f2<x> \<longrightarrow> (LL - x1<x>) / \<epsilon> \<le> f1<x> - f2<x> \<longrightarrow> x2<x> \<le> L2 \<longrightarrow> \<not> f2<x> \<le> (HH - x2<x>) / \<epsilon>"
    and "x2<x> \<le> L2 \<and> f1<x> - f2<x> < (LL - x1<x>) / \<epsilon> \<longrightarrow> \<not> P<x>"
    and "x2<x> \<le> L2 \<and> (HH - x2<x>) / \<epsilon> < f2<x> \<longrightarrow> \<not> P<x>"
    and "L2 < x2<x> \<and> f1<x> - f2<x> < (LL - x1<x>) / \<epsilon> \<longrightarrow> \<not> P<x>"
    and "L2 < x2<x> \<and> (HH - x2<x>) / \<epsilon> < f2<x> \<longrightarrow> \<not> P<x>"
    and "t<x> = 0"
  thus goal9: "f1<x> * ta + x1<x> \<le> HH"
    apply (clarsimp simp: field_simps)
    by (smt (verit) Groups.mult_ac(2) mult_eq_0_iff pos_le_divide_eq)
qed


lemma step_invariance:
  "H{loop_inv} inflow {loop_inv}
  \<Longrightarrow> H{loop_inv} ctrl_safe {post_ctrl}
  \<Longrightarrow> H{post_ctrl \<and> t = 0} plant {loop_inv}
  \<Longrightarrow> H{loop_inv} step_safe {loop_inv}"
  unfolding step_safe_def
  apply normalise_prog
  apply (sequence loop_inv, assumption)
  apply (sequence post_ctrl, assumption)
  apply (sequence "post_ctrl \<and> t = 0")
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

end


end
