public class Main {
    public static void main(String[] args) {
        boolean  flag1 = false;
        boolean  flag2 = false;
        
        boolean condition= flag1 &&  flag2;


        if(condition) {
            System.out.println("A");

        }  else {

            System.out.println("D");

        }


        System.out.println("C");

//D B C
//B C
//A D B C
//A B C

    }
}