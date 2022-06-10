package com.sparta.ah.exceptions;

import java.util.logging.Level;

import static com.sparta.ah.contol.SortManager.logger;

public class ChildNotFoundException extends RuntimeException {
    public ChildNotFoundException() {
        super();
        logger.log(Level.WARNING, "Element does not have a child");
    }
}
