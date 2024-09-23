// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// PS : The name of the public class has to be Main for the code to work

public class Pattern_Problems {
    public static void main(String[] args) {
        // print1(5); // square *
        // print2(5);  //left pyramid *
        // print3(5); // left pyramid number 12345
        // print4(5); //left pyramid number 55555
        // print5(5); //left pyramid inverted *
        // print6(5); //left pyramid inverted 12345
        // print7(5); //pyramid *
        // print8(5); //pyramid * inverted
        // print9(5); //pyramid * diamond
        // print10(5); //left pyramid * half daimond
        // print11(5); // left pyramid 1 0
        // print12(4); // left pyramid n right pyrmaid side-by-side 1234
        // print13(5); // left pyramid incremental
        // print14(5); //left pyramid ABC  
        // print15(5); //left pyramid ABC inverted
        // print16(5); //left pyramid AA
        print17(4); //pyramid ABCDCBA
    }

    public static void print17(int num) {
        System.out.println("<17>");
        for(int i=0; i<num; i++) {
            for(int j=0; j<num+num-1;j++) {
                System.out.print((j-i));
            } 
            System.out.println();
        }
    }
    
    public static void print16(int num) {
        System.out.println("<16>");
        char n = 'A';
        for(int i=0; i<num; i++) {
            for(int j=0; j<=i;j++) {
                System.out.print(n);
            } 
            n++;
            System.out.println();
        }
    }
    
    public static void print15(int num) {
        System.out.println("<15>");
        for(int i=0; i<num; i++) {
            for(char j='A'; j<'A'+num-i;j++) {
                System.out.print(j + " ");
            } 
            System.out.println();
        }
    }

    public static void print14(int num) {
        System.out.println("<14>");
        for(int i=0; i<num; i++) {
            for(char j='A'; j<='A'+i;j++) {
                System.out.print(j + " ");
            } 
            System.out.println();
        }
    }

    public static void print13(int num) {
        System.out.println("<13>");
        int n=1;
        for(int i=0; i<num; i++) {
            for(int j=0; j<=i;j++) {
                System.out.print(n++ + " ");
            } 
            System.out.println();
        }
    }

    public static void print12(int num) {
        System.out.println("<12>");
        for(int i=1; i<= num; i++) {
            int n = 1;
            for(int j=1; j<= num*2; j++) {
                System.out.print((j<=i) ? n++ :  ( j > (num*2-i) ? --n : "  ") );
            }
            System.out.println();
        }
        // can also use three loops first for incr , then for spaces, and decr
    }

    public static void print11(int num) {
        System.out.println("<11>");
        for(int i=0; i<num; i++) {
            boolean n = i%2 == 0;
            for(int j=0; j<=i; j++) {
                System.out.print((n ? 1 : 0) + " ");
                n=!n;
            }
            System.out.println();
        }
    }
    
    public static void print10(int num) {
        System.out.println("<10");
        for(int i=0; i< (num*2) -1; i++) {
            int n = i >= num ? num*2 -i-2: i;
            for(int j=0; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print9(int num) {
        System.out.println("<9>");
        for(int i =0; i<num; i++) {
            for(int j=0; j<num+i; j++) {
                System.out.print(j >= num - i -1 ? "*" : " ") ;
            }
            System.out.println();
        }
       for(int i =0; i<num; i++) {
            for(int j=0; j<(num*2)-i-1; j++) {
                System.out.print(j < i ? " " : "*") ;
            }
            System.out.println();
        }
    }
    
    public static void print8(int num) {
        System.out.println("<8>");
        for(int i =0; i<num; i++) {
            for(int j=0; j<(num*2)-i-1; j++) {
                System.out.print(j < i ? " " : "*") ;
            }
            System.out.println();
        }
    }
    
    public static void print7(int num) {
        System.out.println("<7>");
        for(int i =0; i<num; i++) {
            for(int j=0; j<num+i; j++) {
                System.out.print(j >= num - i -1 ? "*" : " ") ;
            }
            System.out.println();
        }
    }

    public static void print6(int num) {
        System.out.println("<6");
        for(int i =0; i<num; i++) {
            for(int j=0; j<num-i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    
    public static void print5(int num) {
        System.out.println("<5>");
        for(int i =0; i<num; i++) {
            for(int j=i; j<num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void print4(int num) {
        System.out.println("<4>");
        for(int i =0; i<num; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    public static void print3(int num) {
        System.out.println("<3>");
        for(int i =0; i<num; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    public static void print2(int num) {
        System.out.println("<2>");
        for(int i =0; i<num; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print1(int num) {
        System.out.println("<1>");
        for(int i=0; i< num ;i++ ) {
            for(int j=0; j< num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
