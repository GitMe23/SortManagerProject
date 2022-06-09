package com.sparta.ah;

import com.sparta.ah.sorters.insertionsort.InsertionSorter;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

public class InsertionSorterTest {

    @Test
    @DisplayName("check InsertionSorter returns sorted array")
    public void checkInsertionSorterReturnsSortedArray() {
        int[] toSort = new int[] {100, 40, 20, 30};
        InsertionSorter.sort(toSort);
        String expected = Arrays.toString(new int[] {20, 30, 40, 100};
        String actual = Arrays.toString(toSort);
        Assertions.assertEquals(expected, actual);
    }
}
