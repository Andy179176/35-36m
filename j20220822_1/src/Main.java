public class Main {
    /*
Допустим, у вас есть прибор, у которого есть 3 колбы. Каждая колба имеет датчик температуры. Считается, что прибор работает правильно, если температура в одной из трех колб (не известно в какой) температура более 150 градусов, а в остальных менее 100 градусов,
и при этом сумма температур всех трех колб не превышает 250 градусов.

*/
    public static void main(String[] args) {
        double flask1 = 100;
        double flask2 = 100;
        double flask3 = 100;

        int highTemp = 150;
        int lowTemp = 110;
        int sumTemp = 250;


        boolean flask1IsHot = (flask1 > highTemp && flask2 < lowTemp && flask3 < lowTemp);
        boolean flask2IsHot = (flask2 > highTemp && flask1 < lowTemp && flask3 < lowTemp);
        boolean flask3IsHot = (flask3 > highTemp && flask1 < lowTemp && flask2 < lowTemp);


        boolean result = (flask1IsHot || flask2IsHot || flask3IsHot) &
                ((flask1 + flask2 + flask3) <= sumTemp);


    }
}