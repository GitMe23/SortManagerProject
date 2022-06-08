package com.sparta.ah.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    private static final Logger logger = Logger.getLogger("my logger");



    public static void main(String[] args) {
        try {
            Handler fileHandler = new FileHandler("src/main/java/com/sparta/ah/logging/myLog.log", true);
            logger.addHandler(fileHandler);
            logger.setFilter(new CustomFilter());
            fileHandler.setFormatter(new CustomFormatter());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        logger.setLevel(Level.FINE);
        System.out.println(logger.getLevel());

        logger.log(Level.INFO, "This is an information message");
        logger.log(Level.FINE, "This is fine message, hello");
        logger.log(Level.WARNING, "This is a warning message");
    }
}