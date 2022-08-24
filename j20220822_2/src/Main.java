/*
Допустим, у вас есть прибор, у которого есть 3 колбы. Каждая колба имеет датчик температуры.
Считается, что прибор работает правильно, если температура в каждой из трех колб не
меньше 100 или есть такая  колба, температура которой более 200 градусов. Напишите
программу проверки корректности работы такого прибора.

 */


public class Main {
    public static void main(String[] args) {
        double flask1=220;
        double flask2=180;
        double flask3=220;
        //---------------------------------------

        boolean condition1= flask1>=100 && flask2>=100 && flask3>=100;
        boolean condition2 = flask1>200  ||   flask2>200 || flask3>200;
        boolean result = condition1 || condition2;



    }
}