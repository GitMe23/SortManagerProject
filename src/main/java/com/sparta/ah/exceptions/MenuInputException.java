package com.sparta.ah.exceptions;

import com.sparta.ah.contol.SortManager;

import java.util.logging.Level;

import static com.sparta.ah.contol.SortManager.logger;

public class MenuInputException extends RuntimeException{

    public MenuInputException() {
        System.out.println("");
        logger.log(Level.WARNING, "Program threw MenuInputException ");
        SortManager.run();
    }

}
