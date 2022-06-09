package com.sparta.ah;

import com.sparta.ah.sorters.binarytree.BinaryTree;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {



//
//    @Test
//    @DisplayName("check that getRootElement returns a given root node")
//    void checkGetRootElement() {
//        BinaryTree tree = new BinaryTree(3);
//        Assertions.assertEquals(3, tree.getRootElement());
//    }
//
//    @Test
//    @DisplayName("check getRootElement returns 0 given 0")
//    void checkGetRootElementReturnsZeroGivenZero() {
//        BinaryTree tree = new BinaryTree(0);
//        Assertions.assertEquals(0, tree.getRootElement());
//    }
//
//    @Test
//    @DisplayName("check getNumberOfElements returns 1 given root only")
//    void checkGetNumberOfElementsReturns1givenRootOnly() {
//        BinaryTree tree = new BinaryTree(100);
//        Assertions.assertEquals(1,
//                tree.getNumberOfElements());
//    }
//
//    @Test
//    @DisplayName("check addElement adds one element to existing tree")
//    void checkAddElementAddsOneElementToTree() {
//        BinaryTree tree = new BinaryTree(10);
//        tree.addElement(3);
//        Assertions.assertEquals(2,
//                tree.getNumberOfElements());
//    }
//
//    @Test
//    @DisplayName("check addElement adds element smaller than root")
//    void checkAddElementAddsElementSmallerThanRoot() {
//        BinaryTree tree = new BinaryTree(101);
//        tree.addElement(30);
//        Assertions.assertEquals(2,
//                tree.getNumberOfElements());
//    }
//    @Test
//    @DisplayName("check addElement adds element larger than root")
//    void checkAddElementAddsElementLargerThanRoot() {
//        BinaryTree tree = new BinaryTree(101);
//        tree.addElement(250);
//        Assertions.assertEquals(2,
//                tree.getNumberOfElements());
//    }
//    @Test
//    @DisplayName("check addElement adds zero to tree")
//    void checkAddElementAddsZeroToRoot() {
//        BinaryTree tree = new BinaryTree(101);
//        tree.addElement(0);
//        Assertions.assertEquals(2,
//                tree.getNumberOfElements());
//    }
//
//    @Test
//    @DisplayName("check addElement adds negative value to tree")
//    void checkAddElementAddsNegativeValueToRoot() {
//        BinaryTree tree = new BinaryTree(101);
//        tree.addElement(-4);
//        Assertions.assertEquals(2,
//                tree.getNumberOfElements());
//    }
//
//    @Test
//    @DisplayName("check getNumberOfElements returns 2 given root and one element")
//    void checkGetNumberOfElementsReturnsTwoGivenRootAndOneElementOnly() {
//        BinaryTree tree = new BinaryTree(100);
//        tree.addElement(3);
//        Assertions.assertEquals(2,
//                tree.getNumberOfElements());
//    }
//
//    @Test
//    @DisplayName("check addElements() adds correct number of elements to tree")
//    void checkAddElementsAddsCorrectNumberOfElementsToTree() {
//        BinaryTree tree = new BinaryTree(100);
//        tree.addElements(new int[]{200, 300, 50});
//        Assertions.assertEquals(4,
//                tree.getNumberOfElements());
//    }
//
//    @Test
//    @DisplayName("check addElements() adds array containing zero to tree")
//    void checkAddElementsAddsElementsIncludingZeroToTree() {
//        BinaryTree tree = new BinaryTree(100);
//        tree.addElements(new int[]{0, 300, 50});
//        Assertions.assertEquals(4,
//                tree.getNumberOfElements());
//    }
//
//    @Test
//    @DisplayName("check addElements() adds array containing negative values to tree")
//    void checkAddElementsAddsArrayIncludingNegativeValuesToTree() {
//        BinaryTree tree = new BinaryTree(100);
//        tree.addElements(new int[]{-10, 300, -50});
//        Assertions.assertEquals(4,
//                tree.getNumberOfElements());
//    }
//
//    @Test
//    @DisplayName("check findElement returns true given element in array")
//    void checkFindElementReturnsTrue() {
//        BinaryTree tree = new BinaryTree(100);
//        tree.addElements(new int[]{2,3,4});
//        Assertions.assertEquals(true,
//                tree.findElement(2));
//    }
//    @Test
//    @DisplayName("check get Left child returns left child of root")
//    void checkGetLeftChildReturnsCorrectValue() {
//        BinaryTree tree = new BinaryTree(100);
//        tree.addElements(new int[]{2, 500, 1});
//        //Assertions.assertEquals(2, tree.getLeftChild(100));
//        Assertions.assertEquals(2,
//                tree.getLeftChild(100));
//    }
//
//

}
