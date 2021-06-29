package com.company;

import java.time.LocalDateTime;
import java.util.Random;
import java.time.format.DateTimeFormatter;

public class Main {
    public static String pluralize(String word, int num) {
        if (num == 0 || num > 1)
            return word + "s";
        else
            return word;
    }

    public static void flipNHeads(int n) {
        int flipsCount = 0, headCount = 0;
        Random r;
        double flips;
        for (int i = 1; i<= n; i++) {
            r = new Random();
            flips = r.nextDouble();
            if (flips < 0.5) {
                System.out.println("tail");
            } else {
                System.out.println("head");
                headCount++;
            }
            flipsCount++;
        }
        System.out.println("It took "+ flipsCount + " flips to flip " + headCount + " head in a row.");
    }


    public  static void  clock (){
        int perSec = 0;
        while (true){
            LocalDateTime now = LocalDateTime.now();
            int second = now.getSecond();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            if(perSec != second){
                perSec = second;
                System.out.println(time);
            }
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
