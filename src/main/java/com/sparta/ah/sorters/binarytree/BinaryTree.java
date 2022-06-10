package com.sparta.ah.sorters.binarytree;

import com.sparta.ah.exceptions.ChildNotFoundException;
import com.sparta.ah.sorters.Sorter;

public class BinaryTree implements Sorter, BinaryTreeInterface {

    double start;
    double stop;
    private Node rootNode;
    private int[] sortedTree;
    private int count;
    private int numberOfNodes = 1;



    public static class Node {
        private final int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getLeftChild() {
            return this.leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        public boolean isLeftChildEmpty() {
            return leftChild == null;
        }

        public boolean isRightChildEmpty() {
            return rightChild == null;
        }
    }
    public BinaryTree() {

    }
    public BinaryTree(final int element) {
        rootNode = new Node(element);
    }

    public BinaryTree(final int[] elements) {
        rootNode = new Node(elements[0]);
        for (int i = 0; i < elements.length; i++) {
            addElement(elements[i]);
        }
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
        for (int i = 1; i < elements.length; i++) {
            addElement(elements[i]);
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
        if (element == node.getValue()) return;

        if (element <= node.getValue()) {
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
                numberOfNodes++;
            } else {
                // recursively call
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (node.isRightChildEmpty()) {

                node.setRightChild(new Node(element));
                numberOfNodes++;
            } else {
                addNodeToTree(node.getRightChild(), element);
            }

    }

    public Node findNode(final int element) {
        Node node = rootNode;
        while (node != null) {
            if (element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();

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
    public int getLeftChild(int element) throws ChildNotFoundException {
        Node node = findNode(element);
        if (node.getLeftChild() != null) {
           return node.getLeftChild().getValue();
        }
        throw new ChildNotFoundException();
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        Node node = findNode(element);
        if (node.getRightChild() != null) {
            return node.getRightChild().getValue();
        }
        throw new ChildNotFoundException();
    }
    public int getNumberOfNodes() {
        return numberOfNodes;
    }


    @Override
    public String printSorterType() {
        return "Binary Tree";
    }
    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinaryTree tree = new BinaryTree(arrayToSort);
        start = System.nanoTime();
        int[] sortedArray = tree.getSortedTreeAsc();
        stop = System.nanoTime();
        return sortedArray;
    }

    public void sortTreeAsc(Node node) {
        if (!node.isLeftChildEmpty()) {
            sortTreeAsc(node.getLeftChild());
        }
        sortedTree[count] = node.getValue();
        count++;
        if (!node.isRightChildEmpty()) {
            sortTreeAsc(node.getRightChild());
        }
    }

    public void sortTreeDesc(Node node) {
        if (!node.isRightChildEmpty()) {
            sortTreeDesc(node.getRightChild());
        }
        sortedTree[count] = node.getValue();
        count++;
        if (!node.isLeftChildEmpty()) {
            sortTreeDesc(node.getLeftChild());
        }

    }

    @Override
    public int[] getSortedTreeAsc() {
        sortedTree = new int[numberOfNodes];
        count = 0;
        sortTreeAsc(rootNode);
        return sortedTree;
    }

    @Override
    public int[] getSortedTreeDesc() {
        sortedTree = new int[numberOfNodes];
        count = 0;
        sortTreeDesc(rootNode);
        return sortedTree;
    }

    @Override
    public double getSortingTime() {
        return stop - start;
    }
}

