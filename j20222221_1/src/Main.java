/*
Создать класс Film и полями: название, жанр, рейтинг, год;
        Создать список фильмов. Программа должна спрашивать, какая
        сортировка нужна пользователю (по названию, по рейтингу, по
        жанру или году) и выводить отсортированный список на экран.



 */


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film("Django freeman", "thriller      ", 9.2, 2011));
        films.add(new Film("Begining      ", "action        ", 9.0, 2018));
        films.add(new Film("Avatar        ", "fantasy       ", 9.5, 2005));
        films.add(new Film("Catwomen      ", "action,fantasy", 9.3, 2007));

        Comparator<Film> comparator=getFilmComparator();
        while(comparator!=null){
            List<Film> sortedList=sortFilms(films,comparator);
            printList(sortedList);
            comparator=getFilmComparator();
        }


       }

       public static void  printList(List<Film> list){
               for (Film f:list){
                   System.out.println(f);
               }
        }



       public static List<Film> sortFilms(List<Film> list, Comparator<Film> filmComparator){

        List<Film> newList= new ArrayList<>(list);
        newList.sort(filmComparator);
        return newList;
       }

       public static Comparator<Film> getFilmComparator(){
           Scanner sc = new Scanner(System.in);

               System.out.println();
               System.out.print("1. sort by title  ");
               System.out.print("2. sort by genre  ");
               System.out.print("3. sort by rating  ");
               System.out.print("4. sort by year  ");
               System.out.print("0. exit  ");
               System.out.println();

               int item = sc.nextInt();
               Comparator<Film> filmComparator=null;
               switch (item) {
                   case 1:
                       filmComparator=new ComparatorByTitle();
                       break;
                   case 2:
                       filmComparator=new ComparatorByGenre();
                       break;
                   case 3:
                       filmComparator=new ComparatorByRating();

                       break;
                   case 4:
                       filmComparator=new ComparatorByYear();
                       break;
               }
               return filmComparator;
       }

}