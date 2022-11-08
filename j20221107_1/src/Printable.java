public interface Printable {
    void print(String msg );

    default String newStr(){
        return System.lineSeparator();
    };

}
