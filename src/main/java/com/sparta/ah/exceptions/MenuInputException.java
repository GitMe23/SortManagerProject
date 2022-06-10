package com.sparta.ah.exceptions;

import com.sparta.ah.contol.SortManager;

import java.util.logging.Level;

import static com.sparta.ah.contol.SortManager.logger;

public class MenuInputException extends RuntimeException{

    public MenuInputException() {
        System.out.println("");
        String menuErrorMessage = "You have entered an unrecognised value. ";
        System.out.print(menuErrorMessage);
        logger.log(Level.INFO, "Program displayed \"" + menuErrorMessage + "\" ");
        SortManager.run();
    }

}
