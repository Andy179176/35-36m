public class Film implements Comparable<Film>{
    private String title;
    private String genre;
    private double rating;
    private int year;

    public Film(String title, String genre, double rating, int year) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return title + "(" + year + ") " + genre + " " + rating;

    }

    @Override
    public int compareTo(Film o) {
        return title.compareTo(o.title);

    }
}
