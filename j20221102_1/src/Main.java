import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String str ="hello";
        Scanner scanner = new Scanner(System.in);
        var str2="hello";
        var scanner1 = new Scanner(System.in);
        var a=1.0;

        double[] doubles=new double[100_000000];
        long start = System.currentTimeMillis();
        for (int i = 1; i <100_000000 ; i++) {
            double d= (double)i/2.1;
            doubles[i]= d/2.3*100/doubles[i-1];
        }
        long finish = System.currentTimeMillis();
        double diff= (finish-start);///1000.0;
        System.out.println(diff);

        Instant start1=Instant.now();
        for (int i = 1; i <100_000000 ; i++) {
            double d= (double)i/2.1;
            doubles[i]= d/2.3*100/doubles[i-1];
        }
        Instant end1=Instant.now();
        System.out.println(ChronoUnit.MILLIS.between(start1,end1));




        Employee employee1 = new Employee();
        Employee employee2 = new Programmer();
        Programmer employee3 = new Programmer();

        employee1.method1();
        employee2.method1();

        Programmer employee4 = (Programmer) employee2;
        employee4.programmerMethod();

/*
        Programmer employee5 = (Programmer) employee1;
       employee4.programmerMethod();     //java.lang.ClassCastException
*/

        Employee[] employees = {employee1,employee2,employee3};
        for (Employee e: employees){
            if(e instanceof Programmer) {
                ((Programmer) e).programmerMethod();
            }
        }
    }




    public static void method(Scanner j){

    }
}