public class Main {
    public static void main(String[] args) {
        Printable printer1= tender();


        //Printable printer1= new Printer1();
        printer1.print("qwertyuio");
        printer1.newStr();
        Printable printer2= new Printer2();
        printer2.print("123456789");
        System.out.println(printer2.newStr());
                new PrinterCapsLock().print("wertyuio");
    }

    private static Printable tender() {
        //return new Printer1();
        return tender2();
    }

    private static Printable tender2() {
        //return new Printer1();
        return null;
    }
}