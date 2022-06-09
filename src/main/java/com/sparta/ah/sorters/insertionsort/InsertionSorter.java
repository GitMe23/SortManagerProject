package com.sparta.ah.sorters.insertionsort;

import com.sparta.ah.sorters.Sorter;

public class InsertionSorter implements Sorter {

    double start;
    double stop;
    public InsertionSorter() {
    }



    private static void sort(int[] array) {

        // loop through each:
        for(int i=1; i < array.length; i++) {

                // assign each int starting from index 1 and assign each int before it
               int key = array[i];
               int j = i-1;

               // while preceding int is bigger than each looped value,
                //
            while (j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = key;


        }
    }

    @Override
    public String printSorterType() {
        return "Insertion Sorter";
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        start = System.nanoTime();
        InsertionSorter.sort(arrayToSort);
        stop = System.nanoTime();
        return arrayToSort;
    }

    @Override
    public double getSortingTime() {
        return stop - start;
    }
}
