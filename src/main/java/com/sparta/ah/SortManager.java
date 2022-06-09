package com.sparta.ah;
import java.util.Random;
import java.util.logging.Level;
import static com.sparta.ah.App.logger;

public class SortManager {




    public void run() {
        // print intro
        DisplayManager.printGreeting();
        // get sorter choice
        int choice = InputManager.getUserChoice();
        int arraySize = InputManager.getSizeOfArray();


        // create sorter object from choice
        Sorter sorter = SortFactory.getSorter(choice);
        // generate array to sort
        int[] arrayToSort = RandomArrayGenerator.getRandomArray(arraySize);

        DisplayManager.printResults(sorter, arrayToSort);
        logger.log(Level.INFO, "User entered: " + choice + " for " + sorter.printSorterType() );



    }




}
