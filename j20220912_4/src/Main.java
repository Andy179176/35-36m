public class Main {
    public static void main(String[] args) {
        double a=10;
        double b=15.3;
        double add=add(a,b); // 25.3
        System.out.println(add(10,20)); //30
        System.out.println(add(add(a,b),20)); // add(25.3, 20) ->45.3
        System.out.printf("%.2f + %.2f = %.2f",a,b,add);


    }

    // public static тип   имя ( параметры )
     public static double add(double a, double b){
        double res=a+b;
        return res;
     }

}