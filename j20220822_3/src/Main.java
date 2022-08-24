public class Main {
    public static void main(String[] args) {

        int flask1= 500;
        int flask2= 200;

        if(flask1>flask2) {
            System.out.println("flask1 is hot");
        } else {
            System.out.println("flask2 is hot");
        }

       String lang="ch";
        System.out.println(lang);

        if (lang.equals("ru")){

            System.out.println("Привет" + " lang is \""+lang+"\"");
        } else {
            if (lang=="de"){
                System.out.println("hallo!"+ " lang is \""+lang+"\"");
            } else {
                System.out.println("hello" + " lang is \""+lang+"\"");
            }
        }
        System.out.println("finish");


        // ----------------------------------
        System.out.println("--------------------------------------------");
        if (lang=="ru"){
            System.out.println("Привет" + " lang is \""+lang+"\"");
        }
        if (lang=="de"){
            System.out.println("hallo!"+ " lang is \""+lang+"\"");
        }
        if (lang!="ru" && lang!="de") {
            System.out.println("hello" + " lang is \"" + lang + "\"");
        }

        /*
        if () {}  else {}

        if () {}






         */




    }
}