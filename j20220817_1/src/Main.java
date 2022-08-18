public class Main {
    public static void main(String[] args)

    //Реализуйте программу, которая считает стоимость покупки, учитывая НДС.
    // Т.е. дана стоимость товара и размер НДС (например, 19%) Ваша программа должна
    // рассчитать, сколько, сколько вы должны оплатить, учитывая налог.

    {
        double price=78.0;//price without tax
        double tax=19.0;//percent tax
        //---------------------------------------------------------


        double taxValue=price/100.0*tax;//tax amount

        //----------------------------------------------

        System.out.println("Final price="+(price+taxValue) + "(inc. tax: "+taxValue+")");



    }
}
