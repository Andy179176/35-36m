import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Получить у кассира");
        System.out.println("2. Получить в банкомате");
        System.out.println("любая другая цифра - выход");

        MoneyGiveable moneyService=null;
        Scanner scanner = new Scanner(System.in);
        int way= scanner.nextInt();
        switch (way){
            case 1: moneyService= new Cashier(); break;
            case 2: moneyService= new ATM(); break;
        }
        if(moneyService!=null){
            getMoney(moneyService);
        }
    }

    public static void getMoney(MoneyGiveable moneyGiveable){
      moneyGiveable.giveMoney(100);
    }

}


