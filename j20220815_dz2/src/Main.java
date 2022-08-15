/*
Создать новый проект и написать программу рассчитывающую, на сколько увеличится площадь пиццы, если ее диаметр увеличить на N сантиметров. Подсказка: площадь круга можно вычислить по формуле 3,14*R*R. Например: Исходная пицца диаметр 10 см (т.е. R1=10/2=5). Диаметр новой пиццы 16 см (т.е. R1=16/2=8). Ответ: 122.46
 */


import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {

        int diameter1 =17;
        int n=6;

        //--------------------------------------



        int diameter2=n+diameter1;
        double PI=3.14;
        //double PI=Math.PI;

        double radius1=diameter1/2.0;
        double radius2=diameter2/2.0;
        double area1= radius1*radius1*PI;
        double area2= radius2*radius2*PI;
        //double area2= Math.pow(radius2,2)*Math.PI;

        double diff=area2 - area1;
        //double diff=Math.abs(area2 - area1);   // |5|=5   |-5|=5

// ------------------------------------------------

        System.out.println("The area of pizza with diameter " + diameter1 +" is " + area1);
        System.out.println("The area of pizza with diameter " + diameter2 +" is " + area2);
        System.out.println("Result: " +diff);

    }
}