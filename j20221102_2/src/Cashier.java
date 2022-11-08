public class Cashier implements MoneyGiveable, MoneyGetable {
    public boolean giveMoney(double amount){
        System.out.println("Cashier start");
            System.out.println("Выдаем "+amount);
            return true;
        }

    @Override
    public void getMoney(double amount) {
        System.out.println("взял деньги и не верну!");
    }
}
