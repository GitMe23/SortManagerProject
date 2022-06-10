package com.sparta.ah.exceptions;

import com.sparta.ah.contol.SortManager;

import java.util.logging.Level;

import static com.sparta.ah.contol.SortManager.logger;

public class SorterLoaderException extends RuntimeException {
    public SorterLoaderException(){
        System.out.println("");
        String sortLoadErrorMessage = "Error: Sorters are chosen using keys 1 to 5. ";
        System.out.print(sortLoadErrorMessage);
        logger.log(Level.WARNING, "Program displayed \"" + sortLoadErrorMessage + "\" ");
        SortManager.run();


    }
}
