package com.sparta.ah;

import java.util.Arrays;

public class DisplayManager {

    public static void printGreeting() {
        System.out.println("--------------- START ---------------");
        System.out.println("Welcome to Andy's Sorter Selector.");
        System.out.println("Choose from the following algorithms to sort a randomised array of values.");
        System.out.println("1. BinaryTree Sorter");
        System.out.println("2. Bubble Sorter");

    }

    public static void printResults(Sorter sorter, int[] arrayToSort) {
        System.out.println("-------------- RESULTS --------------");
        System.out.print("Random array to sort: ");
        System.out.println(Arrays.toString(arrayToSort));
        System.out.print("Array after using the " + sorter.printSorterType() + " algorithm: ");
        long startTime = System.nanoTime();
        int[] sortedArray = sorter.sortArray(arrayToSort);
        long elapsedTime = System.nanoTime() - startTime ;
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("Sorting time for " + sorter.printSorterType() + ": " + elapsedTime + " nanoseconds.");
        System.out.println("---------------- END ----------------");
    }
}
