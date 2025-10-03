dataspace arduino_humidity_controller =
  constants
    H_thr :: real
    L     :: real
    K     :: real
  assumes
    Hthr_val: "H_thr = 50.0"
  and L_val:   "L = 70.0"
  and K_pos:   "K > 0"

  variables
    H :: real
    t :: real
    humid  :: bool 
    active :: bool 

dataspace arduino_thermostat = 

  constants 
    Tmax :: real
    Tmin :: real
    L :: real
    K :: real
  assumes
    Tmin_val: "Tmin = 19.0"
    and Tmax_val: "Tmax = 24.0"
    and L_val: "L = 30.0"
    and K_ge0: "K > 0"

  variables
    T :: real
    t :: real
    temp :: real
    active :: bool

dataspace basic_tests = 
  variables 
    x :: real
    y :: real
    z :: real

dataspace wlp_testing =
  constants 
    A::real 
    B::real 
    S::real 
    V::real 
    \<epsilon>::real
  variables 
    x::real 
    v::real 
    a::real 
    c::real 
    d::real

dataspace AMV =
  constants
    S    :: real
    f\<^sub>m\<^sub>a\<^sub>x  :: real
  assumes
    f\<^sub>m\<^sub>a\<^sub>x: "f\<^sub>m\<^sub>a\<^sub>x \<ge> 0"
  variables
    \<comment> \<open> Continuous Variables \<close>
    p :: "real vec[2]" \<comment> \<open> Position \<close>
    v :: "real vec[2]" \<comment> \<open> Velocity \<close>
    a :: "real vec[2]" \<comment> \<open> Acceleration \<close>
    \<phi> :: "real" \<comment> \<open> Heading \<close>
    s :: "real" \<comment> \<open> Linear Speed \<close>
    \<comment> \<open> Discrete Variables\<close>
    wps :: "(real vec[2]) list" \<comment> \<open> Path of way points \<close>
    org :: "(real vec[2]) set" \<comment> \<open> Obstacle register \<close>
    rs      :: "real" \<comment> \<open> Requested speed \<close>
    rh      :: "real" \<comment> \<open> Requested heading \<close>

dataspace bouncing_ball =
  constants 
    H :: real
    g :: real
    e :: real
  assumes e_range: "0 < e" "e \<le> 1" and g_pos: "0 < g" and H_pos: "0 < H"
  variables 
    h :: real 
    v :: real

dataspace exponential =
  variables x::real y::real z::real

dataspace sys = 
  constants g :: real L :: real k :: real
  assumes L_gr_0: "L > 0" and K_gr_0: "k > 0" and g_gr_0: "g > 0"
  variables \<omega> :: real \<theta> :: real push :: real

dataspace pendulum =
  constants r :: real
  variables 
    x :: real 
    y :: real

dataspace original_reactor =
  constants 
    T\<^sub>M :: real \<comment> \<open> Max temperature reaction threshold\<close>
    T\<^sub>m :: real \<comment> \<open> Min temperature reaction threshold\<close>
    t\<^sub>R :: real \<comment> \<open> rod resting time \<close>
    K\<^sub>u\<^sub>p :: real \<comment> \<open> reactor's temperature-increase rate \<close>
    K\<^sub>1 :: real \<comment> \<open> reactor's temperature-decrease rate by rod 1 \<close>
    K\<^sub>2 :: real \<comment> \<open> reactor's temperature-decrease rate by rod 2 \<close>
  assumes Tm_ge0: "0 < T\<^sub>m" 
    and Tm_le: "T\<^sub>m < T\<^sub>M" 
    and tR_ge0: "0 < t\<^sub>R" 
    and Ks_ge0: 
      "0 < K\<^sub>u\<^sub>p"
      "0 < K\<^sub>1"
      "0 < K\<^sub>2"
    and rest_constraints: 
      "t\<^sub>R < 2 * (T\<^sub>M - T\<^sub>m) / K\<^sub>u\<^sub>p + (T\<^sub>M - T\<^sub>m) / K\<^sub>1"
      "t\<^sub>R < 2 * (T\<^sub>M - T\<^sub>m) / K\<^sub>u\<^sub>p + (T\<^sub>M - T\<^sub>m) / K\<^sub>2"
      "(T\<^sub>M - T\<^sub>m) / K\<^sub>u\<^sub>p < t\<^sub>R"
  variables
    rod1 :: bool
    rod2 :: bool
    temp :: real
    time1 :: real
    time2 :: real
    T :: real
    t :: real

