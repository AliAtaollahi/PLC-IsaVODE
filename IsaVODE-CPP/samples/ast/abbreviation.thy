abbreviation "down U t \<equiv> {\<tau> \<in> U. \<tau> \<le> t}"

abbreviation "ex_ivl s \<equiv> existence_ivl t\<^sub>0 s"

abbreviation expr_differentiable ("differentiable\<^sub>e") 
  where "expr_differentiable f \<equiv> differentiable\<^sub>e f on id_lens"

abbreviation tsubst2vecf :: "('c::real_normed_vector \<Longrightarrow> 's) 
  \<Rightarrow> (real \<Rightarrow> 's \<Rightarrow> 's) \<Rightarrow> 's \<Rightarrow> real \<Rightarrow> 'c \<Rightarrow> 'c" (infixr "\<down>\<^sub>V\<^sub>e\<^sub>c\<index>" 100)
  where "(F\<down>\<^sub>V\<^sub>e\<^sub>c\<^bsub>x\<^esub> s) t c \<equiv> (F t \<down>\<^sub>S\<^sub>u\<^sub>b\<^sub>s\<^sub>t\<^bsub>x\<^esub> s) c"

abbreviation "partial_deriv_frac x a e\<^sub>i f df
  \<equiv> (f (a + norm (x - a) *\<^sub>R e\<^sub>i) - f a - df (x - a)) /\<^sub>R norm (x - a)"

abbreviation "partial_deriv_exists F e\<^sub>i f df 
  \<equiv> ((\<lambda>x. partial_deriv_frac x (Lim F (\<lambda>x. x)) e\<^sub>i f df) \<longlongrightarrow> 0) F"

(* frechet_derivative is already the derivative operator *)
abbreviation "deriv_frechet F \<equiv> (\<lambda>f. frechet_derivative f F)"

abbreviation power3 :: "'a::power \<Rightarrow> 'a"  (\<open>(\<open>notation=\<open>postfix 2\<close>\<close>_\<^sup>3)\<close> [1000] 999)
  where "x\<^sup>3 \<equiv> x ^ 3"

abbreviation power4 :: "'a::power \<Rightarrow> 'a"  (\<open>(\<open>notation=\<open>postfix 2\<close>\<close>_\<^sup>4)\<close> [1000] 999)
  where "x\<^sup>4 \<equiv> x ^ 4"

abbreviation power5 :: "'a::power \<Rightarrow> 'a"  (\<open>(\<open>notation=\<open>postfix 2\<close>\<close>_\<^sup>5)\<close> [1000] 999)
  where "x\<^sup>5 \<equiv> x ^ 5"

abbreviation g_dl_ode ::"(('a::banach)\<Rightarrow>'a) \<Rightarrow> 'a pred \<Rightarrow> 'a \<Rightarrow> 'a set" 
  ("(1x\<acute>=_ & _)") where "(x\<acute>=f & G) \<equiv> (x\<acute>=(\<lambda>t. f) & G on (\<lambda>s. {t. t \<ge> 0}) UNIV @ 0)"

abbreviation g_dl_ode_inv ::"(('a::banach)\<Rightarrow>'a) \<Rightarrow> 'a pred \<Rightarrow> 'a pred \<Rightarrow> 'a \<Rightarrow> 'a set" ("(1x\<acute>=_ & _ DINV _)") 
  where "(x\<acute>=f & G DINV I) \<equiv> (x\<acute>=(\<lambda>t. f) & G on (\<lambda>s. {t. t \<ge> 0}) UNIV @ 0 DINV I)"

