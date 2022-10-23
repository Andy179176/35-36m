public class Main {
    public static void main(String[] args) {
        Programmer p1= new Programmer("Jack",4000);
        Programmer p2= new Programmer("Ann",4500);
        QAEngineer q1= new QAEngineer("Stan", 5000);
        QAEngineer q2= new QAEngineer("Tim", 3000);
        Manager m1= new Manager("Nick",5000,2000);

        Employee e0= new QAEngineer("Olga",5000);
        Employee e1= new Manager("Oleg",5000,1000);


        Employee[] employees = {p1,p2,q1,q2,m1};
        for (Employee employee:employees){
            employee.doWork();
            employee.paySalary();
        }
        System.out.println("----------------------------");
        //e1=e0;
        e1.paySalary();

    }
}