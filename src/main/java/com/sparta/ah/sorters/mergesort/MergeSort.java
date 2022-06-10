package com.sparta.ah.sorters.mergesort;

import com.sparta.ah.sorters.Sorter;

public class MergeSort implements Sorter {

    double start;
    double stop;
    public static void mergeSort(int[] arrayToSort, int arrayLength) {
        if (arrayLength < 2) {
            return;
        }
        int mid = arrayLength / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[arrayLength - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = arrayToSort[i];
        }
        for (int i = mid; i < arrayLength; i++) {
            rightArray[i - mid] = arrayToSort[i];
        }
        mergeSort(leftArray, mid);
        mergeSort(rightArray, arrayLength - mid);

        merge(arrayToSort, leftArray, rightArray, mid, arrayLength - mid);

    }
    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    @Override
    public String printSorterType() {
        return "Merge Sort";
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        start = System.nanoTime();
        MergeSort.mergeSort(arrayToSort, arrayToSort.length);
        stop = System.nanoTime();
        return arrayToSort;
    }

    @Override
    public double getSortingTime() {
        return stop - start;
    }
}
