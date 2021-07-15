package classes;

import java.util.ArrayList;
import java.util.List;

public interface Reviewable {
    List<Review> review = new ArrayList<>();

    List<Review> getReview();

    String getName();

    void addReview(Review review);

    int checkStars();
}
