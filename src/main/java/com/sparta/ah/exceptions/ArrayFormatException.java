package com.sparta.ah.exceptions;

import com.sparta.ah.contol.SortManager;

import java.util.logging.Level;

import static com.sparta.ah.contol.SortManager.logger;

public class ArrayFormatException extends RuntimeException{
    public ArrayFormatException() {
        System.out.println("");
        String ArrayFormatMessage = "Error: Enter a number between 1 and 100 only. ";
        System.out.print(ArrayFormatMessage);
        logger.log(Level.WARNING, "Printed \"" + ArrayFormatMessage + "\" " );
        SortManager.run();
    }
}
