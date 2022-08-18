public class Main {
    public static void main(String[] args) {
        int flask1=101;
        int flask2=200;
        int flask3=98;

        // Прибор работает корректно если все колбы больше 100 градусов
        boolean runCorrect= flask1>100 & flask2>100  & flask3>100;

        System.out.println("The device is working correct -" + runCorrect);


        // Прибор работает корректно если хотя бы одна из  колб больше 100 градусов
        boolean runCorrect2= flask1>100 | flask2>100  | flask3>100;

        System.out.println("The device is working correct -" + runCorrect2);


        // Прибор работает корректно если первая и вторая колба  больше 100 градусов
        // или третья колба меньше 100
        boolean runCorrect3= (flask1>100 & flask2>100)  | flask3<100;

        System.out.println("The device is working correct -" + runCorrect3);

    }
}