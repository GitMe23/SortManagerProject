
package com.sparta.ah;

import com.sparta.ah.sorters.binarytree.BinaryTree;
import com.sparta.ah.sorters.binarytree.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class NodeTest {

    @Test
    @DisplayName("Check getValue returns correct value")
    void checkGetValue() {
        Node node = new Node(5);
        Assertions.assertEquals(5, node.getValue());
    }

    @Test
    @DisplayName("Check getLeftChild returns correct value")
    void checkGetLeftChildValue() {
        Node node = new Node(5);
        Node left = new Node(2);
        node.setLeftChild(left);
        Assertions.assertEquals(2, node.getLeftChild().getValue());
    }


}