dataspace time_triggered_reactor =
  constants 
    T\<^sub>M :: real \<comment> \<open> Max temperature reaction threshold\<close>
    T\<^sub>m :: real \<comment> \<open> Min temperature reaction threshold\<close>
    t\<^sub>R :: real \<comment> \<open> rod resting time \<close>
    K\<^sub>u\<^sub>p :: real \<comment> \<open> reactor's temperature-increase rate \<close>
    K\<^sub>1 :: real \<comment> \<open> reactor's temperature-decrease rate by rod 1 \<close>
    K\<^sub>2 :: real \<comment> \<open> reactor's temperature-decrease rate by rod 2 \<close>
    \<theta> :: real \<comment> \<open> time-range that triggers a control intervention \<close>
  assumes Tm_ge0: "0 < T\<^sub>m" 
    and Tm_le: "T\<^sub>m < T\<^sub>M" 
    and tR_ge0: "0 < t\<^sub>R" 
    and Ks_ge0: 
      "0 < K\<^sub>u\<^sub>p"
      "0 < K\<^sub>1"
      "0 < K\<^sub>2"
    and rest_constraints: 
      "t\<^sub>R < 2 * (T\<^sub>M - T\<^sub>m) / K\<^sub>u\<^sub>p + (T\<^sub>M - T\<^sub>m) / K\<^sub>1"
      "t\<^sub>R < 2 * (T\<^sub>M - T\<^sub>m) / K\<^sub>u\<^sub>p + (T\<^sub>M - T\<^sub>m) / K\<^sub>2"
      "(T\<^sub>M - T\<^sub>m) / K\<^sub>u\<^sub>p < t\<^sub>R"
    and theta_hyp: "\<exists>n > 3. n * \<theta> > T\<^sub>M - T\<^sub>m"
  variables
    rod1 :: bool
    rod2 :: bool
    temp :: real
    time1 :: real
    time2 :: real
    T :: real
    t :: real
  
dataspace rocket = 
  constants k :: real
  assumes k_ge_1: "k > 1" 
  variables v :: real y :: real m :: real t :: real

dataspace event_triggered_thermostat = 
  constants 
    Tmax :: real
    Tmin :: real
    L :: real
    K :: real  
  assumes 
    Tmin_ge0: "0 < Tmin" 
    and Tmax_le_Tlim: "Tmax < L"
    and K_ge0: "K > 0"
  variables 
    T :: real
    active :: bool

dataspace refined_thermostat = 
  constants 
    Tmax :: real
    Tmin :: real
    L :: real
    K :: real  
  assumes 
    Tmin_ge0: "0 < Tmin" 
    and Tmin_le_Tmax: "Tmin + 1 < Tmax" 
    and Tmax_le_Tlim: "Tmax < L"
    and K_ge0: "K > 0"
  variables 
    T :: real
    t :: real
    temp :: real
    active :: bool

dataspace time_triggered_thermostat = 
  constants 
    Tmax :: real
    Tmin :: real
    L :: real
    K :: real  
    \<epsilon> :: real
  assumes 
    K_ge0: "K > 0"
    and eps_ge0: "\<epsilon> > 0"
    and eps_le_Tmin: "\<epsilon> < Tmin"
    and delta_ge_3eps: "Tmax - Tmin > 3 * \<epsilon>" 
    and L_ge_Tmax_eps: "L > Tmax + \<epsilon>"
  variables 
    T :: real
    t :: real
    temp :: real
    active :: bool

dataspace event_triggered_water_tank =
  constants 
    c\<^sub>o :: real
    c\<^sub>i :: real
    Hmax :: real
    Hmin :: real    
  assumes 
    co_ge_0: "0 < c\<^sub>o" 
    and ci_ge_0: "c\<^sub>o < c\<^sub>i"
  variables 
    h :: real
    active :: bool

dataspace refined_water_tank =
  constants 
    c\<^sub>o :: real
    c\<^sub>i :: real
    Hmax :: real
    Hmin :: real    
  assumes 
    co_ge_0: "0 < c\<^sub>o" 
    and ci_ge_0: "c\<^sub>o < c\<^sub>i"
  variables 
    h :: real
    t :: real
    height :: real
    active :: bool

dataspace level_triggered_water_tank =
  constants 
    c\<^sub>o :: real
    c\<^sub>i :: real
    Hmax :: real
    Hmin :: real
    \<epsilon> :: real
  assumes 
    co_ge_0: "0 < c\<^sub>o" 
    and ci_ge_0: "c\<^sub>o < c\<^sub>i"
    and eps_ge0: "\<epsilon> > 0"
    and eps_le_Tmin: "\<epsilon> < Hmin"
    and delta_ge_3eps: "Hmax - Hmin > 3 * \<epsilon>" 
  variables 
    h :: real
    t :: real
    height :: real
    active :: bool

