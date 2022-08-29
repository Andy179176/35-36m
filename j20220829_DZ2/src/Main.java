public class Main {

    public static void main(String[] args) {
        // Вводные данные
        int speedLimit = 100;
        int carSpeed = 140;
        boolean isAutoban = true;

        // 
        String panishmentNo = "не штрафуется";
        String fineMsg= "штраф -  %d евро %n";
        String canselLicMsg = " плюс лишение прав на %d месяца";


        // Решение

        int speedOver = carSpeed*100/speedLimit-100 ;

        int fine=0;
        int canselLicense=0;

        if (speedOver<10) {
            fine=0;
        } else if(speedOver>=10 && speedOver<20) {
            fine=50;
        } else if(speedOver>=20 && speedOver<30) {
            if(isAutoban){
                fine=200;
            } else{
                fine=150;
            };
        } else if(speedOver>=30) {
            fine=500;
            if(isAutoban){
                canselLicense=3;
            };
        };


        // Вывод на екран
        if(fine!=0){
            System.out.printf( fineMsg, fine  );
            if(canselLicense!=0){
                System.out.printf(canselLicMsg, canselLicense );
            }
        } else {
            System.out.println(panishmentNo);
        }

    }
}
