package com.sparta.ah;
import com.sparta.ah.sorters.Sorter;
import com.sparta.ah.utilities.RandomArrayGenerator;

import java.util.logging.Logger;

public class SortManager {



    public static Logger logger = Logger.getLogger("sort logger");
    public static void run() {

        int mainMenuInput = InputManager.getMainMenuChoice();

        while (mainMenuInput == 1) {
            DisplayManager.displayProgram();
            // get sorter choice
            int choice = InputManager.getUserChoice();
            int arraySize = InputManager.getSizeOfArray();


            // Using choice, create sorter object of Sorter type
            Sorter sorter = SortFactory.getSorter(choice);
            // generate array to sort
            int[] arrayToSort = RandomArrayGenerator.getRandomArray(arraySize);

            DisplayManager.printResults(sorter, arrayToSort);
            mainMenuInput = InputManager.getRunAgainChoice();
            System.out.println("");
            System.out.println("--------------------- END ---------------------");
            System.out.println("");
            //logger.log(Level.INFO, "User entered: " + choice + " for " + sorter.printSorterType());


        }


    }


}
