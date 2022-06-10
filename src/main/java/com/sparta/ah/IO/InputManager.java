package com.sparta.ah.IO;
import com.sparta.ah.exceptions.ArrayFormatException;
import com.sparta.ah.exceptions.MenuInputException;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class InputManager {

    static int choice;
    public static int getMainMenuChoice() {
        System.out.print("Enter 1 to run program or 0 to exit: ");
        Scanner userInput = new Scanner(System.in);

        try {
            choice = Integer.parseInt(userInput.nextLine());
            return choice;
        } catch (NumberFormatException e) {
            throw new MenuInputException();
        }
    }

    public static int getUserChoice() {
        System.out.print("ENTER YOUR CHOICE HERE: ");
        Scanner userInput = new Scanner(System.in);
        try {
            choice = Integer.parseInt(userInput.nextLine());
            if (choice > 0 && choice <= 5) {
                return choice;
            } else {
                throw new MenuInputException();
            }
        } catch (NumberFormatException e) {
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
                throw new ArrayFormatException();
            }
        } catch (NumberFormatException e) {
            throw new ArrayFormatException();
        }
    }

        public static int getRunAgainChoice() {
            System.out.print("Enter 1 to run again, 0 to exit: ");
            Scanner userInput = new Scanner(System.in);
            try {
                choice = Integer.parseInt(userInput.nextLine());
                if (choice > 0 && choice <=5) {
                   return choice;
               } else {
                    throw new MenuInputException();
                }
            } catch (NumberFormatException e) {
                throw new MenuInputException();
            }
        }
    }

