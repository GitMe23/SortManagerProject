package com.sparta.ah.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;

import static com.sparta.ah.contol.SortManager.logger;

public class LogConfig {
    public static void setLogConfig() {
        try {
            Handler fileHandler = new FileHandler("target/sort-logs.log", true);
            logger.addHandler(fileHandler);
            //logger.setFilter(new CustomFilter());
            fileHandler.setFormatter(new CustomFormatter());
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }

        logger.setLevel(Level.INFO);
    }
}
