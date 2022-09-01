/*
Необходимо написать программу, которая печатает все целые числа в диапазоне
между num1 и num2.
 */

public class Main {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 4;

        int min = num1, max = num2;
        if (num1 > num2) {
            min = num2;
            max = num1;
        }

        while (min <= max) {    //      min ........ -> ........max
            System.out.println(min);
            min = min + 1;
        }
    }
}
