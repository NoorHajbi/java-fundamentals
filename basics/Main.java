package basics;

public class Main {
    public Main() {
    }

    public static String pluralize(String word, int num) {
        return num != 0 && num <= 1 ? word : word + "s";
    }

    public static void flipNHeads(int n) {
        int flipsCount = 0;
        int headCount = 0;

        for (int i = 1; i <= n; ++i) {
            Random r = new Random();
            double flips = r.nextDouble();
            if (flips < 0.5D) {
                System.out.println("tail");
            } else {
                System.out.println("head");
                ++headCount;
            }

            ++flipsCount;
        }

        System.out.println("It took " + flipsCount + " flips to flip " + headCount + " head in a row.");
    }

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
        flipNHeads(4);
        flipNHeads(1);
        flipNHeads(6);
        clock();
    }
}