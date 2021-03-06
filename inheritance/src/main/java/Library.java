import classes.Restaurant;
import classes.Review;
import classes.Shop;
import classes.Theater;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {
    public static void main(String[] args) {
        //Restaurant
        Restaurant testRes = new Restaurant("Burger", 262.2);
        //Review
        Review testRev = new Review("Great!", "Noor", 5);
        Review testev = new Review("Not Good", "Hala", 1);
        //Shop
        Shop testShop = new Shop("Avenue Mall","Everything",20.2);
        //Movies
        String movie1="The Call";
        String movie2="A Quiet Place";
        String movie3="Don't Breathe";
        //Theater
        Theater testTheater = new Theater("Rex Theatre");


//        //Print Review
//
//        System.out.println("Name: " + testRev.getAuthor());
//        System.out.println();
//        System.out.println("Body: " + testRev.getBody());
//        System.out.println();
//        System.out.println("Star: " + testRev.getStars());
//        System.out.println();
//        System.out.println("Review: " + testRev);
//        System.out.println();
//        //AfterReview
//        System.out.println(testev);
//        System.out.println("Star: " + testev.getStars());
//        System.out.println("Name: " + testRes);

        //Print Restaurant
//        System.out.println("before "+ testRes);
//        System.out.println("Name: " + testRes.getName());
//        testRes.addReview(testRev);
//        System.out.println();
//        System.out.println("review: " + testRes.getReview());
//        System.out.println("Stars "+ testRes.checkStars());
//        System.out.println("After "+ testRes);
//        System.out.println();
//        System.out.println("Price: " + testRes.getPriceCategory());
//        System.out.println();
//        System.out.println("Before: " + testRes);

        //Shop
//        System.out.println("Before: " + testShop);
//        System.out.println("name: " + testShop.getName());
//        System.out.println("description: " + testShop.getDescription());
//        System.out.println("priceCategory: " + testShop.getPriceCategory());
//        System.out.println("Review: " + testShop.getReview());
//        testShop.addReview(testRev);
//        System.out.println("Review After: " + testShop.getReview());
//        System.out.println(" After: " + testShop);

        //Theater
        System.out.println("Before: " + testTheater);
        System.out.println();
        System.out.println("name: " + testTheater.getName());
        System.out.println();
        System.out.println("before Theater review: " + testTheater.getReview());
        System.out.println();
        System.out.println("before Movie review: " + testTheater.getReviews());
        System.out.println();
        System.out.println("before add Movie: " + testTheater.getMovie());
        System.out.println();
        testTheater.addMovie(movie1);
        testTheater.addMovie(movie2);
        testTheater.removeMovie(movie1);
        System.out.println("After remove One Movie: " + testTheater.getMovie());
        System.out.println();
        testTheater.removeMovie(movie2);
        System.out.println("After remove all Movies: " + testTheater.getMovie());
        System.out.println();
        testTheater.addMovie(movie1);
        testTheater.addMovie(movie2);
        testTheater.addMovie(movie3);
        System.out.println("After add Movie: " + testTheater.getMovie());
        System.out.println();
        testTheater.addReview(testRev);
        System.out.println("After Theater review: " + testTheater.getReview());
        System.out.println();
        testTheater.addReview(testRev,movie1);
        System.out.println("after add Movie Review: " + testTheater.getReviews());
        System.out.println();
        testTheater.addReview(testRev,"hello");
        System.out.println("after add review for non existing Movie: " + testTheater.getReviews());
        System.out.println();
        testTheater.addReview(testev,movie2);
        System.out.println("after add multiple reviews: " + testTheater.getReviews());
        System.out.println();
        System.out.println("After: " + testTheater);



    }
}
