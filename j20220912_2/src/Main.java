/*
Дана строка и 2 числа int: startIndex, endIndex. Необходимо получить и вывести на экран строку,
         которая состоит из всех символов исходной строки, начиная с позиции startIndex (включительно)
         до позиции endIndex (не включительно).
         Если startIndex  «не попадает в строку» или больше endIndex выводим “error”.
         Если endIndex не «попадает в строку»,  выводим, начиная со startIndex до конца строки.
         Ограничение: в данной задаче нельзя пользоваться стандартными методам String кроме charAt() и length().
                “Java is a very popular language”,  startIndex=5  endIndex=13  -> “is a ver”
                “Java is a very popular language”,  startIndex=5  endIndex=-13  -> error
                “Java is a very popular language”,  startIndex=5  endIndex=136  -> “is a very popular language”



 */


public class Main {
    public static void main(String[] args) {
        String str= "Java is a very popular language";
        int startIndex=5;
        int endIndex=136;
        String res="";

        if ( startIndex<0 || startIndex>= str.length() || startIndex>endIndex ){
            System.out.println("error!");
        } else {
            res= ""+str.charAt(startIndex); //res="i"
            for (int i=startIndex+1; i<endIndex && i<str.length(); i+=1){
                res+=str.charAt(i);
            }
        }
        System.out.println(res);
    }
}