abbreviation g_evol_eqs :: "('c::real_normed_vector \<Longrightarrow> 'b) \<Rightarrow> (real \<Rightarrow> ('c, 'b) expr) \<Rightarrow> 'b pred 
  \<Rightarrow> ('c \<Rightarrow> real set) \<Rightarrow> ('b \<Rightarrow> 'b set)" 
  where "g_evol_eqs a \<phi> G U \<equiv> g_evol_on a (\<lambda>\<tau>. subst_upd [\<leadsto>] a (\<phi> \<tau>)) G U"

abbreviation g_ode_frame :: "('c::banach \<Longrightarrow> 'a) \<Rightarrow> 'a subst \<Rightarrow> ('a \<Rightarrow> bool) \<Rightarrow> ('c \<Rightarrow> real set) 
  \<Rightarrow> 'c set \<Rightarrow> real \<Rightarrow> 'a \<Rightarrow> 'a set" 
  where "g_ode_frame a \<sigma> G U S t\<^sub>0 \<equiv> g_orbital_on a (\<lambda>t. \<sigma>) G U S t\<^sub>0"

abbreviation g_ode_on :: "('c::banach \<Longrightarrow> 'a) \<Rightarrow> ('a \<Rightarrow> 'c) \<Rightarrow> ('a \<Rightarrow> bool) \<Rightarrow> ('c \<Rightarrow> real set) 
  \<Rightarrow> 'c set \<Rightarrow> real \<Rightarrow> 'a \<Rightarrow> 'a set"
  where "g_ode_on a f G U S t\<^sub>0 \<equiv> g_ode_frame a (subst_upd [\<leadsto>] a f) G U S t\<^sub>0"

abbreviation g_dl_ode_frame :: "('c::banach \<Longrightarrow> 'a) \<Rightarrow> 'a subst \<Rightarrow> ('a \<Rightarrow> bool) \<Rightarrow> 'a \<Rightarrow> 'a set"
  where "g_dl_ode_frame a \<sigma> G \<equiv> g_ode_frame a \<sigma> G ({t. 0 \<le> t})\<^sub>e UNIV 0"

abbreviation g_dl_ode_on :: "('c::banach \<Longrightarrow> 'a) \<Rightarrow> ('a \<Rightarrow> 'c) \<Rightarrow> ('a \<Rightarrow> bool) \<Rightarrow> 'a \<Rightarrow> 'a set"
  where "g_dl_ode_on a f G \<equiv> g_ode_on a f G ({t. 0 \<le> t})\<^sub>e UNIV 0"

abbreviation "\<phi>\<^sub>m\<^sub>a\<^sub>x \<equiv> pi / 3"      

abbreviation "m \<equiv> 12"            \<comment> \<open> Mass \<close>
abbreviation "S \<equiv> 1.5"           \<comment> \<open> Maximum speed \<close>
abbreviation "\<phi>\<^sub>\<epsilon> \<equiv> 0.001"        \<comment> \<open> Angular tolerance \<close>
abbreviation "s\<^sub>\<epsilon> \<equiv> 0.001"        \<comment> \<open> Linear tolerance \<close>

abbreviation "kp\<^sub>g\<^sub>v \<equiv> 5"
abbreviation "kp\<^sub>g\<^sub>r \<equiv> 5"

abbreviation "w\<^sub>\<epsilon> \<equiv> 0.5" \<comment> \<open> Waypoint tolerance \<close>

abbreviation "w\<^sub>x \<equiv> mat_lens 0 0 ;\<^sub>L nextWP"
abbreviation "w\<^sub>y \<equiv> mat_lens 0 1 ;\<^sub>L nextWP"

abbreviation "p\<^sub>x \<equiv> mat_lens 0 0 ;\<^sub>L p"
abbreviation "p\<^sub>y \<equiv> mat_lens 0 1 ;\<^sub>L p"

abbreviation "v\<^sub>x \<equiv> mat_lens 0 0 ;\<^sub>L v"
abbreviation "v\<^sub>y \<equiv> mat_lens 0 1 ;\<^sub>L v"

abbreviation "a\<^sub>x \<equiv> mat_lens 0 0 ;\<^sub>L a"
abbreviation "a\<^sub>y \<equiv> mat_lens 0 1 ;\<^sub>L a"

abbreviation "\<phi>\<^sub>A\<^sub>V \<equiv> (angOfVec v)\<^sub>e"
abbreviation "\<phi>\<^sub>W\<^sub>P \<equiv> (angOfVec (v - nextWP))\<^sub>e"

abbreviation "\<omega> \<equiv> (if (\<parallel>v\<parallel> = 0) then 0 else arccos((v + a) \<bullet> v / (\<parallel>v + a\<parallel> * \<parallel>v\<parallel>)))\<^sub>e"

abbreviation "ax\<^sub>A\<^sub>V \<equiv> (t < \<epsilon> \<and> s *\<^sub>R \<^bold>[[sin(\<phi>), cos(\<phi>)]\<^bold>] = v \<and> 0 \<le> s \<and> s \<le> S)\<^sup>e"

abbreviation "ODE \<equiv>
   { p` = v
   , v` = a
   , a` = 0
   , \<phi>` = @\<omega>
   , s` = if s \<noteq> 0 then (v \<bullet> a) / s else \<parallel>a\<parallel>
   , t` = 1 
   | @ax\<^sub>A\<^sub>V }"

abbreviation "Kinematics \<equiv> t ::= 0 ; ODE"

abbreviation "atWP \<equiv> (\<parallel>nextWP - p\<parallel> < w\<^sub>\<epsilon>)\<^sup>e"

abbreviation "steerToWP \<equiv> rh ::= angOfVec(nextWP - p)" \<comment> \<open> Calculation of heading \<close>

abbreviation "FullStop \<equiv> (rs ::= 0)"

abbreviation "NextWayPoint \<equiv> 
  (IF (path = []) THEN FullStop ELSE nextWP ::= hd(path); path ::= tl(path); steerToWP)"

abbreviation
  "Navigation \<equiv> (IF @atWP THEN NextWayPoint ELSE steerToWP)"


abbreviation 
  "LRE \<equiv> (\<questiondown>mode = HCM? ; rs ::= 0.1 ; steerToWP)
       \<sqinter> (\<questiondown>mode = OCM? ; skip)
       \<sqinter> (\<questiondown>mode = MOM? ; rs ::= 1 ; steerToWP ;
             IF (\<exists> o. o \<in> obsReg \<and> \<parallel>p - o\<parallel> \<le> 7.5) THEN mode ::= HCM ; rs ::= 0.1 ELSE skip)"

abbreviation "AP \<equiv> 
  IF \<parallel>rs - s\<parallel> > s\<^sub>\<epsilon>
    THEN ft ::= sgn(rs - s)*min(kp\<^sub>g\<^sub>v * \<parallel>rs - s\<parallel>) f\<^sub>m\<^sub>a\<^sub>x
    ELSE ft ::= 0 ;
  IF \<parallel>rh - \<phi>\<parallel> > \<phi>\<^sub>\<epsilon>
    THEN fl ::= sgn(rh - \<phi>)*min(kp\<^sub>g\<^sub>r * \<parallel>rh - \<phi>\<parallel>) f\<^sub>m\<^sub>a\<^sub>x
    ELSE fl ::= 0 ;
  F ::= fl *\<^sub>R \<^bold>[[cos(\<phi>), sin(\<phi>)]\<^bold>] 
      + ft *\<^sub>R \<^bold>[[sin(\<phi>), cos(\<phi>)]\<^bold>] ;
  a ::= F /\<^sub>R m"

abbreviation "AMV \<equiv> (Navigation ; LRE ; AP ; Kinematics)\<^sup>*"

abbreviation "angOfVec \<equiv> vangle \<^bold>[[0::real,100]\<^bold>]"

abbreviation "\<phi>\<^sub>m\<^sub>a\<^sub>x \<equiv> pi / 3"      

abbreviation "ax \<equiv> (s *\<^sub>R \<^bold>[[sin(\<phi>), cos(\<phi>)]\<^bold>] = v \<and> 0 \<le> s \<and> s \<le> S)\<^sup>e"

abbreviation "\<omega> \<equiv> (if (\<parallel>v\<parallel> = 0) then 0 else arccos((v + a) \<bullet> v / (\<parallel>v + a\<parallel> * \<parallel>v\<parallel>)))\<^sub>e"

abbreviation "ODE \<equiv>
   { p` = v
   , v` = a
   , a` = 0
   , \<phi>` = @\<omega>
   , s` = if s \<noteq> 0 then (v \<bullet> a) / s else \<parallel>a\<parallel>
   | @ax }"

abbreviation "Autopilot \<equiv> rs ::= 1; rs ::= 0"

abbreviation "exp_flow \<tau> \<equiv> [x \<leadsto> x * exp (- \<tau>)]"

abbreviation "ctrl \<equiv> push ::= ?; IF (1/2 * (\<omega> - push)\<^sup>2 < g / L * cos(\<theta>)) THEN \<omega> ::= \<omega> - push ELSE skip"

abbreviation "ode \<equiv> {\<theta>` = \<omega>, \<omega>` = -g/L * sin(\<theta>) - k * \<omega> | -pi \<le> \<theta> \<and> \<theta> \<le> pi}"

abbreviation "program \<equiv> LOOP (ctrl ; ode) INV (-pi \<le> \<theta> \<and> \<theta> \<le> pi \<and> g / L * (1 - cos(\<theta>)) + (1/2 * \<omega>\<^sup>2) < g / L)"

abbreviation "invariant \<equiv> (-pi \<le> \<theta> \<and> \<theta> \<le> pi \<and> (g / L * (1 - cos(\<theta>)) + (1/2 * \<omega>\<^sup>2) < g / L))\<^sup>e"

abbreviation "pend_flow \<tau> \<equiv> [
  x \<leadsto> x * cos \<tau> + y * sin \<tau>, 
  y \<leadsto> - x * sin \<tau> + y * cos \<tau>]"

abbreviation "time_up \<equiv> (T\<^sub>M - T\<^sub>m) / K\<^sub>u\<^sub>p"  (* t\<^sub>u\<^sub>p *)

abbreviation "time_up_down1 \<equiv> time_up + (T\<^sub>M - T\<^sub>m) / K\<^sub>1"  (* t\<^sub>\<up>\<^sub>\<down>\<^sub>1 *)

abbreviation "time_up_down2 \<equiv> time_up + (T\<^sub>M - T\<^sub>m) / K\<^sub>2"  (* t\<^sub>\<up>\<^sub>\<down>\<^sub>2 *)

abbreviation "cycle1 \<equiv> time_up + time_up_down1" (* t\<^sub>c\<^sub>1 *)

abbreviation "cycle2 \<equiv> time_up + time_up_down2" (* t\<^sub>c\<^sub>2 *)

abbreviation "time_up \<equiv> (T\<^sub>M - T\<^sub>m) / K\<^sub>u\<^sub>p"

abbreviation "time_up_down1 \<equiv> time_up + (T\<^sub>M - T\<^sub>m) / K\<^sub>1"

abbreviation "time_up_down2 \<equiv> time_up + (T\<^sub>M - T\<^sub>m) / K\<^sub>2"

abbreviation "cycle1 \<equiv> time_up + time_up_down1"

abbreviation "cycle2 \<equiv> time_up + time_up_down2"

abbreviation "ode \<equiv> {y` = v, v` = m, t` = 1, m` = - k | (t \<ge> 0)}"

abbreviation "flow \<tau> \<equiv> 
  [y \<leadsto> -k*\<tau>\<^sup>3/6 + m*\<tau>\<^sup>2/2 + v *\<tau> + y, 
  v \<leadsto> -k*\<tau>\<^sup>2/2 + m*\<tau> + v, 
  t \<leadsto> \<tau> + t, 
  m \<leadsto> -k*\<tau> + m]"

abbreviation "dyn \<equiv> IF \<not> active 
  THEN {T` = - K * T | Tmin \<le> T} 
  ELSE {T` = - K * (T - L) | T \<le> Tmax}"

abbreviation "ctrl \<equiv> 
  IF \<not> active \<and> T \<le> Tmin THEN active ::= True
  ELSE IF active \<and> T \<ge> Tmax THEN active ::= False ELSE skip"

abbreviation "dyn \<equiv> IF \<not> active 
  THEN {T` = - K * T, t` = 1 | t \<le> - (ln (Tmin/temp))/K} 
  ELSE {T` = - K * (T - L), t` = 1 | t \<le> - (ln ((L - Tmax)/(L - temp)))/K}"

abbreviation "decide \<equiv> 
  IF \<not> active \<and> temp \<le> Tmin + 1 THEN active ::= True
  ELSE IF active \<and> temp \<ge> Tmax - 1 THEN active ::= False ELSE skip"

abbreviation "ctrl \<equiv> t ::= 0; temp ::= T; decide"

(* Temperature advances at most \<epsilon> units upwards or downwards 
before our sensor makes a measurement. *)
abbreviation "dyn \<equiv> IF \<not> active 
  THEN {T` = - K * T, t` = 1 | t \<le> - ln (1 - \<epsilon> / temp) / K} 
  ELSE {T` = - K * (T - L), t` = 1 | t \<le> - ln (\<epsilon> / (temp - L) + 1) / K}"

abbreviation "close_to_Tmin \<T> \<equiv> \<T> \<le> Tmin + 1.1 * \<epsilon>"
abbreviation "close_to_Tmax \<T> \<equiv> \<T> \<ge> Tmax - 1.1 * \<epsilon>"

abbreviation "decide \<equiv> 
  IF \<not> active \<and> close_to_Tmin temp THEN active ::= True
  ELSE IF active \<and> close_to_Tmax temp THEN active ::= False ELSE skip"

abbreviation "ctrl \<equiv> t ::= 0; temp ::= T; decide"

abbreviation "ctrl \<equiv>
  IF \<not> active \<and> h \<le> Hmin THEN active := True
  ELSE IF active \<and> h \<ge> Hmax THEN active := False"

abbreviation "dyn \<equiv> IF \<not> active 
  THEN {h` = - c\<^sub>o | h \<ge> Hmin}
  ELSE {h` = c\<^sub>i - c\<^sub>o | h \<le> Hmax}"

abbreviation "ctrl \<equiv> t := 0; height := h;
  IF \<not> active \<and> height \<le> Hmin THEN active := True
  ELSE IF active \<and> height \<ge> Hmax THEN active := False"

abbreviation "dyn \<equiv> IF \<not> active 
  THEN {h` = - c\<^sub>o, t` = 1 | t \<le> (Hmin - height)/(- c\<^sub>o)}
  ELSE {h` = c\<^sub>i - c\<^sub>o, t` = 1 | t \<le> (Hmax - height)/(c\<^sub>i - c\<^sub>o)}"

abbreviation "ctrl \<equiv> t := 0; height := h;
  IF \<not> active \<and> height \<le> Hmin + 1.1 * \<epsilon> THEN active := True
  ELSE IF active \<and> height \<ge> Hmax - 1.1 * \<epsilon> THEN active := False"

abbreviation "dyn \<equiv> IF \<not> active 
  THEN {h` = - c\<^sub>o, t` = 1 | t \<le> \<epsilon>/(- c\<^sub>o)}
  ELSE {h` = c\<^sub>i - c\<^sub>o, t` = 1 | t \<le> \<epsilon>/(c\<^sub>i - c\<^sub>o)}"

abbreviation "ctrl \<equiv> t := 0; height := h;
  IF \<not> active \<and> height \<le> Hmin + c\<^sub>o * \<epsilon> THEN active := True
  ELSE IF active \<and> height \<ge> Hmax - (c\<^sub>i - c\<^sub>o) * \<epsilon> THEN active := False"

abbreviation "dyn \<equiv> IF \<not> active 
  THEN {h` = - c\<^sub>o, t` = 1 | t \<le> \<epsilon>}
  ELSE {h` = c\<^sub>i - c\<^sub>o, t` = 1 | t \<le> \<epsilon>}"

(* x+z>=0 -> [{x'=x^2, z' = z*x+y & y = x^2}] x+z>=0 *)
abbreviation (input) darboux_ineq_f2 :: "real ^ 2 \<Rightarrow> real ^ 2" ("f")
  where "f \<equiv> [x \<leadsto> x\<^sup>2, z \<leadsto> z*x + x\<^sup>2]"

abbreviation darboux_ineq_flow2 :: "real \<Rightarrow> real ^ 2 \<Rightarrow> real ^ 2" ("\<phi>")
  where "\<phi> t \<equiv> [x \<leadsto> x / (1 - t * x), z \<leadsto> (z - x * ln(1 - t * x))/(1 - t * x)]"

(* Real stopDist(Real v) = v^2/(2*b) *)
abbreviation "stopDist w \<equiv> w\<^sup>2/(2*b)"

(* Real accCompensation(Real v) = (((A/b) + 1)*((A/2)*ep^2 + ep*v)) *)
abbreviation "accCompensation w \<equiv> ((A/b) + 1) * ((A/2)*\<epsilon>\<^sup>2 + \<epsilon> * w)"

(* Real SB(Real v) = stopDist(v) + accCompensation(v) *)
abbreviation "SB w \<equiv> stopDist w + accCompensation w"

(* initial(Real m, Real z, Real v) <-> (v >= 0 & m-z >= stopDist(v) & b>0 & A>=0 & ep>=0) *)
abbreviation "initial \<equiv> (v \<ge> 0 \<and> (m - z) \<ge> stopDist v \<and> b > 0 \<and> A \<ge> 0 \<and> \<epsilon> \<ge> 0)\<^sub>e"
\<comment> \<open> initial states \<close>

(* Bool safe(Real m, Real z, Real v, Real d) <-> (z >= m -> v <= d) *)
abbreviation "safe \<mu> \<zeta> w \<delta> \<equiv> \<zeta> \<ge> \<mu> \<longrightarrow> w \<le> \<delta>" 

(* Bool loopInv(Real m, Real z, Real v) <-> (v >= 0 & m-z >= stopDist(v) *)
abbreviation "loopInv \<equiv> (v \<ge> 0 \<and> m - z \<ge> stopDist v)\<^sub>e"
\<comment> \<open> always maintain sufficient stopping distance \<close>

(* HP ctrl ::= {?m - z <= SB(v); a := -b; ++ ?m - z >= SB(v); a :=  A; *)
abbreviation "ctrl \<equiv> (\<questiondown>m - z \<le> SB(v)?; a ::= -b) \<sqinter> (\<questiondown>m - z \<ge> SB(v)?; a ::= A)"
\<comment> \<open> train controller \<close>

(* HP drive ::= {t := 0;{z'=v, v'=a, t'=1  & v >= 0 & t <= ep} *)
abbreviation "drive \<equiv> (t ::= 0);{z` = v, v` = a, t` = 1 | (v \<ge> 0 \<and> t \<le> \<epsilon>)}"

(* Bool Assumptions(Real v, Real d) <-> ( v>=0 & d>=0 & b>0 ) *)
abbreviation "Assumptions d \<equiv> (v \<ge> 0 \<and> d \<ge> 0 \<and> b > 0)\<^sub>e"

(* Bool Controllable(Real m, Real z, Real v, Real d) <-> (v^2-d^2 <= 2*b*(m-z) & Assumptions(v, d)) *)
abbreviation "Controllable d \<equiv> (v\<^sup>2 -d\<^sup>2 \<le> 2*b*(m-z) \<and> @(Assumptions d))\<^sub>e"


abbreviation mtx_hosc :: "2 sq_mtx" ("A")
  where "A \<equiv> mtx  
   ([0, 1] # 
    [a, b] # [])"

abbreviation "x_sol t x1 y1 \<equiv> 
    (1/discr) * x1 * \<iota>\<^sub>2 * exp (t * \<iota>\<^sub>1) - (1/discr) * x1 * \<iota>\<^sub>1 * exp (t * \<iota>\<^sub>2)
  + (1/discr) * y1 * exp (t * \<iota>\<^sub>2) - (1/discr) * y1 * exp (t * \<iota>\<^sub>1)"

abbreviation "y_sol t x1 y1 \<equiv> 
    (1/discr) * x1 * a * exp (t * \<iota>\<^sub>2) - (1/discr) * x1 * a * exp (t * \<iota>\<^sub>1)
  + (1/discr) * y1 * \<iota>\<^sub>2 * exp (t * \<iota>\<^sub>2) - (1/discr) * y1 * \<iota>\<^sub>1 * exp (t * \<iota>\<^sub>1)"

abbreviation "\<Phi> t \<equiv> mtx (
   [\<iota>\<^sub>2*exp(t*\<iota>\<^sub>1) - \<iota>\<^sub>1*exp(t*\<iota>\<^sub>2),     exp(t*\<iota>\<^sub>2)-exp(t*\<iota>\<^sub>1)]#
   [a*exp(t*\<iota>\<^sub>2) - a*exp(t*\<iota>\<^sub>1), \<iota>\<^sub>2*exp(t*\<iota>\<^sub>2)-\<iota>\<^sub>1*exp(t*\<iota>\<^sub>1)]#[])"

abbreviation chB_hosc :: "real \<Rightarrow> real \<Rightarrow> 2 sq_mtx" ("P")
  where "P a1 a2 \<equiv> mtx
   ([a1, a2] # 
    [1, 1] # [])"

(* { x' = v, v' = -Kp*(x-xr) - Kd*v & v >= 0 } *)
abbreviation "f9 Kd Kp \<equiv> [x \<leadsto> v, v \<leadsto> -Kp * (x - c) - Kd * v, c \<leadsto> 0]"

abbreviation "flow9 \<tau> \<equiv> [
  x \<leadsto> exp ((-2)*\<tau>) * (c - 2 * (exp \<tau>) * c + (exp (2 * \<tau>)) * c - v + (exp \<tau>) * v - x + 2 * (exp \<tau>) * x), 
  v \<leadsto> exp ((-2)*\<tau>) * (-2 * c + 2 * (exp \<tau>) * c + 2 * v - (exp \<tau>) * v + 2* x - 2 * (exp \<tau>) * x),
  c \<leadsto> c]"

abbreviation po_exp_dec_f :: "real^2 \<Rightarrow> real^2" ("f")
  where "f s \<equiv> (\<chi> i. if i=1 then -s$1 else 0)"

abbreviation po_exp_dec_flow :: "real \<Rightarrow> real^2 \<Rightarrow> real^2" ("\<phi>")
  where "\<phi> t s \<equiv> (\<chi> i. if i=1 then s$1 * exp (- t) else s$i)"

abbreviation triple_int_f :: "real^4 \<Rightarrow> real^4" ("f")
  where "f s \<equiv> (\<chi> i. if i = 1 then s$2 else 
    (if i = 2 then s$3 else (if i = 3 then s$4 else (s$4)\<^sup>2)))"

abbreviation darboux_ineq_f :: "real^2 \<Rightarrow> real^2" ("f")
  where "f s \<equiv> (\<chi> i. if i=1 then (s$1)^2 else (s$2)*(s$1)+(s$1)^2)"

abbreviation darboux_ineq_flow2 :: "real \<Rightarrow> real^2 \<Rightarrow> real^2" ("\<phi>")
  where "\<phi> t s \<equiv> (\<chi> i. if i=1 then (s$1/(1 - t * s$1)) else
      (s$2 - s$1 * ln(1 - t * s$1))/(1 - t * s$1))"

