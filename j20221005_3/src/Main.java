public class Main {
    public static void main(String[] args) {
        int[] arr= {-5,2,-1,7,-3,9,0,-10};
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

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int index=min(arr,i);
            swap(arr, i , index);
        }
    }
    public static int min(int[] arr, int start) {
        int indexMin = start;
        for (int i = start+1; i < arr.length; i++) {
            if (arr[i] < arr[indexMin]) {
                indexMin = i;
            }
        }
        return indexMin;
   }
}

