package com.sparta.ah;
import com.sparta.ah.sorters.Sorter;
import com.sparta.ah.utilities.RandomArrayGenerator;

public class SortManager {




    public static void run() {
        // print intro


        int mainMenuInput = InputManager.getMainMenuChoice();

        while (mainMenuInput == 1) {
            DisplayManager.displayProgram();
            // get sorter choice
            int choice = InputManager.getUserChoice();
            int arraySize = InputManager.getSizeOfArray();


            // create sorter object from choice
            Sorter sorter = SortFactory.getSorter(choice);
            // generate array to sort
            int[] arrayToSort = RandomArrayGenerator.getRandomArray(arraySize);

            DisplayManager.printResults(sorter, arrayToSort);
            mainMenuInput = InputManager.getMainMenuChoice();
            System.out.println("");
            System.out.println("--------------------- END ---------------------");
            System.out.println("");
            //logger.log(Level.INFO, "User entered: " + choice + " for " + sorter.printSorterType());


        }


    }
}
