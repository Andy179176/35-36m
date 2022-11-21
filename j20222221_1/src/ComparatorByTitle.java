import java.util.Comparator;

public class ComparatorByTitle implements Comparator<Film> {
    @Override
    public int compare(Film o1, Film o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
