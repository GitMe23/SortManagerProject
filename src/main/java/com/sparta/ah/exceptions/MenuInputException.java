package com.sparta.ah.exceptions;

import com.sparta.ah.contol.SortManager;

public class MenuInputException extends RuntimeException{

    public MenuInputException() {
        System.out.println("");
        System.out.print("You have entered an unrecognised value. ");
        SortManager.run();
    }

}
