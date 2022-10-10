public class Main {
    public static void main(String[] args) {
        double     a    = 10;
        Student st1 = new Student();
        st1.name = "Jack";
        st1.rate = 4.1;

        //print(st1);

        Student st2 = new Student();
        st2.name = "John";
        st2.rate = 3.8;

        //print(st2);

        Student[] arr= {st1,st2};
        print(arr);
    }

    public static void print(Student qwe){
        System.out.println(qwe.name + "(" + qwe.rate+")");
    }

    public static void print(Student[] arr){
        for (int i = 0; i < arr.length ; i++) {
            print(arr[i]);
        }
    }




}