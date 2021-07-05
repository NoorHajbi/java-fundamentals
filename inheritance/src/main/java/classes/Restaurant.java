package classes;

import java.util.List;

public class Restaurant {
    //(1)
    //Test that your classes.Restaurant constructor is behaving reasonably.
    //Implement a reasonable toString method for Restaurants.
    //Write a test to create an instance of classes.Restaurant and ensure that its toString is working properly.
    private final String name;
    private int stars = 1; //-5
    private double priceCategory;
    //    public Review review;
    private List<Review> review;


//(5)
// When you associate a review with a restaurant, 
//that restaurant’s star rating should change. 
//Ensure that your addReview method updates the Restaurant star rating appropriately,
// and add tests.
// (In particular, ensure that if you’re trying to call addReview when the restaurant and the review are already associated, the star rating of the restaurant does not update.)

    public Restaurant(String name, double priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
    }

    public List<Review> getReviews() {
        return review;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return priceCategory + "$";
    }

    public int getStar() {
        return stars;
    }

    public void setPrice(double priceCategory) {
        this.priceCategory = priceCategory;
    }

    public void setStar(int stars) {
        this.stars = stars;
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price=" + priceCategory + "$" +
                "\n" + review +
                '}';
    }


}
