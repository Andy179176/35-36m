public class Person {

    String name;
    int age;


    public void print(){
        System.out.println(name + "("+ age+")");
    }

    public void birthday(){
        System.out.println("Happy birthday!");
        age++;
    }


}
