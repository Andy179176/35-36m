public class Main {
    public static void main(String[] args) {

        int side1 = 18;
        int side2 = 189;

        System.out.println("Side 1 is " + side1);
        System.out.println("Side 2 is " + side2);
        System.out.println("The area of a rectangle sides " + side1 + " and " + side2 + " is " + (side1 * side2));

        //-------------------------------------------------------------------------


        System.out.println("-------------------------------------------------------------");
        double usd= 7785.20;
        double rateUsdToEuro = 0.98;

        double euro = usd*rateUsdToEuro;
        System.out.println("USD: " + usd);
        System.out.println("rate: " + rateUsdToEuro);
        System.out.println("EURO: "+ euro);
    }
}