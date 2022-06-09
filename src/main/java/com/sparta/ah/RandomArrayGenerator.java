package com.sparta.ah;

import java.util.Random;

public class RandomArrayGenerator {

    public static int[] getRandomArray(int size) {
        Random randomGen = new Random();
        int[] randomArray = new int[size];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomGen.nextInt(size); // storing random integers in an array


        }
        return randomArray;
    }
}
