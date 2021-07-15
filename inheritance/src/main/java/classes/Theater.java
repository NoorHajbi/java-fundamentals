package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Theater implements Reviewable {
    private String name;
    private final List<String> movie = new ArrayList<>();
    private final Map<String, Review> reviews = new HashMap<>();

    public Map<String, Review> getReviews() {
        return reviews;
    }

    public Theater(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMovie(String name) {
        this.movie.add(name);
    }

    public void removeMovie(String name) {
        this.movie.remove(name);
    }

    public List<String> getMovie() {
        return movie;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addReview(Review review) {
        this.review.add(review);
        checkStars();
    }

    //Maryam Najjar Helped me to write this method
    public void addReview(Review review, String movieName) {
        if (movie.contains(movieName)) {
            reviews.put(movieName, review);
            System.out.println("Thank You For Visiting");
        } else {
            System.out.println("Not defined Movie");
        }
        checkStars();
    }

    @Override
    public int checkStars() {
        int newStars = 0;
        if (getReview().size() > 0) {
            for (int i = 0; i < getReview().size(); i++) {
                newStars += getReview().get(i).getStars();
            }
            newStars = newStars / review.size();
        }
        return newStars;
    }

    @Override
    public List<Review> getReview() {
        return review;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name=' " + name + '\'' +
                ", movie= " + movie +
                "\n, Theater Reviews= " + review +
                "\n, Movie Reviews= " + reviews +
                '}';
    }
}
