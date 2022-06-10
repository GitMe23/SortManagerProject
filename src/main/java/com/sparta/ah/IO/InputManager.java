package com.sparta.ah.IO;
import com.sparta.ah.contol.SortManager;
import com.sparta.ah.exceptions.ArrayFormatException;
import com.sparta.ah.exceptions.MenuInputException;

import java.util.Scanner;
import java.util.logging.Level;

import static com.sparta.ah.contol.SortManager.logger;

public class InputManager {

    static int choice;
    public static int getMainMenuChoice() {
        System.out.println("-------------------- MAIN MENU --------------------");
        System.out.println("");
        System.out.print("Enter 1 to run program or 0 to exit: ");
        Scanner userInput = new Scanner(System.in);

        try {
            choice = Integer.parseInt(userInput.nextLine());
            if (choice == 0 | choice == 1) {
                return choice;
            } else {
                logger.log(Level.INFO, "User typed " + choice);
                throw new MenuInputException();
            }
        } catch (NumberFormatException e) {
            logger.log(Level.INFO, "User typed " + choice);
            throw new MenuInputException();
        }
    }

    public static int getUserChoice() {
        System.out.print("ENTER 1-5 OR 0 FOR MAIN MENU: ");
        Scanner userInput = new Scanner(System.in);
        try {
            choice = Integer.parseInt(userInput.nextLine());
            if (choice > 0 && choice <= 5) {
                return choice;
            } else {
                logger.log(Level.INFO, "User typed " + choice);
                throw new MenuInputException();
            }
        } catch (NumberFormatException e) {
            logger.log(Level.INFO, "User typed " + choice);
            throw new MenuInputException();
        }
    }

    public static int getSizeOfArray() {
        System.out.print("ENTER SIZE OF ARRAY HERE (1-100): ");
        Scanner userInput = new Scanner(System.in);
        try {
            choice = Integer.parseInt(userInput.nextLine());

            if (choice > 0 && choice <= 100) {
                return choice;
            } else {
                logger.log(Level.INFO, "User typed " + choice);
                throw new ArrayFormatException();
            }
        } catch (NumberFormatException e) {
            logger.log(Level.INFO, "User typed " + choice);
            throw new ArrayFormatException();
        }
    }


    }

