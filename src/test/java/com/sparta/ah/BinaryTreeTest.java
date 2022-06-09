package com.sparta.ah;

import com.sparta.ah.sorters.binarytree.BinaryTree;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class BinaryTreeTest {




    @Test
    @DisplayName("check that getRootElement returns a given root node")
    public void checkGetRootElement() {
        BinaryTree tree = new BinaryTree(3);
        Assertions.assertEquals(3, tree.getRootElement());
    }

    @Test
    @DisplayName("check getRootElement returns 0 given 0")
    public void checkGetRootElementReturnsZeroGivenZero() {
        BinaryTree tree = new BinaryTree(0);
        Assertions.assertEquals(0, tree.getRootElement());
    }

    @Test
    @DisplayName("check getNumberOfElements returns 1 given root only")
    public void checkGetNumberOfElementsReturns1givenRootOnly() {
        BinaryTree tree = new BinaryTree(100);
        Assertions.assertEquals(1,
                tree.getNumberOfElements());
    }

    @Test
    @DisplayName("check addElement adds one element to existing tree")
    public void checkAddElementAddsOneElementToTree() {
        BinaryTree tree = new BinaryTree(10);
        tree.addElement(3);
        Assertions.assertEquals(2,
                tree.getNumberOfElements());
    }

    @Test
    @DisplayName("check addElement adds element smaller than root")
    public void checkAddElementAddsElementSmallerThanRoot() {
        BinaryTree tree = new BinaryTree(101);
        tree.addElement(30);
        Assertions.assertEquals(2,
                tree.getNumberOfElements());
    }
    @Test
    @DisplayName("check addElement adds element larger than root")
    public void checkAddElementAddsElementLargerThanRoot() {
        BinaryTree tree = new BinaryTree(101);
        tree.addElement(250);
        Assertions.assertEquals(2,
                tree.getNumberOfElements());
    }
    @Test
    @DisplayName("check addElement adds zero to tree")
    public void checkAddElementAddsZeroToRoot() {
        BinaryTree tree = new BinaryTree(101);
        tree.addElement(0);
        Assertions.assertEquals(2,
                tree.getNumberOfElements());
    }

    @Test
    @DisplayName("check addElement adds negative value to tree")
    public void checkAddElementAddsNegativeValueToRoot() {
        BinaryTree tree = new BinaryTree(101);
        tree.addElement(-4);
        Assertions.assertEquals(2,
                tree.getNumberOfElements());
    }

    @Test
    @DisplayName("check getNumberOfElements returns 2 given root and one element")
    public void checkGetNumberOfElementsReturnsTwoGivenRootAndOneElementOnly() {
        BinaryTree tree = new BinaryTree(100);
        tree.addElement(3);
        Assertions.assertEquals(2,
                tree.getNumberOfElements());
    }

    @Test
    @DisplayName("check addElements() adds correct number of elements to tree")
    public void checkAddElementsAddsCorrectNumberOfElementsToTree() {
        BinaryTree tree = new BinaryTree(new int[]{200, 300, 50});
        Assertions.assertEquals(3,
                tree.getNumberOfElements());
    }

    @Test
    @DisplayName("check addElements() adds array containing zero to tree")
    public void checkAddElementsAddsElementsIncludingZeroToTree() {
        BinaryTree tree = new BinaryTree(new int[]{0, 300, 50});
        Assertions.assertEquals(3,
                tree.getNumberOfElements());
    }

    @Test
    @DisplayName("check addElements() adds array containing negative values to tree")
    public void checkAddElementsAddsArrayIncludingNegativeValuesToTree() {
        BinaryTree tree = new BinaryTree(new int[]{-10, 300, -50});
        Assertions.assertEquals(3,
                tree.getNumberOfElements());
    }

    @Test
    @DisplayName("check findElement returns true given element in array")
    public void checkFindElementReturnsTrue() {
        BinaryTree tree = new BinaryTree(new int[]{2,3,4});
        Assertions.assertEquals(true,
                tree.findElement(2));
    }




}
