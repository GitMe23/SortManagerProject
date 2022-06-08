package com.sparta.ah.sorters.bubblesort;

import com.sparta.ah.Sorter;
import com.sparta.ah.logging.CustomFilter;
import com.sparta.ah.logging.CustomFormatter;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class BubbleSort implements Sorter {


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
        int[] sorted = this.bubbleSortIntegerArray(arrayToSort);
        return sorted;
    }
}
