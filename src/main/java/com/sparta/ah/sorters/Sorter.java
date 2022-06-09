package com.sparta.ah.sorters;

public interface Sorter {
    String printSorterType();
    int[] sortArray(int[] arrayToSort);
    double getSortingTime();
}
