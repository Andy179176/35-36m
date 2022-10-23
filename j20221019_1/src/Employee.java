public class Employee {
    protected String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void  paySalary(){
        System.out.println(name + ":All task done.  The salary is " + salary);
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void doWork(){

    }

}