dataspace time_triggered_water_tank =
  constants 
    c\<^sub>o :: real
    c\<^sub>i :: real
    Hmax :: real
    Hmin :: real
    \<epsilon> :: real
  assumes 
    co_ge_0: "0 < c\<^sub>o"
    and ci_ge_0: "c\<^sub>o < c\<^sub>i"
    and eps_ge0: "\<epsilon> > 0"
    and eps_le_Tmin: "\<epsilon> < Hmin"
    and delta_ge_3eps: "Hmax - Hmin > 3 * max (c\<^sub>o * \<epsilon>) ((c\<^sub>i - c\<^sub>o) * \<epsilon>)" 
  variables 
    h :: real
    t :: real
    height :: real
    active :: bool

dataspace basic_programs = 
  variables 
    w :: real
    x :: real
    y :: real
    z :: real
  
dataspace conserved_quantity =
  constants c::real
  variables x1::real x2::real

dataspace darboux =
  constants A::real B::real
  variables x::real y::real z::real w1::real w2::real

dataspace dyn_param_switch =
  variables 
    x :: real 
    y :: real 
    w :: real
    c :: real
    d :: real

dataspace ETCS =
  constants 
    \<epsilon> :: real \<comment> \<open> control cycle duration upper bound \<close>
    b :: real \<comment> \<open> braking force \<close>
    A :: real \<comment> \<open> maximum acceleration \<close>
    m :: real \<comment> \<open> end of movement authority (train must not drive past m) \<close>
  variables
    t :: real
    z :: real
    v :: real
    a :: real

dataspace harmonic_osc =
  constants
    a :: real
    b :: real
  variables 
    x :: real 
    y :: real 

dataspace LICS =
  constants A::real B::real b::real m::real \<epsilon>::real
  variables x::real v::real a::real t::real

dataspace STTT =
  constants A::real B::real S::real V::real \<epsilon>::real
  variables x::real v::real a::real c::real

dataspace STTT_10 =
  constants A::real B::real \<epsilon>::real
  variables a::real v::real x::real dx::real y::real dy::real w::real r::real c::real

dataspace rotational_dynamics3 =
  constants
    w :: real
    p :: real
  variables 
    x1 :: real 
    x2 :: real 
    d1 :: real
    d2 :: real

dataspace dyn_nonlinear = 
  constants a :: real
  variables x1::real x2::real

dataspace water_tank = 
  constants H\<^sub>l::real H\<^sub>u::real c\<^sub>o::real c\<^sub>i::real
  assumes co: "0 < c\<^sub>o" and ci: "c\<^sub>o < c\<^sub>i"
  variables flw::"bool" h::"real" h\<^sub>m::"real" t::"real"

dataspace glucose = 
  constants g\<^sub>m :: real g\<^sub>M :: real
  assumes ge_0: "g\<^sub>m > 0" and ge_gm: "g\<^sub>M > g\<^sub>m"
  variables g :: real

dataspace planar_flight =
  constants
    v\<^sub>o :: real
    v\<^sub>i :: real
  assumes
    v\<^sub>o_pos: "v\<^sub>o > 0" and
    v\<^sub>i_pos: "v\<^sub>i > 0"
  variables
    x :: real
    y :: real
    \<theta> :: real
    \<omega> :: real
  
dataspace bball =
  constants 
    g :: real \<comment> \<open> Gravitational acceleration constant \<close>
    H :: real \<comment> \<open> The initial or maximum height of the ball \<close>
    c :: real \<comment> \<open> The damping coefficient applied upon rebound \<close>
  assumes g_pos: "g > 0" \<comment> \<open> The gravitational constant should be strictly positive (e.g. 9.81) \<close>
  and c_pos: "c > 0" \<comment> \<open> The damping coefficient is greater than 0... \<close>
  and c_le_one: "c \<le> 1" \<comment> \<open> ... and no greater than 1, otherwise it increases its bounce. \<close>
  and H_pos: "H \<ge> 0"
  variables h::real  v::real

dataspace original_thermostat = 
  constants 
    Tmax :: real
    Tmin :: real
    L :: real
    K :: real    
  assumes 
    Tmin_ge0: "0 < Tmin" 
    and Tmin_le_Tmax: "Tmin + 1 < Tmax" 
    and Tmax_le_Tlim: "Tmax < L"
    and K_ge0: "K > 0"
  variables 
    T :: real
    t :: real
    temp :: real
    active :: bool

dataspace thermostat = 
  constants 
    Tmax :: real
    Tmin :: real
    L :: real
    K :: real    
    \<epsilon> :: real
  assumes 
    K_ge0: "K > 0"
    and eps_ge0: "\<epsilon> > 0"
    and Tmax_le_L: "Tmax < L"
    and Tmin_le: "Tmin < exp (- (K * \<epsilon>)) * Tmax"
    and Tmax_ge: "Tmax > L - exp (- (K * \<epsilon>)) * (L - Tmin)"
  variables 
    T :: real
    t :: real
    temp :: real
    active :: bool