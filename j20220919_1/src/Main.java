public class Main {
    public static void main(String[] args) {
       int[] arr = {1,3,4};
       int[] arr2 = new int[10];
       int[] arr3;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        arr2[3]=19;
        arr2[1]=0;

            System.out.println("arr.length= "+arr.length);
        System.out.println("---------------------------------------");
        printArray(arr);
        System.out.println("----------------- arr 2 -------------");
        printArray(arr2);

    }
    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i+=1){
            System.out.println(arr[i]);
        }
    }
}