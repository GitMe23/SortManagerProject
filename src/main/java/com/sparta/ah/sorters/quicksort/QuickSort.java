package com.sparta.ah.sorters.quicksort;

import com.sparta.ah.sorters.Sorter;

public class QuickSort implements Sorter {

    double start;
    double stop;
    private int[] numbers;


    public int[] sortArray(int[] arrayToSort) {
        if (arrayToSort.length < 1) return arrayToSort;
        this.numbers = arrayToSort;
        start = System.nanoTime();
        int number = arrayToSort.length;
        quicksort(0, number - 1);
        stop = System.nanoTime();
        return arrayToSort;
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high-low)/2];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    @Override
    public String printSorterType() {
        return "Quick Sort";
    }



    @Override
    public double getSortingTime() {

        return stop - start;
    }
}

