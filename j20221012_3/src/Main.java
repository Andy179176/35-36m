import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyDate d1=new MyDate(8,4,2001);
        MyDate d2=new MyDate(10,3,1998);
        MyDate d3=new MyDate(20,12,2003);
        MyDate d4= new MyDate(9,12,1999);

        Person p1 = new Person("Jack",d1);
        Person p2 = new Person("John",d2);
        Person p3= new Person("Ann",d3);
        Person p4= new Person("Stan", new MyDate(10,12,1990));

        Person[] people = {p1,p2,p3,
                new Person("Nick",new MyDate(12,11,2000)),
                new Person("Lena",new MyDate(4,4,2000)),
        };
        for (int i = 0; i < people.length ; i++) {
            people[i].print();
        }


        ArrayList<Person> people1 = new ArrayList<>();
        people1.add(p1);
        people1.add(p2);
        people1.add(p3);
        people1.add(new Person("Tad",new MyDate(10,5,2005)));

        System.out.println(people1);


    }






}