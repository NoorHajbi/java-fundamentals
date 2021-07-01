package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
    public Main() {
    }

    // pluralize function :
    // pluralized word will end with "s"
    public static String pluralize(String word, int num) {
        return num != 0 && num <= 1 ? word : word + "s";
    }

    // flipNHeads that accepts an integer n and flips coins until n heads are
    // flipped in a row.
    static void flipNHeads(int n) {
        int flipsCount = 0, headCount = 0;
        double flips;
        Random r = new Random();
        while (headCount < n) {
            flips = r.nextDouble();
            if (flips < 0.5) {
                System.out.println("tails");
                flipsCount++;
                headCount = 0;
            } else {
                System.out.println("heads");
                flipsCount++;
                headCount++;
            }
        }
        System.out.println(
                "It took " + flipsCount + pluralize(" flip", headCount) + " to flip " + n + " heads in a row.");
    }

    // clock function prints out the current time to the console, second by second.
    public static void clock() {
        int perSec = 0;
        while (true) {
            int second;
            String time;
            do {
                LocalDateTime now = LocalDateTime.now();
                second = now.getSecond();
                time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            } while (perSec == second);

            perSec = second;
            System.out.println(time);
        }
    }

    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        // flipNHeads(4);
        // flipNHeads(1);
        flipNHeads(6);
        clock();
    }
}