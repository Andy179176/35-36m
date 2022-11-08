public class StaticArrayProducer implements ArrayProducer{
    @Override
    public int[] getArray() {
        return new int[]{1,2,3,4,5};
    }
}
