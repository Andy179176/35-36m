public class Main {
    public static void main(String[] args) {
        int[] arr= {2,1,3,4,5,6,7,8};
        print(arr);
        sort(arr);
        print(arr);

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + i + "]=" + arr[i] +"  ");
        }
        System.out.println();
    }
    public static void sort(int[] arr) {
        boolean swapFlag=true;
        for (int j=0;j<arr.length && swapFlag;j++) {
            swapFlag=false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swapFlag = true;
                    swap(arr, i, i + 1);
                }
            }
            print(arr);
        }
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }



}