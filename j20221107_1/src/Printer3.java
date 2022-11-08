public class Printer3 implements Printable,Printable2 {
    @Override
    public void print(String msg) {

    }

    @Override
    public String newStr() {
        return Printable.super.newStr();
        //return "";
    }
}
