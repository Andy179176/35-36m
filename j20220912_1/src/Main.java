/*
Дана строка, необходимо сформировать и вывести на экран строку вида содержащую первое
и последнее слово исходной строки. Примечание: слова разделены одним/ пробелом,
строка не содержит знаков препинания.
Ограничение: в данной задаче нельзя пользоваться стандартными методам String
кроме charAt() и length(). Например:
 “     Java is a very popular language   ” ->  “Java language”
 “   Java ” ->"Java"
 “Java      language” ->"Java language"
 “” ->  “”
 "  "->""


*/

public class Main {
    public static void main(String[] args) {


        String str="     Java";
        String firstWord="";
        String lastWord="";
        int leftIndex=0;
        int rightIndex=str.length()-1;

        // 1. skip last spaces
        for( ; rightIndex>=0 && str.charAt(rightIndex)==' '; rightIndex-=1 );

        /*
         while (rightIndex>=0 && str.charAt(rightIndex)==' '){
            rightIndex=rightIndex-1;
        }
         */

        // 2. accumulate last word
        for( ; rightIndex>=0 && str.charAt(rightIndex)!=' ';rightIndex-=1){
            lastWord=str.charAt(rightIndex)+lastWord;
        }

        /*
        while (rightIndex>=0 && str.charAt(rightIndex)!=' '){
            lastWord=str.charAt(rightIndex)+lastWord;
            rightIndex=rightIndex-1;
        }
         */

        // 3. skip leading spaces
        for ( ; leftIndex<rightIndex &&  str.charAt(leftIndex)==' '; leftIndex+=1 );

        /*
        while(leftIndex<rightIndex &&  str.charAt(leftIndex)==' '){
            leftIndex+=1;
        }

         */

        //4. accumulate first word
        for ( ; leftIndex<rightIndex &&  str.charAt(leftIndex)!=' '; leftIndex+=1){
            firstWord+=str.charAt(leftIndex);
        }

        /*
        while(leftIndex<rightIndex &&  str.charAt(leftIndex)!=' '){
            firstWord+=str.charAt(leftIndex);
            leftIndex+=1;
        }
         */

        if(firstWord!="" && lastWord!=""){
            System.out.println(firstWord+" "+lastWord);
        } else {
            System.out.println(lastWord);
        }

    }
}