abbreviation LICS_Ex4c_f :: "real \<Rightarrow> real \<Rightarrow> real^4 \<Rightarrow> real^4" ("f")
  where "f time acc s \<equiv> (\<chi> i. if i=1 then s$2 else (if i=2 then acc else if i=3 then 0 else time))"

(* Real stopDist(Real v) = v^2/(2*b) *)
abbreviation "stopDist v \<equiv> v^2/(2*b)"

(* Real accCompensation(Real v) = (((A/b) + 1)*((A/2)*ep^2 + ep*v)) *)
abbreviation "accCompensation v \<equiv> ((A/b) + 1) * ((A/2)*\<epsilon>^2 + \<epsilon> * v)"

(* Real SB(Real v) = stopDist(v) + accCompensation(v) *)
abbreviation "SB v \<equiv> stopDist v + accCompensation v"

(* initial(Real m, Real z, Real v) <-> (v >= 0 & m-z >= stopDist(v) & b>0 & A>=0 & ep>=0) *)
abbreviation "initial m' z v \<equiv> (v \<ge> 0 \<and> (m' - z) \<ge> stopDist v)" (* Initial states *)

(* Bool safe(Real m, Real z, Real v, Real d) <-> (z >= m -> v <= d) *)
abbreviation "safe m' z v \<delta> \<equiv> z \<ge> m' \<longrightarrow> v \<le> \<delta>" 

