import java.util.Comparator;

public class ComparatorByRating implements Comparator<Film> {
    @Override
    public int compare(Film o1, Film o2) {
        //return (int) (o1.getRating()*10-o2.getRating()*10);
        double rating1=o1.getRating();
        double rating2=o2.getRating();

        if(rating1>rating2) {
            return  1;
        } else if (rating1<rating2){
            return -1;
        } else {
            return 0;
        }

    }
}
