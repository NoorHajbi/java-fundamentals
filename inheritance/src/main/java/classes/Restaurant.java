package classes;

public class Restaurant {


    //Test that your classes.Restaurant constructor is behaving reasonably.
    //Implement a reasonable toString method for Restaurants.
    //Write a test to create an instance of classes.Restaurant and ensure that its toString is working properly.
    private final String name;
    private int stars=1; //-5
    private double price;

    public Restaurant(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStar() {
        return stars;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStar(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price=" + price +"$"+
                '}';
    }
}
