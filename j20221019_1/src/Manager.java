public class Manager extends Employee{

    private int bonus;


    public Manager(String name, int salary, int bonus) {
        super(name,salary);
        this.bonus=bonus;
    }


    public void doWork(){
        System.out.println("I'm lazy manager but I have big salary");
    }

    public void  paySalary(){
        System.out.println("All task done. The salary is " + salary + " bonus " + bonus );
    }

    @Override
    public String toString() {
        return "Programmer: " + name + "(" + salary +")";
    }
}
