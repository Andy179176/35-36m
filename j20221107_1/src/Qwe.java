public class Qwe implements Printable3,Printable2 {
    @Override
    public String newStr() {

        return Printable3.super.newStr()+Printable2.super.newStr();
    }
}
