import java.util.ArrayList;
import java.util.List;


public class Movies {
    private final String title;
    private final String studio;
    private final String rating;
    Movies(String title, String studio, String rating)
    {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    Movies(String title, String studio)
    {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }
    void printDetails()
    {
        System.out.println("Movie Title: " + title);
        System.out.println("Studio: "+ studio);
        System.out.println("Rating: "+ rating);
    }


    public static List<String> getPg(List<Movies> moviesList) {
        List<String> movieWithPGRating = new ArrayList<>();

        for (Movies movieName : moviesList) {
            if (movieName.rating.equals("PG")) {
                movieWithPGRating.add(movieName.title);
            }
        }
        return movieWithPGRating;
    }
    public static void main(String[] args) {
        ArrayList<Movies> moviesList = new ArrayList<>();
        Movies m1 = new Movies("BatMan Begins","Warner bros","PG-13");
        moviesList.add(m1);
        m1.printDetails();
        System.out.println();

        Movies m2 = new Movies("Fight Club","Fox Pictures", "R");
        moviesList.add(m2);
        m2.printDetails();
        System.out.println();


        Movies m3 = new Movies("Inception","Warner bros");
        moviesList.add(m3);
        m3.printDetails();
        System.out.println();

        System.out.println("Movies with PG Rating : ");
        List<String> detailsFromGetPg = getPg(moviesList);
        for(String movieTitle : detailsFromGetPg){
            System.out.println(movieTitle);
        }
    }
}
