public class Main {
    public static void main(String[] args) {

        int num1=1;
        int num2=5;

        //----------------------
        /*
        1) переменная sum
        2) перебираем значения
           - отбираем четные и суммируем

         */

        long sum=0;

        if (num1%2!=0) {
            num1 = num1 + 1;
        }
        while (num1<=num2){
            sum=sum+num1;
            num1+=2;  // num1=num1+2
        }

        /*
            num1*=3;// num1=num1*3
            num1/=3;// num1=num1/3
            num1%=3;// num1=num1%3
            num1/=num2;// num1=num1/num2
        */

        System.out.println("Сумма: " + sum);

    }
}