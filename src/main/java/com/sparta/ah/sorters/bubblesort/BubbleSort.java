package com.sparta.ah.sorters.bubblesort;

import com.sparta.ah.sorters.Sorter;

public class BubbleSort implements Sorter {

    double start;
    double stop;
    /*
    Returns a sorted array of integers using a bubble sort algorithm
     */
    private static int[] bubbleSortIntegerArray(int[] arrayToSort) {

        int arrayLength = arrayToSort.length;

        //using a temp variable to store when swapping
        int temp = 0;

        // for each number in array
        for (int i = 0; i < arrayLength; i++) {
            // for each number starting from the second,
            // swap with preceding number if it's bigger:
            for (int number = 1; number < (arrayLength - i); number++) {
                if (arrayToSort[number - 1] > arrayToSort[number]) {
                    //swap
                    temp = arrayToSort[number - 1];
                    arrayToSort[number - 1] = arrayToSort[number];
                    arrayToSort[number] = temp;
                }

            }
        }
        return arrayToSort;
    }


    @Override
    public String printSorterType() {
        return "Bubble Sort";
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        start = System.nanoTime();
        int[] sorted = this.bubbleSortIntegerArray(arrayToSort);
        stop = System.nanoTime();
        return sorted;
    }

    @Override
    public double getSortingTime() {
        return stop - start;
    }
}
