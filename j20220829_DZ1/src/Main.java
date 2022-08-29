/*
Представьте, что вы пишите программу для онлайн кинотеатра. У вас известно
возрастное ограничение  фильма и возраст клиента (естественно заданы в виде переменных).
Ваша программа должна  выдавать на экран: «вы можете смотреть этот фильм»
или «данный контент вам не доступен»

 */

public class Main {
    public static void main(String[] args) {
        int age=16;
        int ageLimit=18;

        if(age>=ageLimit){
            System.out.println("You can");
        } else {
            System.out.println("not");
        }

    }
}