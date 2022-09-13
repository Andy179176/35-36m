/*
Написать программу, которая выводит на экран таблицу умножения (таблицу Пифагора).
Естественно, использовать циклы.

   1   2   3   4
   2   4   6   8
   3   6   9  12
   4   8  12  16

 */
public class Main {
    public static void main(String[] args) {
        int row=20;
        int col=20;
        System.out.print("      ");
        for (int j=1;j<=col;j+=1){
            System.out.printf("%5d", j);
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------");

        for (int i=1; i<=row; i+=1){
            System.out.printf("%3d|  ",i);
            for(int j=1; j<=col;j+=1){
                System.out.printf("%5d", i*j);
            }
            System.out.println();
        }
    }
}