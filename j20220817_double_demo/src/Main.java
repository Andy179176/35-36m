public class Main {
    public static void main(String[] args) {

        float floatA=1.1f;
        float floatB=1.3f;
        float floatConst=100_000.0f;

        double doubleA=1.1;
        double doubleB=1.3;
        double doubleConst=100_000.0;


        //
        System.out.println("------------------ FLOAT ------------");
        System.out.println("floatA = "+ floatA);
        System.out.println("floatB = "+ floatB);
        System.out.println("floatA+floatB = "+(floatA+floatB));
        float resFloat=floatA+floatB +floatConst-floatConst;
        System.out.println("floatA+floatB + const-const = "+resFloat);


        System.out.println("------------------ DOUBLE ------------");
        System.out.println("doubleA = "+ doubleA);
        System.out.println("doubleB = "+ doubleB);
        System.out.println("doubleA+doubleB = "+(doubleA+doubleB));
        double resDouble=doubleA+doubleB +doubleConst-doubleConst;
        System.out.println("doubleA+doubleB + const-const = "+resDouble);


        System.out.println("-------------------");
        System.out.println((Math.round(resDouble*100))/100.0);


        System.out.println(100.0/0.0);



    }
}