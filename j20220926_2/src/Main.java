public class Main {
    /*
    {4, 6, 8, 9, 1, -2 ,5, 3}


     */


    public static void main(String[] args) {
        int[] arr = {4, 6, 8, -9, 1, -2 ,5, 3};
        //int[] arr = {4, -6, 8, -9, 1, -2 ,5, 3};
        System.out.println(getSecondMin(arr));
    }

    public static int getSecondMin(int[] arr ){
        int min1= arr[0];
        int min2= arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if(min1>arr[i]){
                min2=min1;
                min1=arr[i];
            } else
            if(min2>arr[i]){    //   min1<arr[i]<min2
                min2=arr[i];
            }
        }
        //System.out.println(min1);
        return  min2;
    }

}