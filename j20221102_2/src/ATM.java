public class ATM implements MoneyGiveable {
    public boolean giveMoney(double amount){
        System.out.println("ATM start");
        boolean responseFromProcessing=true;
        if(responseFromProcessing){
            System.out.println("Выдаем "+amount);
            return true;
        } else {
            System.out.println("Операция не возможна");
            return false;
        }
    }
}
