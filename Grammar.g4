grammar Grammar;
start: Astate;
Astate: (Zero | One (One)* Zero Zero)* (Caccept {System.out.println("10");}| Baccept {System.out.println("01");});
Caccept:One One* Zero ;
Baccept: One One* ;
One: [1];
Zero: [0];