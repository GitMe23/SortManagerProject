package com.sparta.ah;

import com.sparta.ah.sorters.Sorter;

import java.util.Arrays;

public class DisplayManager {

    public static void displayMainMenu() {
        System.out.println("");
        System.out.println("-------------------- START --------------------");
        System.out.println("");
        System.out.println("       Welcome to Andy's Sorter Selector");
        System.out.println("");
    }
    public static void displayProgram() {
        System.out.println("");
        System.out.println("Choose from the following algorithms to sort a randomised array of values.");
        System.out.println("");
        System.out.println("1. Binary Tree Sorter");
        System.out.println("2. Bubble Sorter");
        System.out.println("3. Insertion Sorter");
        System.out.println("4. Quick Sorter");
        System.out.println("");
    }

    public static void printResults(Sorter sorter, int[] arrayToSort) {
        System.out.println("");
        System.out.println("------------------- RESULTS -------------------");
        System.out.println("");
        System.out.println("Random array to sort: ");
        System.out.println(Arrays.toString(arrayToSort));
        System.out.println("");
        System.out.println("Array after sorting with the " + sorter.printSorterType() + " algorithm: ");
        int[] sortedArray = sorter.sortArray(arrayToSort);
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("");
        System.out.println("Sorting time for " + sorter.printSorterType() + ": "
                + sorter.getSortingTime() + " nanoseconds / "
                + sorter.getSortingTime() / 1_000_000 + " milliseconds.");
        System.out.println("");

    }
}
