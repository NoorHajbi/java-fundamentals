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
        int six_dice[] = {1, 2, 3, 4, 5, 6};
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
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        avg = sum / arr.length;
        return avg;
    }

    //4. Arrays of Arrays
    //Return the array with the lowest average.
    public static int[] lowestaverage(int[][] weeklyMonthTemperatures) {
        int min = 0, sum, avgArr;
        int[] minArr = weeklyMonthTemperatures[0];
       
        for (int i = 0; i < weeklyMonthTemperatures.length; i++) {
            sum = 0;
            for (int j = 0; j < weeklyMonthTemperatures[i].length; j++) {
                sum += weeklyMonthTemperatures[i][j];
            }
            avgArr = sum / weeklyMonthTemperatures[i].length;
            min = sum / weeklyMonthTemperatures[0].length;

            if (min > avgArr)
                min = avgArr;
                minArr = weeklyMonthTemperatures[i];
        }
        return minArr;
    }

    public static void main(String[] args) {
        System.out.println("Rolling Dice= " + roll(4));
        System.out.println();
        int newArr[] = {1, 2, 1, 4, 5, 6};
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
    System.out.println("Lowest Average Array= " +Arrays.toString(lowestaverage(weeklyMonthTemperatures))); 
    }
}