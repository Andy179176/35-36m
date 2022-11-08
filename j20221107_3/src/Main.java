public class Main {
    public static void main(String[] args) {

        ArrayProducer arrayProducer= new StaticArrayProducer();
        arrayConsumer(arrayProducer);

    }

    public static void arrayConsumer(ArrayProducer arrayProducer){
        int[] arr= arrayProducer.getArray();
        for (int ell:arr){
            System.out.println(ell);
        }
    }
}