(* Bool loopInv(Real m, Real z, Real v) <-> (v >= 0 & m-z >= stopDist(v) *)
abbreviation "loopInv m' z v \<equiv> v \<ge> 0 \<and> m' - z \<ge> stopDist v" (* always maintain sufficient stopping distance *)

(*HP ctrl ::= {?m - z <= SB(v); a := -b; ++ ?m - z >= SB(v); a :=  A; *)
abbreviation "ctrl s \<equiv> (\<questiondown>\<lambda>s::real^4. m - s$1 \<le> SB (s$2)?;(3 ::= (\<lambda>s. -b))) s \<union> 
 (\<questiondown>\<lambda>s. m - s$1 \<ge> SB (s$2)?;(3 ::= (\<lambda>s. A))) s" (* train controller *)

(* HP drive ::= {t := 0;{z'=v, v'=a, t'=1  & v >= 0 & t <= ep} *)
abbreviation "drive \<equiv> (4 ::= (\<lambda>s. 0));
  (x\<acute>= (\<lambda>s::real^4. \<chi> i. if i=1 then s$2 else (if i=2 then s$3 else (if i=3 then 0 else 1))) 
  & (\<lambda>s. s$2 \<ge> 0 \<and> s$4 \<le> \<epsilon>))"

(* Bool Assumptions(Real v, Real d) <-> ( v>=0 & d>=0 & b>0 ) *)
abbreviation "assumptions v \<delta> \<equiv> (v \<ge> 0 \<and> \<delta> \<ge> 0 \<and> b > 0)" 

(* Bool Controllable(Real m, Real z, Real v, Real d) <-> (v^2-d^2 <= 2*b*(m-z) & Assumptions(v, d)) *)
abbreviation "controllable m' z v \<delta> \<equiv> v^2 - \<delta>^2 \<le> 2 * b * (m' - z) \<and> assumptions v \<delta>"

(* x+z>=0 -> [{x'=x^2, z' = z*x+y & y = x^2}] x+z>=0 *)
abbreviation (input) darboux_ineq_f2 :: "real ^ 2 \<Rightarrow> real ^ 2" ("f")
  where "f \<equiv> [x \<leadsto> x\<^sup>2, z \<leadsto> z*x + x\<^sup>2]"

abbreviation darboux_ineq_flow2 :: "real \<Rightarrow> real ^ 2 \<Rightarrow> real ^ 2" ("\<phi>")
  where "\<phi> t \<equiv> [x \<leadsto> x / (1 - t * x), z \<leadsto> (z - x * ln(1 - t * x))/(1 - t * x)]"

(* Real stopDist(Real v) = v^2/(2*b) *)
abbreviation "stopDist w \<equiv> w\<^sup>2/(2*b)"

(* Real accCompensation(Real v) = (((A/b) + 1)*((A/2)*ep^2 + ep*v)) *)
abbreviation "accCompensation w \<equiv> ((A/b) + 1) * ((A/2)*\<epsilon>\<^sup>2 + \<epsilon> * w)"

(* Real SB(Real v) = stopDist(v) + accCompensation(v) *)
abbreviation "SB w \<equiv> stopDist w + accCompensation w"

(* initial(Real m, Real z, Real v) <-> (v >= 0 & m-z >= stopDist(v) & b>0 & A>=0 & ep>=0) *)
abbreviation "initial \<equiv> (v \<ge> 0 \<and> (m - z) \<ge> stopDist v \<and> b > 0 \<and> A \<ge> 0 \<and> \<epsilon> \<ge> 0)\<^sub>e"
\<comment> \<open> initial states \<close>

(* Bool safe(Real m, Real z, Real v, Real d) <-> (z >= m -> v <= d) *)
abbreviation "safe \<mu> \<zeta> w \<delta> \<equiv> \<zeta> \<ge> \<mu> \<longrightarrow> w \<le> \<delta>" 

(* Bool loopInv(Real m, Real z, Real v) <-> (v >= 0 & m-z >= stopDist(v) *)
abbreviation "loopInv \<equiv> (v \<ge> 0 \<and> m - z \<ge> stopDist v)\<^sub>e"
\<comment> \<open> always maintain sufficient stopping distance \<close>

(* HP ctrl ::= {?m - z <= SB(v); a := -b; ++ ?m - z >= SB(v); a :=  A; *)
abbreviation "ctrl \<equiv> (\<questiondown>m - z \<le> SB(v)?; a ::= -b) \<sqinter> (\<questiondown>m - z \<ge> SB(v)?; a ::= A)"
\<comment> \<open> train controller \<close>

(* HP drive ::= {t := 0;{z'=v, v'=a, t'=1  & v >= 0 & t <= ep} *)
abbreviation "drive \<equiv> (t ::= 0);{z` = v, v` = a, t` = 1 | (v \<ge> 0 \<and> t \<le> \<epsilon>)}"

(* Bool Controllable(Real m, Real z, Real v, Real d) <-> (v^2-d^2 <= 2*b*(m-z) & Assumptions(v, d)) *)
abbreviation "Controllable d \<equiv> (v\<^sup>2 -d\<^sup>2 \<le> 2*b*(m-z) \<and> @(Assumptions d))\<^sub>e"


abbreviation mtx_hosc :: "2 sq_mtx" ("A")
  where "A \<equiv> mtx  
   ([0, 1] # 
    [a, b] # [])"

abbreviation "x_sol t x1 y1 \<equiv> 
    (1/discr) * x1 * \<iota>\<^sub>2 * exp (t * \<iota>\<^sub>1) - (1/discr) * x1 * \<iota>\<^sub>1 * exp (t * \<iota>\<^sub>2)
  + (1/discr) * y1 * exp (t * \<iota>\<^sub>2) - (1/discr) * y1 * exp (t * \<iota>\<^sub>1)"

abbreviation "y_sol t x1 y1 \<equiv> 
    (1/discr) * x1 * a * exp (t * \<iota>\<^sub>2) - (1/discr) * x1 * a * exp (t * \<iota>\<^sub>1)
  + (1/discr) * y1 * \<iota>\<^sub>2 * exp (t * \<iota>\<^sub>2) - (1/discr) * y1 * \<iota>\<^sub>1 * exp (t * \<iota>\<^sub>1)"

abbreviation "\<Phi> t \<equiv> mtx (
   [\<iota>\<^sub>2*exp(t*\<iota>\<^sub>1) - \<iota>\<^sub>1*exp(t*\<iota>\<^sub>2),     exp(t*\<iota>\<^sub>2)-exp(t*\<iota>\<^sub>1)]#
   [a*exp(t*\<iota>\<^sub>2) - a*exp(t*\<iota>\<^sub>1), \<iota>\<^sub>2*exp(t*\<iota>\<^sub>2)-\<iota>\<^sub>1*exp(t*\<iota>\<^sub>1)]#[])"

abbreviation chB_hosc :: "real \<Rightarrow> real \<Rightarrow> 2 sq_mtx" ("P")
  where "P a1 a2 \<equiv> mtx
   ([a1, a2] # 
    [1, 1] # [])"

(* { x' = v, v' = -Kp*(x-xr) - Kd*v & v >= 0 } *)
abbreviation "f9 Kd Kp \<equiv> [x \<leadsto> v, v \<leadsto> -Kp * (x - c) - Kd * v, c \<leadsto> 0]"

abbreviation "flow9 \<tau> \<equiv> [
  x \<leadsto> exp ((-2)*\<tau>) * (c - 2 * (exp \<tau>) * c + (exp (2 * \<tau>)) * c - v + (exp \<tau>) * v - x + 2 * (exp \<tau>) * x), 
  v \<leadsto> exp ((-2)*\<tau>) * (-2 * c + 2 * (exp \<tau>) * c + 2 * v - (exp \<tau>) * v + 2* x - 2 * (exp \<tau>) * x),
  c \<leadsto> c]"

abbreviation (input) real_of_bool :: "bool \<Rightarrow> real" where "real_of_bool \<equiv> of_bool"


abbreviation "pend_flow \<tau> \<equiv> [
  x \<leadsto> x * cos \<tau> + y * sin \<tau>, 
  y \<leadsto> - x * sin \<tau> + y * cos \<tau>]"

abbreviation fball :: "real ^ 2 \<Rightarrow> real ^ 2" ("f")
  where "fball \<equiv> [y \<leadsto> v, v \<leadsto> - \<guillemotleft>g\<guillemotright>]"

abbreviation ball_loop_inv :: "real ^ 2 \<Rightarrow> bool" ("I")
  where "I \<equiv> (v\<^sup>2 \<le> 2 * \<guillemotleft>g\<guillemotright> * (\<guillemotleft>H\<guillemotright> - y))\<^sub>e"

\<comment> \<open>Verified with differential invariants in @{text "\<real>\<^sup>2"} \<close>

abbreviation "BBall_dinv \<equiv> 
  LOOP (
    (x\<acute>= f & (0 \<le> y)\<^sub>e DINV I); 
    IF v = 0 THEN v ::= - \<guillemotleft>c\<guillemotright> * v ELSE skip) 
  INV (0 \<le> y \<and> v\<^sup>2 \<le> 2 * \<guillemotleft>g\<guillemotright> * (\<guillemotleft>H\<guillemotright> - y))"

abbreviation ball_flow :: "real \<Rightarrow> real ^ 2 \<Rightarrow> real ^ 2" ("\<phi>")
  where "\<phi> \<tau> \<equiv> [
  y \<leadsto> - \<guillemotleft>g\<guillemotright> * \<guillemotleft>\<tau>\<guillemotright>\<^sup>2 / 2 + v * \<guillemotleft>\<tau>\<guillemotright> + y, 
  v \<leadsto> - \<guillemotleft>g\<guillemotright> * \<guillemotleft>\<tau>\<guillemotright> + v]"

abbreviation "BBall_dyn \<equiv> 
  LOOP (
    (EVOL \<phi> (0 \<le> y)\<^sub>e (\<lambda>s. UNIV)); 
    IF v = 0 THEN v ::= - \<guillemotleft>c\<guillemotright> * v ELSE skip) 
  INV (0 \<le> y \<and> v\<^sup>2 \<le> 2 * \<guillemotleft>g\<guillemotright> * (\<guillemotleft>H\<guillemotright> - y))"

abbreviation "BBall \<equiv> 
  LOOP (
    (x\<acute>= f & (0 \<le> y)\<^sub>e); 
    IF v = 0 THEN v ::= - \<guillemotleft>c\<guillemotright> * v ELSE skip) 
  INV (0 \<le> y \<and> v\<^sup>2 \<le> 2 * \<guillemotleft>g\<guillemotright> * (\<guillemotleft>H\<guillemotright> - y))"

abbreviation dfball :: "real ^ 2 \<Rightarrow> real ^ 2" ("df")
  where "dfball \<equiv> [y \<leadsto> v, v \<leadsto> 0]"

abbreviation therm_vec_field :: "real \<Rightarrow> real^4 \<Rightarrow> real^4" ("f")
  where "f c \<equiv> [T \<leadsto> - a * (T - c), t \<leadsto> 1, \<theta> \<leadsto> 0, T\<^sub>0 \<leadsto> 0]"

abbreviation therm_flow2 :: "real \<Rightarrow> real \<Rightarrow> real^4 \<Rightarrow> real^4" ("\<phi>")
  where "\<phi> c \<tau> \<equiv> [
  T \<leadsto> - exp(-a * \<tau>) * (c - T) + c,
  t \<leadsto> \<tau> + t,
  \<theta> \<leadsto> \<theta>,
  T\<^sub>0 \<leadsto> T\<^sub>0]"

abbreviation dftherm :: "real \<Rightarrow> real ^ 4 \<Rightarrow> real ^ 4" ("df")
  where "dftherm c \<equiv> [T \<leadsto> - a * T, t \<leadsto> 0, \<theta> \<leadsto> 0, T\<^sub>0 \<leadsto> 0]"

abbreviation "therm_ctrl \<equiv> ((t ::= 0);(T\<^sub>0 ::= T);
    (IF \<theta> = 0 \<and> T\<^sub>0 \<le> T\<^sub>m + 1 THEN (\<theta> ::= 1) ELSE
    (IF \<theta> = 1 \<and> T\<^sub>0 \<ge> T\<^sub>M - 1 THEN (\<theta> ::= 0) ELSE skip)))"

abbreviation "therm_dyn \<equiv> 
    (IF \<theta> = 0 THEN (x\<acute>= f 0 & (t \<le> - (ln (T\<^sub>m/T\<^sub>0))/a)\<^sub>e) ELSE
    (x\<acute>= f L & (t \<le> - (ln ((L - T\<^sub>M)/(L - T\<^sub>0)))/a)\<^sub>e))"

abbreviation "ctrl \<equiv> (t, h\<^sub>m) ::= (0, h);
     IF \<not>flw \<and> h\<^sub>m \<le> H\<^sub>l + 1 THEN flw ::= True ELSE 
     IF flw \<and> h\<^sub>m \<ge> H\<^sub>u - 1 THEN flw ::= False ELSE skip"

abbreviation "dyn \<equiv> IF flw THEN {h` = c\<^sub>i - c\<^sub>o, t` = 1 | t \<le> (H\<^sub>u - h\<^sub>m)/(c\<^sub>i - c\<^sub>o)} 
     ELSE {h` = - c\<^sub>o, t` = 1 | t \<le> (H\<^sub>l - h\<^sub>m)/(- c\<^sub>o)}"

abbreviation "dyn' \<equiv> {h` = (flw*c\<^sub>i) - c\<^sub>o, t` = 1 | t \<le> ((flw*H\<^sub>u + (\<not>flw)*H\<^sub>l) - h\<^sub>m)/((flw*c\<^sub>i) - c\<^sub>o)}"

abbreviation "ode \<equiv> {y` = v, v` = m, t` = 1, m` = - k | (t \<ge> 0)}"

abbreviation "flow \<tau> \<equiv> 
  [y \<leadsto> -k*\<tau>\<^sup>3/6 + m*\<tau>\<^sup>2/2 + v *\<tau> + y, 
  v \<leadsto> -k*\<tau>\<^sup>2/2 + m*\<tau> + v, 
  t \<leadsto> \<tau> + t, 
  m \<leadsto> -k*\<tau> + m]"

abbreviation "exp_f \<equiv> [x \<leadsto> -x]" (* x>0 -> [{x'=-x}](x>0) *)
abbreviation "exp_flow \<tau> \<equiv> [x \<leadsto> x * exp (- \<tau>)]"

abbreviation "ctrl \<equiv> IF g \<le> g\<^sub>m THEN g ::= g\<^sub>M ELSE skip"

abbreviation "dyn \<equiv> {g` = -g}"

abbreviation "flow \<tau> \<equiv> [g \<leadsto> g * exp (- \<tau>)]"

abbreviation "blood_sugar \<equiv> LOOP (ctrl; dyn) INV (g \<ge> 0)"

abbreviation "I \<equiv> (v\<^sub>i * sin \<theta> * x - (v\<^sub>i * cos \<theta> - v\<^sub>o) * y
                   > v\<^sub>o + v\<^sub>i)\<^sup>e"

abbreviation "J \<equiv> (v\<^sub>i * \<omega> * sin \<theta> * x - v\<^sub>i * \<omega> * cos \<theta> * y 
                  + v\<^sub>o * v\<^sub>i * cos \<theta> 
                  > v\<^sub>o * v\<^sub>i + v\<^sub>i * \<omega>)\<^sup>e"

(* { x' = v, v' = -Kp*(x-xr) - Kd*v & v >= 0 } *)
abbreviation f9 :: "real ^ 3 \<Rightarrow> real ^ 3" 
  where "f9 \<equiv> [x \<leadsto> v, v \<leadsto> -Kp * (x - xr) - Kd * v, xr \<leadsto> 0]"

abbreviation "flow9 \<tau> \<equiv> [
  x \<leadsto> exp ((-2)*\<tau>) * (xr - 2 * (exp \<tau>) * xr + (exp (2 * \<tau>)) * xr - v + (exp \<tau>) * v - x + 2 * (exp \<tau>) * x), 
  v \<leadsto> exp ((-2)*\<tau>) * (-2 * xr + 2 * (exp \<tau>) * xr + 2 * v - (exp \<tau>) * v + 2* x - 2 * (exp \<tau>) * x),
  xr \<leadsto> xr]"

abbreviation mtx_circ :: "2 sq_mtx" ("A")
  where "A \<equiv> mtx  
   ([0,  1] # 
    [-1, 0] # [])"

abbreviation "Inv \<equiv> (h \<ge> 0 \<and> v\<^sup>2 \<le> 2*g*(H - h))\<^sup>e"
abbreviation "Dynamics \<equiv> {h` = v, v` = -g | h \<ge> 0}"
abbreviation "Ctrl \<equiv> IF h = 0 THEN v ::= -c * v ELSE skip"

abbreviation fpend :: "real^2 \<Rightarrow> real^2" ("f")
  where "f s \<equiv> (\<chi> i. if i = 1 then s$2 else -s$1)"

abbreviation pend_flow :: "real \<Rightarrow> real^2 \<Rightarrow> real^2" ("\<phi>")
  where "\<phi> t s \<equiv> (\<chi> i. if i = 1 then s$1 * cos t + s$2 * sin t else - s$1 * sin t + s$2 * cos t)"

abbreviation fball :: "real \<Rightarrow> real^2 \<Rightarrow> real^2" ("f")
  where "f g s \<equiv> (\<chi> i. if i = 1 then s$2 else g)"

abbreviation ball_flow :: "real \<Rightarrow> real \<Rightarrow> real^2 \<Rightarrow> real^2" ("\<phi>")
  where "\<phi> g t s \<equiv> (\<chi> i. if i = 1 then g * t ^ 2/2 + s$2 * t + s$1 else g * t + s$2)"

abbreviation temp_vec_field :: "real \<Rightarrow> real \<Rightarrow> real^4 \<Rightarrow> real^4" ("f")
  where "f a L s \<equiv> (\<chi> i. if i = 2 then 1 else (if i = 1 then - a * (s$1 - L) else 0))"

abbreviation temp_flow :: "real \<Rightarrow> real \<Rightarrow> real \<Rightarrow> real^4 \<Rightarrow> real^4" ("\<phi>")
  where "\<phi> a L t s \<equiv> (\<chi> i. if i = 1 then - exp(-a * t) * (L - s$1) + L else
  (if i = 2 then t + s$2 else s$i))"

abbreviation tank_vec_field :: "real \<Rightarrow> real^4 \<Rightarrow> real^4" ("f")
  where "f k s \<equiv> (\<chi> i. if i = 2 then 1 else (if i = 1 then k else 0))"

abbreviation tank_flow :: "real \<Rightarrow> real \<Rightarrow> real^4 \<Rightarrow> real^4" ("\<phi>")
  where "\<phi> k \<tau> s \<equiv> (\<chi> i. if i = 1 then k * \<tau> + s$1 else 
  (if i = 2 then \<tau> + s$2 else s$i))"

abbreviation tank_guard :: "real \<Rightarrow> real \<Rightarrow> real^4 \<Rightarrow> bool" ("G")
  where "G Hm k s \<equiv> s$2 \<le> (Hm - s$3)/k"

abbreviation tank_loop_inv :: "real \<Rightarrow> real \<Rightarrow> real^4 \<Rightarrow> bool" ("I")
  where "I hmin hmax s \<equiv> hmin \<le> s$1 \<and> s$1 \<le> hmax \<and> (s$4 = 0 \<or> s$4 = 1)"

abbreviation tank_diff_inv :: "real \<Rightarrow> real \<Rightarrow> real \<Rightarrow> real^4 \<Rightarrow> bool" ("dI")
  where "dI hmin hmax k s \<equiv> s$1 = k * s$2 + s$3 \<and> 0 \<le> s$2 \<and> 
    hmin \<le> s$3 \<and> s$3 \<le> hmax \<and> (s$4 =0 \<or> s$4 = 1)"

abbreviation darboux_ineq_f :: "real^2 \<Rightarrow> real^2" ("f")
  where "f s \<equiv> (\<chi> i. if i=1 then (s$1)^2 else (s$2)*(s$1)+(s$1)^2)"

abbreviation darboux_ineq_flow2 :: "real \<Rightarrow> real^2 \<Rightarrow> real^2" ("\<phi>")
  where "\<phi> t s \<equiv> (\<chi> i. if i=1 then (s$1/(1 - t * s$1)) else
      (s$2 - s$1 * ln(1 - t * s$1))/(1 - t * s$1))"

abbreviation darboux_ineq_df :: "real \<times> (real ^ 2) \<Rightarrow> (real ^ 2) \<Rightarrow>\<^sub>L (real ^ 2)" ("df")
  where "df p \<equiv> (case p of (t,x) \<Rightarrow> Blinfun (\<lambda>s. (\<chi> i::2. if i=1 then 2 * (s$1) * (x$1) else 
  x$2 * s$1 + s$2 * x$1 + 2 * s$1 * x$1)))"

abbreviation f9 :: "real ^ 3 \<Rightarrow> real ^ 3" 
  where "f9 \<equiv> (\<lambda>s. \<chi> i. if i = 1 then s $ 2 else if i = 2 then - 2 * (s $ 1 - s $ 3) - 3 * s $ 2 else 0)"

abbreviation "skip \<equiv> (\<lambda>s. {s})"

abbreviation g_dl_ode ::"(('a::banach)\<Rightarrow>'a) \<Rightarrow> 'a pred \<Rightarrow> 'a \<Rightarrow> 'a set" 
  ("(1x\<acute>=_ & _)") where "(x\<acute>=f & G) \<equiv> (x\<acute>=(\<lambda>t. f) & G on (\<lambda>s. {t. t \<ge> 0}) UNIV @ 0)"

abbreviation g_dl_ode_inv ::"(('a::banach)\<Rightarrow>'a) \<Rightarrow> 'a pred \<Rightarrow> 'a pred \<Rightarrow> 'a \<Rightarrow> 'a set" ("(1x\<acute>=_ & _ DINV _)") 
  where "(x\<acute>=f & G DINV I) \<equiv> (x\<acute>=(\<lambda>t. f) & G on (\<lambda>s. {t. t \<ge> 0}) UNIV @ 0 DINV I)"

abbreviation hoareT :: "('a \<Rightarrow> bool) \<Rightarrow> ('a \<Rightarrow> 'a set) \<Rightarrow> ('a \<Rightarrow> bool) \<Rightarrow> bool" 
  ("PRE_ HP _ POST _" [85,85]85) where "PRE P HP X POST Q \<equiv> (P \<le> |X]Q)"

abbreviation mtx_circ :: "2 sq_mtx" ("A")
  where "A \<equiv> mtx  
   ([0,  1] # 
    [-1, 0] # [])"

abbreviation mtx_circ_flow :: "real \<Rightarrow> real^2 \<Rightarrow> real^2" ("\<phi>")
  where "\<phi> t s \<equiv> (\<chi> i. if i = 1 then s$1 * cos t + s$2 * sin t else - s$1 * sin t + s$2 * cos t)"

abbreviation mtx_hOsc :: "real \<Rightarrow> real \<Rightarrow> 2 sq_mtx" ("A")
  where "A a b \<equiv> mtx  
   ([0, 1] # 
    [a, b] # [])"

abbreviation mtx_chB_hOsc :: "real \<Rightarrow> real \<Rightarrow> 2 sq_mtx" ("P")
  where "P a b \<equiv> mtx
   ([a, b] # 
    [1, 1] # [])"

abbreviation "open_door s \<equiv> {s. s$1 > 0 \<and> s$2 = 0}"

abbreviation mtx_cnst_acc :: "3 sq_mtx" ("K")
  where "K \<equiv> mtx (
  [0,1,0] #
  [0,0,1] # 
  [0,0,0] # [])"

abbreviation "dyn1 \<equiv> IF \<not> active 
  THEN {T` = - K * T, t` = 1 | t \<le> - (ln (Tmin/temp))/K} 
  ELSE {T` = - K * (T - L), t` = 1 | t \<le> - (ln ((L - Tmax)/(L - temp)))/K}"

abbreviation "pre_ctrl1 \<equiv> 
  IF \<not> active \<and> temp \<le> Tmin + 1 THEN active ::= True
  ELSE IF active \<and> temp \<ge> Tmax - 1 THEN active ::= False ELSE skip"

abbreviation "ctrl1 \<equiv> t ::= 0; temp ::= T; pre_ctrl1"

abbreviation "pos_inv \<equiv> (Tmin \<le> $T \<and> $T \<le> Tmax \<and> temp = T \<and> t = 0)\<^sub>e"

abbreviation "dyn2 \<equiv> IF \<not> active 
  THEN {T` = - K * T | Tmin \<le> T} 
  ELSE {T` = - K * (T - L) | T \<le> Tmax}"

abbreviation "ctrl2 \<equiv> 
  IF \<not> active \<and> T \<le> Tmin THEN active ::= True
  ELSE IF active \<and> T \<ge> Tmax THEN active ::= False ELSE skip"

(* Temperature advances at most \<epsilon> units upwards or downwards 
before our sensor makes a measurement. *)
abbreviation "dyn \<equiv> IF \<not> active 
  THEN {T` = - K * T, t` = 1 | t \<le> - ln (1 - \<epsilon> / temp) / K} 
  ELSE {T` = - K * (T - L), t` = 1 | t \<le> - ln (\<epsilon> / (temp - L) + 1) / K}"

(* Drawing:
|--------h
|
|--------Tmax
|--------close_to_Tmax
|
|
|--------close_to_Tmin
|--------Tmin
*)
abbreviation "close_to_Tmin \<T> \<equiv> \<T> \<le> Tmin + 1.1 * \<epsilon>"
abbreviation "close_to_Tmax \<T> \<equiv> \<T> \<ge> Tmax - 1.1 * \<epsilon>"

abbreviation "pre_ctrl \<equiv> 
  IF \<not> active \<and> close_to_Tmin temp THEN active ::= True
  ELSE IF active \<and> close_to_Tmax temp THEN active ::= False ELSE skip"

abbreviation "ctrl \<equiv> t ::= 0; temp ::= T; pre_ctrl"

abbreviation "inv1 \<equiv> (Tmin \<le> $T \<and> $T \<le> Tmax)\<^sub>e"

abbreviation "pos_inv1 \<equiv> (Tmin \<le> $T \<and> $T \<le> Tmax \<and> temp = T \<and> t = 0 
  \<and> (close_to_Tmin temp \<longrightarrow> active) \<and> (close_to_Tmax temp \<longrightarrow> \<not> active))\<^sub>e"

abbreviation "dyn \<equiv> IF \<not> active 
  THEN {T` = - K * T, t` = 1 | t \<le> \<epsilon>} 
  ELSE {T` = - K * (T - L), t` = 1 | t \<le> \<epsilon>}"

abbreviation "close_to_Tmin \<T> \<equiv> exp (- (K * \<epsilon>)) * \<T> \<le> Tmin \<and> Tmin \<le> \<T> \<and> L - exp (- (K * \<epsilon>)) * (L - \<T>) < Tmax"
abbreviation "close_to_Tmax \<T> \<equiv> Tmax < L - exp (- (K * \<epsilon>)) * (L - \<T>) \<and> \<T> \<le> Tmax \<and> Tmin < exp (- (K * \<epsilon>)) * \<T>"

abbreviation "pre_ctrl \<equiv> 
  IF \<not> active \<and> close_to_Tmin temp THEN active ::= True
  ELSE IF active \<and> close_to_Tmax temp THEN active ::= False ELSE skip"

abbreviation "ctrl \<equiv> t ::= 0; temp ::= T; pre_ctrl"

abbreviation "pos_inv1 \<equiv> (Tmin \<le> $T \<and> $T \<le> Tmax \<and> temp = T \<and> t = 0
 \<and> (close_to_Tmin temp \<longrightarrow> active) \<and> (close_to_Tmax temp \<longrightarrow> \<not> active))\<^sub>e"

abbreviation op_norm :: "('a::real_normed_algebra_1)^'n^'m \<Rightarrow> real" ("(1\<parallel>_\<parallel>\<^sub>o\<^sub>p)" [65] 61)
  where "\<parallel>A\<parallel>\<^sub>o\<^sub>p \<equiv> onorm (\<lambda>x. A *v x)"

abbreviation max_norm :: "real^'n^'m \<Rightarrow> real" ("(1\<parallel>_\<parallel>\<^sub>m\<^sub>a\<^sub>x)" [65] 61)
  where "\<parallel>A\<parallel>\<^sub>m\<^sub>a\<^sub>x \<equiv> Max (abs ` (entries A))"

abbreviation "\<e> k \<equiv> axis k 1"

abbreviation "entries (A::'a^'n^'m) \<equiv> {A $ i $ j | i j. i \<in> UNIV \<and> j \<in> UNIV}"

abbreviation "mtx_invertible A \<equiv> invertible (to_vec A)"

abbreviation diag2 :: "real \<Rightarrow> real \<Rightarrow> 2 sq_mtx" 
  where "diag2 \<iota>\<^sub>1 \<iota>\<^sub>2 \<equiv> mtx 
   ([\<iota>\<^sub>1, 0] # 
    [0, \<iota>\<^sub>2] # [])"

abbreviation diag3 :: "real \<Rightarrow> real \<Rightarrow> real \<Rightarrow> 3 sq_mtx" 
  where "diag3 \<iota>\<^sub>1 \<iota>\<^sub>2 \<iota>\<^sub>3 \<equiv> mtx 
  ([\<iota>\<^sub>1, 0, 0] # 
   [0, \<iota>\<^sub>2, 0] # 
   [0, 0, \<iota>\<^sub>3] # [])"

(* Define actuation BEFORE using it in ctrl *)
(*<SCTF:ACTUATION>*)
abbreviation "activatePin   ≡ active := True"
abbreviation "deactivatePin ≡ active := False"
(*</SCTF:ACTUATION>*)

(*<SCTF:INPUTSCAN>*)
abbreviation "humidityPinRead ≡
    IF H ≤ H_thr THEN humid := False ELSE humid := True"
(*</SCTF:INPUTSCAN>*)

(*<SCTF:CONTROLLOGIC>*)
abbreviation "ctrl ≡
    humidityPinRead;
    IF (¬ active ∧ ¬ humid)
    THEN activatePin
    ELSE IF (active ∧ humid)
    THEN deactivatePin"
(*</SCTF:CONTROLLOGIC>*)

(*<SCTF:DYN>*)
abbreviation "dyn ≡
    t := 0;
    IF (¬ active)
    THEN {H` = -K * H,        t` = 1 | t ≤ 1}
    ELSE {H` = -K * (H - L),  t` = 1 | t ≤ 1}"
(*</SCTF:DYN>*)

(*<SCTF:LOOP>*)
abbreviation "loopMethod I ≡ LOOP (ctrl; dyn) INV I"
(*</SCTF:LOOP>*)

(*<SCTF:INPUTSCAN>*)
abbreviation "temperaturePinRead ≡ temp := T"
(*</SCTF:INPUTSCAN>*)

(*<SCTF:CONTROLLOGIC>*)
abbreviation "ctrl ≡ 
  temperaturePinRead;
  IF ¬ active ∧ temp ≤ Tmin THEN 
    activatePin
  ELSE IF active ∧ temp ≥ Tmax THEN 
    deactivatePin"
(*</SCTF:CONTROLLOGIC>*)

(*<SCTF:ACTUATION>*)
abbreviation "activatePin ≡ active := True"
abbreviation "deactivatePin ≡ active := False"
(*</SCTF:ACTUATION>*)

(*<SCTF:DYN>*)
abbreviation "dyn ≡ t := 0;
  IF ¬ active 
  THEN {T` = - K * T, t` = 1 | t ≤ 1}
  ELSE {T` = - K * (T - L), t` = 1 | t ≤ 1}"
(*</SCTF:DYN>*)

(*<SCTF:LOOP>*)
abbreviation "loopMethod I ≡ LOOP (ctrl; dyn) INV I"
(*</SCTF:LOOP>*)
