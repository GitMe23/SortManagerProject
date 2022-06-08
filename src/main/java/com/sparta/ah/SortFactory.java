package com.sparta.ah;

import com.sparta.ah.sorters.binarytree.BinaryTree;
import com.sparta.ah.sorters.bubblesort.BubbleSort;

public class SortFactory {


    public static Sorter getSorter(int choice) throws SorterLoaderException {

        switch (choice) {

            case 1:
                return new BinaryTree(2);
            case 2:
                return new BubbleSort();

            default:
                throw new SorterLoaderException("Not recognised - please run again and choose from the sorters above");

        }
    }
}






