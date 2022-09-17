public class Main {
    public static void main(String[] args) {
        String str= "Hello world!";
        System.out.println(str);

        System.out.println("str.length() :" +str.length());
        System.out.println("str.charAt(0) :" + str.charAt(0));
        System.out.println("str.toLowerCase() :" + str.toLowerCase());
        System.out.println("str.toUpperCase() :" + str.toUpperCase());
        System.out.println("str.replace('l','L') :" + str.replace('l','L'));
        System.out.println("str.replace(\"world\",\"All\") :" + str.replace("world","all"));
        System.out.println("str.indexOf(\"world\") :" + str.indexOf("world"));
        System.out.println("str.indexOf(\"all\") :" + str.indexOf("all"));
        System.out.println("str.indexOf(\"l\") :" + str.indexOf("l"));
        System.out.println("str.indexOf(\"l\",4) :" + str.indexOf("l",5));
        System.out.println("str.substring(6,11) :" + str.substring(6,11));
        String s1="world";
        System.out.println("str.substring(str.indexOf(s1),str.indexOf(s1)+s1.length()) :" + str.substring(str.indexOf(s1),str.indexOf(s1)+s1.length()));
        System.out.println("str.substring(6) :" + str.substring(6));
        System.out.println("str.trim() :" + str.trim()); //
        System.out.println("str.startsWith(\"He\") :" + str.startsWith("He"));
        System.out.println("str.startsWith(\"Me\") :" + str.startsWith("Me"));
        System.out.println("str.startsWith(\"!\") :" + str.endsWith("!"));
        System.out.println("str.startsWith(\".\") :" + str.endsWith("."));

        System.out.println("str.equals(\"Hello world!\") :" + str.equals("Hello world!"));
        System.out.println("str==\"Hello world!\" :" + str.equals("Hello world!"));






    }
}