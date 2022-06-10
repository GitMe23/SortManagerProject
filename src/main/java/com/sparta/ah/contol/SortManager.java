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
    public static Logger logger = Logger.getLogger("sort logger");

    public static void run() {

        LogConfig.setLogConfig();
        int mainMenuInput = InputManager.getMainMenuChoice();
        while (mainMenuInput == 1) {

            DisplayManager.displayProgram();

            // get sorter choice and array size from user
            int choice = InputManager.getUserChoice();
            int arraySize = InputManager.getSizeOfArray();


            // create sorter object from factory
            Sorter sorter = SortFactory.getSorter(choice);
            // generate array to sort
            int[] arrayToSort = RandomArrayGenerator.getRandomArray(arraySize);

            // pass everything to display
            DisplayManager.printResults(sorter, arrayToSort);
            mainMenuInput = InputManager.getRunAgainChoice();
            System.out.println("");
            System.out.println("--------------------- END ---------------------");
            System.out.println("");


        }
        //logger.log(Level.INFO, "log" );

    }


}
