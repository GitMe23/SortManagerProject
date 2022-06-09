package com.sparta.ah;


import com.sparta.ah.sorters.binarytree.BinaryTree;
import com.sparta.ah.sorters.bubblesort.BubbleSort;
import com.sparta.ah.sorters.insertionsort.InsertionSorter;
import com.sparta.ah.sorters.quicksort.QuickSort;
import com.sparta.ah.utilities.RandomArrayGenerator;
import org.junit.Test;
import java.util.Arrays;


public class SpeedComparisonTest {

    private int[] unsortedArray = RandomArrayGenerator.getRandomArray(20);


    @Test
    public void  testBinaryTreeSorter() {
        System.out.println("");
        System.out.println("---- BinaryTree Sort ----");
        System.out.println("Array to sort:");
        System.out.println(Arrays.toString(unsortedArray));
        BinaryTree sorter = new BinaryTree();
        System.out.println("Array after " + sorter.printSorterType() + " Sort: ");
        int[] sorted = sorter.sortArray(unsortedArray);
        System.out.println(Arrays.toString(sorted));
        System.out.println("Sorting time: " + sorter.getSortingTime() + " nano seconds (" + sorter.getSortingTime()/1000000 + " milliseconds)" );
    }

    @Test
    public void  testBubbleSorter() {
        System.out.println("");
        System.out.println("---- Bubble Sort ----");
        System.out.println("Array to sort:");
        System.out.println(Arrays.toString(unsortedArray));
        BubbleSort sorter = new BubbleSort();
        System.out.println("Array after " + sorter.printSorterType() + ": ");
        int[] sorted = sorter.sortArray(unsortedArray);
        System.out.println(Arrays.toString(sorted));
        System.out.println("Sorting time: " + sorter.getSortingTime() + " nano seconds (" + sorter.getSortingTime()/1000000 + " milliseconds)" );
    }


    @Test
    public void  testInsertionSorter() {
        System.out.println("");
        System.out.println("---- Insertion Sort ----");
        System.out.println("Array to sort:");
        System.out.println(Arrays.toString(unsortedArray));
        InsertionSorter sorter = new InsertionSorter();
        System.out.println("Array after " + sorter.printSorterType() + ": ");
        int[] sorted = sorter.sortArray(unsortedArray);
        System.out.println(Arrays.toString(sorted));
        System.out.println("Sorting time: " + sorter.getSortingTime() + " nano seconds (" + sorter.getSortingTime()/1000000 + " milliseconds)" );
    }


    @Test
    public void  testQuickSorter() {
        System.out.println("");
        System.out.println("---- Quick Sort ----");
        System.out.println("Array to sort:");
        System.out.println(Arrays.toString(unsortedArray));
        QuickSort sorter = new QuickSort();
        System.out.println("Array after " + sorter.printSorterType() + ": ");
        int[] sorted = sorter.sortArray(unsortedArray);
        System.out.println(Arrays.toString(sorted));
        System.out.println("Sorting time: " + sorter.getSortingTime() + " nano seconds (" + sorter.getSortingTime()/1000000 + " milliseconds)" );
    }

}
