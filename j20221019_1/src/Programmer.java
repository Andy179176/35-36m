public class Programmer extends Employee {


    public Programmer(String name, int salary) {
        super(name,salary);
    }

    public void doWork(){
        System.out.println("I'm programmer. I'm write code");
    }

    @Override
    public String toString() {
        return "Programmer: " + name + "(" + salary +")";
    }


}
