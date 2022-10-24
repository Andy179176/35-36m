/*
Представьте, вы пишите программу для автопарка или, например, для авиакомпании. Вам необходимо  создать класс Ticket ,  который должен содержать следующие поля Route route, MyDateTime time, double price. Как вы догадываетесь, Route и MyDateTime тоже  классы: Route{String number, String  from, String destination, long distance}  MyDateTime (day,month,year,hour,min). Далее вам необходимо:
a)      создать несколько разных билетов, положить их в массив.
b)      Реализовать метод, который выводит информацию обо всех билетах
c)      Реализовать метод, который считает суммарную стоимость билетов.
d)      Необходимо посчитать суммарную дистанцию всех маршрутов (предположим, что у вас нет билетов с одним и тем же маршрутом, т.е. задача сводится к простому суммированию всех distance)
e)      Реализовать в билете метод изменения времени отправления.

 */
public class Main {
    public static void main(String[] args) {
        Route r1=new Route("#1", "Berlin", "Dublin",2500);
        Route r2=new Route("#2", "Berlin", "Paris",1060);
        Route r3=new Route("#3", "Berlin", "Hamburg",284);

/*
        Ticket[] tickets = {
       new Ticket(r1,new MyDateTime(24,10,2022, 20,15),164),
       new Ticket(r1,new MyDateTime(25,10,2022, 10,20),180),
       new Ticket(r2,new MyDateTime(10,12,2022, 10,20),120),
        new Ticket(r2,new MyDateTime(10,12,2022, 12,20),120),
        new Ticket(r3,new MyDateTime(15,11,2022, 13,00),50),
        new Ticket(r2,new MyDateTime(5,11,2022, 11,5),54),

        };

        print(tickets);
  */

        Tickets ticketsStorage= new Tickets(100);
        ticketsStorage.add(new Ticket(r1,new MyDateTime(24,10,2022, 20,15),164));
        ticketsStorage.add(new Ticket(r1,new MyDateTime(25,10,2022, 10,20),180));
        System.out.println(ticketsStorage);
        ticketsStorage.add(new Ticket(r2,new MyDateTime(10,12,2022, 10,20),120));
        System.out.println("-------------------------------------------------------------------");
        System.out.println(ticketsStorage);
        Ticket t1= ticketsStorage.get(0);
        t1.changeTime(10,10,2022,10,10);
        System.out.println("-------------------------------------------------------------------");
        System.out.println(ticketsStorage);


    }

    private static void print(Ticket[] tickets) {
        for (Ticket t: tickets){
            System.out.println(t);
        }
    }
}