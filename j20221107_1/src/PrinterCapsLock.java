public class PrinterCapsLock implements Printable {

    @Override
    public void print(String msg) {
        System.out.println(msg.toUpperCase());
    }
}
