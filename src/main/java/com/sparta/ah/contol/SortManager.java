package com.sparta.ah.contol;
import com.sparta.ah.IO.DisplayManager;
import com.sparta.ah.IO.InputManager;
import com.sparta.ah.contol.SortFactory;
import com.sparta.ah.logging.LogConfig;
import com.sparta.ah.sorters.Sorter;
import com.sparta.ah.utilities.RandomArrayGenerator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SortManager {

    static int mainMenuInput;
    public static Logger logger = Logger.getLogger("sort logger");
    public static void run() {

        LogConfig.setLogConfig();

        mainMenuInput = InputManager.getMainMenuChoice();
        while (mainMenuInput == 1) {
            logger.log(Level.INFO, "Menu input at 1 to run program");
            DisplayManager.displayProgram();


            int choice = InputManager.getUserChoice();
            int arraySize = InputManager.getSizeOfArray();


            Sorter sorter = SortFactory.getSorter(choice);
            logger.log(Level.INFO, "User chose " + sorter.printSorterType() + " and an array length of " + arraySize);
            int[] arrayToSort = RandomArrayGenerator.getRandomArray(arraySize);

            DisplayManager.printResults(sorter, arrayToSort);
            System.out.println("");
            System.out.println("--------------------- END ---------------------");
            System.out.println("");


        }

        if(mainMenuInput == 0) {
            logger.log(Level.INFO, "Menu input at 0 to exit");
        }

    }



}
