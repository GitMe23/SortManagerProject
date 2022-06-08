package com.sparta.ah;
import java.util.Random;

public class SortManager {




    public void run() {
        // print intro
        DisplayManager.printGreeting();
        // get sorter choice
        int choice = InputManager.getUserChoice();

        // create sorter object from choice
        Sorter sorter = SortFactory.getSorter(choice);

        // generate array to sort
        int[] arrayToSort = RandomArrayGenerator.getRandomArray();

        DisplayManager.printResults(sorter, arrayToSort);




    }




}
