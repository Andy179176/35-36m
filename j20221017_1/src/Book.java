public class Book {
    private long id;
    private String title;
    private Author author;
    private String isbn;
    private int availableItems;

    public Book(long id, String title, Author author, String isbn, int availableItems) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availableItems = availableItems;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", isbn='" + isbn + '\'' +
                ", availableItems=" + availableItems +
                '}';
    }

    public long getOut(){
        if (checkAvailability()) {
            availableItems--;
            System.out.println("Выдана книга: " + this);
        } else {
            System.out.println("Все книги "+ title+ " разобраны");
        }
        return availableItems;
    }
    private boolean checkAvailability(){
        return availableItems>0;
    }

    public String getTitle(){
        return title;
    }
    public int getAvailableItems(){
        return availableItems;
    }
    public  Author getAuthor(){
        return author;
    }

    public long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }
}
