/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import java.util.*;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }


    //1. Rolling Dice
    public static ArrayList<Integer> roll(int n) {
        int[] six_dice = {1, 2, 3, 4, 5, 6};
        int random;
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            random = new Random().nextInt(six_dice.length);
            newArr.add(six_dice[random]);
        }
        return newArr;
    }

    //2. Contains Duplicates
    public static boolean containsDuplicates(int[] dup) {
        for (int i = 1; i < dup.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (dup[i] == dup[j])
                    return true;
            }
        }
        return false;
    }

    //3. Calculating Averages
    public static float calculatingAvg(int[] arr) {
        float sum = 0, avg = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        avg = sum / arr.length;
        return avg;
    }

    //4. Arrays of Arrays
    //Return the array with the lowest average.
    public static int[] lowestaverage(int[][] weeklyMonthTemperatures) {
        int min = 0, sum, avgArr;
        int[] minArr = weeklyMonthTemperatures[0];

        for (int[] weeklyMonthTemperature : weeklyMonthTemperatures) {
            sum = 0;
            for (int i : weeklyMonthTemperature) {
                sum += i;
            }
            avgArr = sum / weeklyMonthTemperature.length;
            min = sum / weeklyMonthTemperatures[0].length;

            if (min > avgArr)
                min = avgArr;
            minArr = weeklyMonthTemperature;
        }
        return minArr;
    }

    /************************************************/
    //lab03- methods
    //1. Analyzing Weather Data
    public static String weatherData(int[][] temperatures) {
        HashSet<Integer> hashSet = new HashSet<>();
        int min = temperatures[0][0], max = temperatures[0][0];
        StringBuilder returnFormat = new StringBuilder();
        for (int[] items : temperatures) {
            for (int day : items) {
                hashSet.add(day);
            }
        }
        for (int[] temperature : temperatures) {
            for (int i : temperature) {
                if (i >= max) {
                    max = i;
                } else if (i <= min) {
                    min = i;
                }
            }
        }
        System.out.println("High: " + max);
        System.out.println("Low: " + min);
        for (int i = min; i < max; i++) {
            if (!hashSet.contains(i))
                returnFormat.append("Never saw temperature: ").append(i).append("\n");
        }
        return returnFormat.toString();
    }

    public static String tally(List<String> votes) {
        int firstPerson = 0, secondPerson = 0;
        for (String item : votes) {
            if (item.equals("Bush")) {
                firstPerson += 1;
            } else {
                secondPerson += 1;
            }
        }
        if (firstPerson > secondPerson) {
            return "Bush";
        } else {
            return "Shrub";
        }
    }

    public static void main(String[] args) {
        System.out.println("Rolling Dice= " + roll(4));
        System.out.println();
        int[] newArr = {1, 2, 1, 4, 5, 6};
        System.out.println("Contains Duplicates= " + containsDuplicates(newArr));
        System.out.println();
        System.out.println("Calculating Averages= " + calculatingAvg(newArr));
        System.out.println();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println("Lowest Average Array= " + Arrays.toString(lowestaverage(weeklyMonthTemperatures)));

        // Lab03
        System.out.println(weatherData(weeklyMonthTemperatures));
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        System.out.println(tally(votes) + " received the most votes!");

    }
}