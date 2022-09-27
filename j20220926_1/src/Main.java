public class Main {
    /*
    Задача №1. Дан массив целых чисел. Реализовать метод, который возвращает
    минимальное значение в данном массиве. Например: {1,3,6,-1,4,-5,9} -> -5

        51 5515 51 -88 88 3 20 -51 5515 51 88 88 3 -20 83 0
        -1 -15 -3 20 51 5515 51 88 8 0 -20

     */


    public static void main(String[] args) {
        /*
        int arr[] = {51, 5515, 51, -88, 88, 3, 20, -51, 5515, 51, 88, 88, 3, -20, 83, 0,
                -1, -15, -3, 20, 51, 585,51, 88, 8, 0, -20 };

         */
        int arr[] = {51, 5515, 51, 8, 10 };
        printIntArray(arr);
        System.out.println("Min= " + getMin(arr));

        System.out.println("--------------------------------");
        String[] arrStr= {"qwer", "qwertyui","asd","lk", "h",""};
        System.out.println(getIndexOfLongestString(arrStr));
        System.out.println(  arrStr [  getIndexOfLongestString(arrStr)   ]   );

        System.out.println( arrStr[ getIndexOfLongestString(arrStr) ] )


    }


    public static void  printIntArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%2d]=%3d   ",i,arr[i]);
            if(i%5==0&&i!=0){
                System.out.println();
            }
        }
        System.out.println();
    }

    public static int getMin(int[] arr) {
        int min=arr[0];
        for (int i = 1   ;     i <  arr.length  ;     i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;

    }



    /*
    Задача №2. Дан массив строк. Реализовать метод, который возвращает
    индекс самой длинной строки в данном массиве.
    Например: {“qwe”,”axcvbn”,”qwertyuio”,”qas”} -> 2

     */
     public static int getIndexOfLongestString(String[] strings){
         int indexMax=0;
         for (int i=0; i< strings.length; i++){
             if(strings[i].length() > strings[indexMax].length()){
                 indexMax=i;
             }
         }
         return indexMax;
     }

}