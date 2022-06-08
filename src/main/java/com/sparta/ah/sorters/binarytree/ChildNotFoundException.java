package com.sparta.ah.sorters.binarytree;

public class ChildNotFoundException extends RuntimeException {
    public ChildNotFoundException() {
        super();
        System.out.println("Element does not have a left child");
    }
}
