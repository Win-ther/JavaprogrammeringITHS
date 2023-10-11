package se.iths.Uppgifter.Vecka3.Uppgift4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movie {
    private final String TITLE;
    private final String DIRECTOR;
    private final String ACTORS;
    private ArrayList<String> reviews;

    public Movie(String TITLE, String DIRECTOR, String ACTORS) {
        this.TITLE = TITLE;
        this.DIRECTOR = DIRECTOR;
        this.ACTORS = ACTORS;
        this.reviews = new ArrayList<>();
    }

    public String getTITLE() {
        return TITLE;
    }

    public String getDIRECTOR() {
        return DIRECTOR;
    }

    public String getACTORS() {
        return ACTORS;
    }

    public List<String> getReviews() {
        return Collections.unmodifiableList(reviews);
    }
    public void addReview(String review){
        reviews.add(review);
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Transformers","Michael Bay","Robots?");
        movie.addReview("Bad");
        movie.addReview("Sad");
        movie.addReview("Good");
        movie.addReview("Not4me");
        movie.addReview("Bed edit I tried to write Bad");
        System.out.println(movie.getReviews().toString());
    }
}
