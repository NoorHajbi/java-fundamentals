package classes;

import java.util.*;

public class Restaurant implements Reviewable {
    private final String name;
    private double priceCategory;

    public Restaurant(String name, double priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getPriceCategory() {
        return priceCategory + "$";
    }

    public void setPriceCategory(double priceCategory) {
        this.priceCategory = priceCategory;
    }

    @Override
    public List<Review> getReview() {
        return review;
    }

    @Override
    public void addReview(Review review) {
        this.review.add(review);
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
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", priceCategory=" + getPriceCategory() +
                "\n, Number of reviews=" + review +
                "\n, Rate=" + checkStars() +
                '}';
    }
}
