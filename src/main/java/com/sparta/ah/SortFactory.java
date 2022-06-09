package com.sparta.ah;

import com.sparta.ah.exceptions.SorterLoaderException;
import com.sparta.ah.sorters.Sorter;
import com.sparta.ah.sorters.binarytree.BinaryTree;
import com.sparta.ah.sorters.bubblesort.BubbleSort;
import com.sparta.ah.sorters.insertionsort.InsertionSorter;

public class SortFactory {


    public static Sorter getSorter(int choice) throws SorterLoaderException {

        switch (choice) {

            case 1:
                return new BinaryTree();
            case 2:
                return new BubbleSort();
            case 3:
                return new InsertionSorter();

            default:
                throw new SorterLoaderException("Not recognised - please run again and choose from the sorters above");

        }
    }
}






