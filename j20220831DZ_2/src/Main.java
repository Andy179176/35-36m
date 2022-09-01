public class Main {
        /*
    Необходимо написать программу, которая печатает все целые числа в
    диапазоне  между num1 и num2. Учтите, num1 может быть как меньше,
    так больше или равно  num2.

    В предыдущей задаче, для каждого числа, которое делится на 2 выводить
    надпись «делиться на 2». Для каждого числа, которое делится на 3 выводить
    надпись «делится на 3»
     */



    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 3;

        int min = num1, max = num2;
        if (num1 > num2) {
            min = num2;
            max = num1;
        }

        while (min <= max) {    //      min ........ -> ........max
            System.out.print(min+ " ");
            if(min%2==0){
                System.out.print("делиться на 2  ");
            }
            if(min%3==0){
                System.out.print("делиться на 3  ");
            }
            min = min + 1;
            System.out.println();
        }
    }

}