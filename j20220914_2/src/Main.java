public class Main {
    public static void main(String[] args) {
        String str="hello";

        System.out.println(helloTranslate(str));
        System.out.println(helloTranslate2(str));
        System.out.println(helloTranslate("Hi!"));
        System.out.println(helloTranslate2("Hi!"));
        System.out.println("--------------------------------------");
        printIsEven(19);
        printIsEven(20);


        /*
            str1=  ( condition ) ? str : str+" err";
         */

    }
    public static String helloTranslate(String str){
        if (str.equals("hello")){
            return "Привет";
        } else {
            return str;
        }
    }

    public static String helloTranslate2(String str){
       return  (str.equals("hello")) ? "Привет" : str;
    }


    public static void printIsEven(int num){
        System.out.println( (num%2==0)? num/2 : num*2 );
    }


}