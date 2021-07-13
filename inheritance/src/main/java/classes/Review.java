package classes;

import java.util.*;

public class Review implements ReviewInterface {
    private String body;
    private final String author;
    private int stars;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = checkRate(stars);
    }

    public int checkRate(int stars) {
        if (stars >= 0 && stars <= 5)
            return stars;
        else {
            System.out.println("Please rate from 0-5");
            Scanner sc = new Scanner(System.in);
            int newStars = sc.nextInt();
            return checkRate(newStars);
        }
    }

    @Override
    public String getBody() {
        return body;
    }

    @Override
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getStars() {
        return stars;
    }

    @Override
    public void setStars(int stars) {
        this.stars = stars;
    }


    @Override
    public String toString() {
        return "Review{" +
                ", body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars='" + stars + '\'' +
                '}';
    }
}
