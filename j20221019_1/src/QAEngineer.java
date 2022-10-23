public class QAEngineer extends Employee{

    public QAEngineer(String name, int salary) {
        super(name,salary);
    }


    public void doWork(){
        System.out.println("I'm QAEngineer. I'm test code");
    }

    @Override
    public String toString() {
        return "QAEngineer: " + name + "(" + salary +")";
    }
}
