package com.sparta.ah.utilities;

import java.util.Random;
import java.util.logging.Level;

import static com.sparta.ah.contol.SortManager.logger;

public class RandomArrayGenerator {

    static int range = 999;
    public static int[] getRandomArray(int size) {
        Random randomGen = new Random();
        int[] randomArray = new int[size];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomGen.nextInt(range); // storing random integers in an array
        }
        logger.log(Level.INFO, "Random array generated: Length: " + size + " Range: " + range + ". ");
        return randomArray;
    }
}
