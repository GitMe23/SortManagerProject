package com.sparta.ah;

import com.sparta.ah.sorters.mergesort.MergeSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {
    @Test
    @DisplayName("checkMergeSortReturnsSortedArray")
    public void checkMergeSortReturnsSortedArray() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSort.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }

}
