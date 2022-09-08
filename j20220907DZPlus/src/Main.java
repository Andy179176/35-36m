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

Решение:
1. Начинаем с конца строки. Перебираем символлы, пока не попадется буква, или не
   достигнем начала строки. Таким образом пропускаем все пробелы в конце строки.
   В конце цикла rightIndex - позиция последней буквы в строке или 0, если строка
   была пустая

2. Начинаем с rightIndex. Перебираем символлы, пока не попадется ' ', или не
   достигнем начала строки. Записываем символы в lastWord. В конце цикла lastWord
   содержит последнее слово или пустое, если строка была пустая.

3. Начинаем с начала строки. Перебираем символлы, пока не попадется буква, или не
   достигнем позиции rightIndex (rightIndex точно меньше позиции конца строки).
   Таким образом пропускаем все пробелы в начале строки. В конце цикла leftIndex
    - позиция первой буквы в строке или равно rightIndex, если в строке только одно
    слово, или строка была пустая

4.  Начинаем с leftIndex. Перебираем символлы, пока не попадется ' ', или не
   достигнем позиции rightIndex. Записываем символы в firstWord.

5. Если набрали и firstWord и lastWord выводим оба, иначе только lastWord
 */




public class Main {
    public static void main(String[] args) {
        String str="     Java is a very popular language   ";
        String firstWord="";
        String lastWord="";
        int leftIndex=0;
        int rightIndex=str.length()-1;

        // 1. skip last spaces
        while (rightIndex>=0 && str.charAt(rightIndex)==' '){
            rightIndex=rightIndex-1;
        }
        // 2. accumulate last word
        while (rightIndex>=0 && str.charAt(rightIndex)!=' '){
            lastWord=str.charAt(rightIndex)+lastWord;
            rightIndex=rightIndex-1;
        }
        // 3. skip leading spaces
        while(leftIndex<rightIndex &&  str.charAt(leftIndex)==' '){
            leftIndex+=1;
        }

        //4. accumulate first word
        while(leftIndex<rightIndex &&  str.charAt(leftIndex)!=' '){
            firstWord+=str.charAt(leftIndex);
            leftIndex+=1;
        }
        if(firstWord!="" && lastWord!=""){
            System.out.println(firstWord+" "+lastWord);
        } else {
            System.out.println(lastWord);
        }

    }
}