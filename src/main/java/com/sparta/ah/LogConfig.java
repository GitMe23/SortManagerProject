package com.sparta.ah;

import com.sparta.ah.logging.CustomFilter;
import com.sparta.ah.logging.CustomFormatter;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;

import static com.sparta.ah.App.logger;

public class LogConfig {
    public static void setLogConfig() {
        try {
            Handler fileHandler = new FileHandler(".idea/.gitignore", true);
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
