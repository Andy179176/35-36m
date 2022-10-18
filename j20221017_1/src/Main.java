public class Main {

 public static void main(String[] args) {
        MyDate d1= new MyDate(6,6,1799);
        Author a1=new Author("Александр","Пушкин", d1);
        Book b1= new Book(1, "Сказка о царе Солтане", a1, "isbn1",10);
        /*
        System.out.println(d1.toString());
        System.out.println(a1.toString());
     System.out.println(b1.toString());
        */

        Book[] books = {
                b1,
                new Book(2,"Сказка о попе и работнике его Балде", a1,"isbn2",6),
                new Book(3,"Руслан и Людмила", a1,"isbn3",12),
                new Book(4,"Роковые яйца", new Author("Михаил", "Булгаков",new MyDate(15,5,1891)),"isbn4",4),
                new Book(5,"Собачье сердце", new Author("Михаил", "Булгаков",new MyDate(15,5,1891)),"isbn5",4),
                new Book(6,"Приключения Эраста Фандорина", new Author("Борис", "Акунин",new MyDate(20,5,1956)),"isbn6",4),
        };

     /*
     for (int i = 0; i < books.length; i++) {
         System.out.println(books[i].toString());
     }
      */

     for(Book b:books){
         System.out.println(b);
     }

        b1.getOut();
     System.out.println(b1);

     System.out.println("Осталось "+ b1.getAvailableItems() + " книг "+ b1.getTitle()
             +"(" + b1.getAuthor()+ ")" );

     b1.getOut();

     System.out.println("Осталось "+ b1.getAvailableItems() + " книг "+ b1.getTitle()
             +"(" + b1.getAuthor()+ ")" );


 }


}