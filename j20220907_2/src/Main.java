public class Main {
    public static void main(String[] args) {
        int i=0;
    /*

        while(i<3){
            System.out.println(i);
            i=i+1;
        }
      */

        for( i=0; i<3 ; i=i+1 ){
            System.out.println(i);
        }

        String str= "Java is the best!";
        for (int index=0; index<str.length(); index+=1){
            System.out.println(str.charAt(index));
        }
        System.out.println("------------------------------");

        for (i=str.length()-1; i>=0;i-=1){
            System.out.println(str.charAt(i));
        }

        System.out.println("------------------------------");
        for (i=0; i<str.length();i+=2){
            System.out.print(str.charAt(i));
        }

        System.out.println("------------------------------");
        int k;
        for (k=0; k<str.length();k+=2){
            System.out.print(str.charAt(k));
        }
        k=100;


    }


}