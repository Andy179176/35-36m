public class Main {
/*
a^b

a*a*a .....
  b раз

  2^3
  2*2*2

  0=1
  1*2=2
  2*2=4



  long res=0

 */

    public static void main(String[] args) {
       int a = 2;
       int b = 8;

       long res = 1;

       int i = 0;
       while (i < b) {
           res *= a; // res=res*a     1*a*a*a*a
           i+=1;     // i=i+1
       }

       System.out.printf("%d^%d=%d",a,b,res);


   }
}