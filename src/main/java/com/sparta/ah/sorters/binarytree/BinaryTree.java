package com.sparta.ah.sorters.binarytree;

import com.sparta.ah.Sorter;

public class BinaryTree implements Sorter, BinaryTreeInterface {


    // public method - Interface
    // private method - Implementation
    private Node rootNode;

    public BinaryTree(final int element) {
        rootNode = new Node(element);
    }

    public void setRootNode(Node rootNode) {
        this.rootNode = rootNode;
    }

    public Node getRootNode() {
        return this.rootNode;
    }

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return countNodes(this.getRootNode());
    }

    @Override
    public void addElements(final int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            this.addNodeToTree(rootNode, i);
        }
    }

    @Override
    public void addElement(final int element) {

        addNodeToTree(rootNode, element);
    }

    @Override
    public boolean findElement(final int element) {
        Node node = findNode(element);
        return node != null;
    }

    private void addNodeToTree(Node node, int element) {
        if (element < node.getValue()) {
            if (node.isLeftChildEmpty()) {
                Node leftChild = new Node(element);
                node.setLeftChild(leftChild);
            } else {
                // recursively call
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (element > node.getValue()) {
            if (node.isRightChildEmpty()) {
                Node rightChild = new Node(element);
                node.setRightChild(rightChild);
            } else {
                addNodeToTree(node.getRightChild(), element);
            }

        }
    }

    private Node findNode(final int element) {
        Node node = rootNode;
        while (node != null) {
            if (element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            } else {
                node.getRightChild();
            }

        }
        return null;
    }

    private int countNodes(Node root) {
        //base case
        if (root == null) {
            return 0;
        }
        // recursively call countNodes with each left and right node
        // plus one for root and each node
        int leftNumber = countNodes(root.getLeftChild());
        int rightNumber = countNodes(root.getRightChild());
        return leftNumber + rightNumber + 1;

    }

    @Override
    public String printSorterType() {
        return "Binary Tree";
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        // Bubble sort algorithm as a PLACEHOLDER!
        int arrayLength = arrayToSort.length;
        int temp = 0;
        for (int i = 0; i < arrayLength; i++) {
            for (int number = 1; number < (arrayLength - i); number++) {
                if (arrayToSort[number - 1] > arrayToSort[number]) {
                    temp = arrayToSort[number - 1];
                    arrayToSort[number - 1] = arrayToSort[number];
                    arrayToSort[number] = temp;
                }
            }
        }
        return arrayToSort;
    }

    /// all above working to here.

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        Node node = findNode(element);
        Node left = node.getLeftChild();
        return left.getValue();
        /*
        if (node != null) {

            return node.getLeftChild().getValue();
        } else {
            throw new ChildNotFoundException();
        }

         */
    }

}

