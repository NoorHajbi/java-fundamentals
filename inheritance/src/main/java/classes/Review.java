package classes;

import java.util.*;

//        Test that your constructor is working reasonably.
//        Implement a reasonable toString method for Reviews.
//        Write a test to create an instance of Review and ensure that its toString is working properly.
public class Review {
    private String body; //0-5
    private final String author;
    private int stars;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = checkRate(stars);
    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    private int checkRate(int stars) {
        if (stars >= 1 && stars <= 5)
            return stars;
        else
            return -1;
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
