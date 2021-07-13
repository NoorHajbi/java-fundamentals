package classes;

import java.util.*;

public class Restaurant {
    private final String name;
    private double priceCategory;
    private final List<Review> review = new ArrayList<>();

    public Restaurant(String name, double priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
    }


    public String getName() {
        return name;
    }

    public String getPriceCategory() {
        return priceCategory + "$";
    }

    public void setPriceCategory(double priceCategory) {
        this.priceCategory = priceCategory;
    }

    public List<Review> getReview() {
        return review;
    }

    public void addReview(Review review) {
        this.review.add(review);
        checkStars();
    }

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
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", priceCategory=" + getPriceCategory() +
                "\n, Number of reviews=" + review +
                "\n, Rate=" + checkStars() +
                '}';
    }
}
