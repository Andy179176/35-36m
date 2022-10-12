import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Jack";
        p1.age =25;

        p1.print();

        Person p2 = new Person();
        p2.name= "John";
        p2.age = 30;

        p2.print();

        Person p3= new Person();
        p3.name="Ann";
        p3.age=26;

        p3.print();

        System.out.println("-----------------------------");
        Person[] people = {p1,p2,p3};
        for (int i = 0; i < people.length ; i++) {
            people[i].print();
        }

        System.out.println("---------------------------------");
        MyDate date1= new MyDate();
        date1.day=1;
        date1.month=3;
        date1.year=2022;
        date1.print();
        System.out.println("-------------------------------");

        p1.birthday();

        p1.print();





    }






}