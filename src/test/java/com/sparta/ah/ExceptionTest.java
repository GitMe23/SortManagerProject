package com.sparta.ah;


import com.sparta.ah.contol.SortFactory;
import com.sparta.ah.exceptions.ChildNotFoundException;
import com.sparta.ah.sorters.binarytree.BinaryTree;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;



public class ExceptionTest {


    @Test
    @DisplayName("checkChildNotFoundException thrown when left child is empty")
    public void checkChildNotFoundExceptionThrown() {
        BinaryTree sorter = new BinaryTree(100);
        Assertions.assertThrows(ChildNotFoundException.class, () -> sorter.getLeftChild(100));
    }

    @Test
    @DisplayName("check ChildNotFound is not thrown when node has left child")
    public void checkChildNotFoundIsNotThrownWhenNodeHasLeftChild() {
        BinaryTree sorter = new BinaryTree(100);
        sorter.addElement(50);
        Assertions.assertDoesNotThrow( () -> sorter.getLeftChild(100));
    }

    @Test
    @DisplayName("check SorterLoaderException not thrown when selecting sorter in range ")
    public void checkSorterLoaderExceptionNotThrownWhenSorterInRange() {
        Assertions.assertDoesNotThrow( () -> SortFactory.getSorter(2));
    }



}
