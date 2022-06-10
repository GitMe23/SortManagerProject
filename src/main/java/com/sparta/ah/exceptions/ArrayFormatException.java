package com.sparta.ah.exceptions;

import com.sparta.ah.contol.SortManager;

public class ArrayFormatException extends RuntimeException{
    public ArrayFormatException() {
        System.out.println("");
        System.out.print("Enter a number between 1 and 100 only. " +
                "");
        SortManager.run();
    }
}
