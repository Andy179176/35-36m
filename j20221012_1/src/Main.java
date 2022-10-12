import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Jack";
        p1.age =25;

        print(p1);

        Person p2 = new Person();
        p2.name= "John";
        p2.age = 30;

        print(p2);

        Person p3= new Person();
        p3.name="Ann";
        p3.age=26;

        print(p3);

        System.out.println("-----------------------------");
        Person[] people = {p1,p2,p3};
        for (int i = 0; i < people.length ; i++) {
            print(people[i]);
        }

        System.out.println("---------------------------------");
        MyDate date1= new MyDate();
        date1.day=1;
        date1.month=3;
        date1.year=2022;
        print(date1);

    }

    public static void print(Person person){
        System.out.println(person.name + "("+ person.age+")");
    }
    

    public static  void  print(MyDate date){
        System.out.println(date.day+"-"+date.month+"-"+ date.year);
    }

}