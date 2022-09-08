/*
Дана строка, состоящая из нескольких слов разделенных пробелам,
необходимо сформировать и вывести на экран строку вида содержащую первое
и последнее слово исходной строки. Примечание: слова разделены одним пробелом,
строка не содержит знаков препинания.
Ограничение: в данной задаче нельзя пользоваться стандартными методам String
кроме charAt() и length(). Например:
 “     Java is a very popular language   ” ->  “Java language”
*/

public class Main {
    public static void main(String[] args) {
        String str= "   Java is a very popular language    ";
        String firstWord="";
        String lastWord="";
        int index=0;


        char ch=str.charAt(index);
        while(ch==' '){
            index+=1;
            ch=str.charAt(index);
        }
        // get first word
        while (ch!=' '){
            firstWord+=ch;  // firstWord=firstWord+ch;
            index+=1;
            if(index<str.length()) {
                ch = str.charAt(index);
            } else {
                break;
            }
        }

        index= str.length()-1;
        ch = str.charAt(index);
        while (ch==' '){
            index-=1;
            ch = str.charAt(index);
        }

        // get last word
        while (ch!=' '){
            lastWord= ch+lastWord;
            index-=1;
            ch=str.charAt(index);
        }


        String result= firstWord+" "+lastWord;
        System.out.println(result);
    }
}


