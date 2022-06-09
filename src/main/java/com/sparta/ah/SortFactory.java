package com.sparta.ah;

import com.sparta.ah.exceptions.SorterLoaderException;
import com.sparta.ah.sorters.Sorter;
import com.sparta.ah.sorters.binarytree.BinaryTree;
import com.sparta.ah.sorters.bubblesort.BubbleSort;
import com.sparta.ah.sorters.insertionsort.InsertionSorter;
import com.sparta.ah.sorters.quicksort.QuickSort;

public class SortFactory {


    public static Sorter getSorter(int choice) throws SorterLoaderException {

        switch (choice) {

            case 1:
                return new BinaryTree();
            case 2:
                return new BubbleSort();
            case 3:
                return new InsertionSorter();
            case 4:
                return new QuickSort();

            default:
                throw new SorterLoaderException("Not recognised - please run again and choose from the sorters above");

        }
    }
}






