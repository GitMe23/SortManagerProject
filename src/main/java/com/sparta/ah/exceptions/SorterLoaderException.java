package com.sparta.ah.exceptions;

import com.sparta.ah.contol.SortManager;

public class SorterLoaderException extends RuntimeException {
    public SorterLoaderException(){
        System.out.print("Sorters are chosen using keys 1 to 5. ");
        SortManager.run();


    }
}
