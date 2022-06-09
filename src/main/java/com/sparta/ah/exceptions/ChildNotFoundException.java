package com.sparta.ah.exceptions;

public class ChildNotFoundException extends RuntimeException {
    public ChildNotFoundException() {
        super();
        System.out.println("Element does not have a child");
    }
}
