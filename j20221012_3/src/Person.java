public class Person {

    String name;
    MyDate birthday;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + "'" +
                ", birthday=" + birthday +
                '}';
    }

    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday =birthday;
    }
    public void print(){
        System.out.println(name + "(" + birthday.toString()+ ")");

    }

}
