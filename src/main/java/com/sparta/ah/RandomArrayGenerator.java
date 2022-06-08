package com.sparta.ah;

import java.util.Random;

public class RandomArrayGenerator {

    public static int[] getRandomArray() {
        Random randomGen = new Random();
        int[] randomArray = new int[5];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomGen.nextInt(50); // storing random integers in an array


        }
        return randomArray;
    }
}
