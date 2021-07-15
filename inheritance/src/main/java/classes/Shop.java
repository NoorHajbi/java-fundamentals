package classes;

import java.util.ArrayList;
import java.util.List;


public class Shop implements Reviewable {
    private String name;
    private String description;
    private double priceCategory;
    private final List<Review> review = new ArrayList<>();


    public Shop(String name, String description, double priceCategory) {
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(double priceCategory) {
        this.priceCategory = priceCategory;
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
        return "Shop {" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priceCategory=" + priceCategory +
                "\n, Shop Review=" + review +
                '}';
    }
}
