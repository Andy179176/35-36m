public class ATMWithCashIn implements MoneyGiveable, MoneyGetable{

    @Override
    public void getMoney(double amount) {

    }

    @Override
    public boolean giveMoney(double amount) {
        return false;
    }
}
