package com.sparta.ah;


import com.sparta.ah.sorters.bubblesort.BubbleSort;
import com.sparta.ah.sorters.insertionsort.InsertionSorter;
import com.sparta.ah.sorters.mergesort.MergeSort;
import com.sparta.ah.sorters.quicksort.QuickSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;


public class SorterTest {

   // BUBBLE SORT

    @Test
    @DisplayName("Checking that bubbleSortIntArray returns empty array given an empty array")
    void checkBubbleSortIntArrayReturnsEmptyArray() {
        BubbleSort sorter = new BubbleSort();
        Assertions.assertArrayEquals(new int[]{}, sorter.sortArray(new int[]{}) );
    }

    @Test
    @DisplayName("Checking that bubbleSortIntArray returns array given a single int array")
    void checkBubbleSortIntArraySortsArraysContainingOneInt() {
        BubbleSort sorter = new BubbleSort();
        Assertions.assertArrayEquals(new int[]{1}, sorter.sortArray(new int[]{1}) );
    }

  @Test
  @DisplayName("checkBubbleSortReturnsSortedArray")
  void checkBubbleSortReturnsSortedArray() {
      int[] toSort = new int[] {100, 40, 20, 30};
      String expected = Arrays.toString(new int[] {20, 30, 40, 100});
      BubbleSort sorter = new BubbleSort();
      String actual = Arrays.toString(sorter.sortArray(toSort));
  }

    // INSERTION SORT


    @Test
    @DisplayName("Checking that InsertionSorter returns empty array given an empty array")
    void checkInsertionSortReturnsEmptyArray() {
        InsertionSorter sorter = new InsertionSorter();
        Assertions.assertArrayEquals(new int[]{}, sorter.sortArray(new int[]{}) );
    }

    @Test
    @DisplayName("check InsertionSorter returns sorted array")
    public void checkInsertionSorterReturnsSortedArray() {
        int[] toSort = new int[] {100, 40, 20, 30};
        InsertionSorter.sort(toSort);
        String expected = Arrays.toString(new int[] {20, 30, 40, 100});
        String actual = Arrays.toString(toSort);
        Assertions.assertEquals(expected, actual);
    }



    @Test
    @DisplayName("check InsertionSorter returns sorted array with 0")
    public void checkInsertionSorterReturnsSortedArrayWithZero() {
        int[] toSort = new int[] {100, 40, 20, 30, 0};
        InsertionSorter.sort(toSort);
        String expected = Arrays.toString(new int[] {0, 20, 30, 40, 100});
        String actual = Arrays.toString(toSort);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    @DisplayName("check InsertionSorter returns sorted array with negative values")
    public void checkInsertionSorterReturnsSortedArrayWithNegatives() {
        int[] toSort = new int[] {100, 40, 20, 30, 0, -1, -500};
        InsertionSorter.sort(toSort);
        String expected = Arrays.toString(new int[] {-500, -1, 0, 20, 30, 40, 100});
        String actual = Arrays.toString(toSort);
        Assertions.assertEquals(expected, actual);
    }

    // QUICK SORT

    @Test
    @DisplayName("Checking that QuickSorter returns empty array given an empty array")
    void checkQuickSortReturnsEmptyArray() {
       QuickSort sorter = new QuickSort();
        Assertions.assertArrayEquals(new int[]{}, sorter.sortArray(new int[]{}) );
    }

    @Test
    @DisplayName("checkQuickSortReturnsSortedArray")
    public void checkQuickSortReturnsSortedArray() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        QuickSort sorter = new QuickSort();
        sorter.sortArray(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("checkQuickSortReturnsSortedArray")
    public void checkQuickSortReturnsSortedArrayWithZero() {
        int[] actual = { 5, 1, 6, 2, 3, 4, 0 };
        int[] expected = { 0, 1, 2, 3, 4, 5, 6 };
        QuickSort sorter = new QuickSort();
        sorter.sortArray(actual);
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    @DisplayName("checkQuickSortReturnsSortedArrayWithNegativeValues")
    public void checkQuickSortReturnsSortedArrayWithNegativeValues() {
        int[] actual = { 5, 1, 6, 2, 3, 4, 0, -1, -2, -3 };
        int[] expected = { -3, -2, -1, 0, 1, 2, 3, 4, 5, 6 };
        QuickSort sorter = new QuickSort();
        sorter.sortArray(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    // MERGE SORT

    @Test
    @DisplayName("checkMergeSortReturnsSortedArray")
    public void checkMergeSortReturnsSortedArray() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSort sorter = new MergeSort();
        sorter.sortArray(actual);
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    @DisplayName("checkMergeSortReturnsSortedArray")
    public void checkMergeSortReturnsSortedArrayWithZero() {
        int[] actual = { 5, 1, 6, 2, 3, 4, 0 };
        int[] expected = { 0, 1, 2, 3, 4, 5, 6 };
        MergeSort sorter = new MergeSort();
        sorter.sortArray(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("checkMergeSortReturnsSortedArrayWithNegativeValues")
    public void checkMergeSortReturnsSortedArrayWithNegatives() {
        int[] actual = { 5, 1, 6, 2, 3, 4, 0, -1, -500 };
        int[] expected = { -500, -1, 0, 1, 2, 3, 4, 5, 6 };
        MergeSort sorter = new MergeSort();
        sorter.sortArray(actual);
        Assertions.assertArrayEquals(expected, actual);
    }
}
