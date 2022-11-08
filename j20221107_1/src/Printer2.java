public class Printer2 implements Printable{
    @Override
    public void print(String msg) {
        System.out.println(msg);
    }

    @Override
    public String newStr() {
        return ":";
    }
}
