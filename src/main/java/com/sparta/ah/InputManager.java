package com.sparta.ah;
import java.util.Scanner;

public class InputManager {

    public static int getUserChoice() {
        Scanner userInput = new Scanner(System.in);
        int choice = Integer.parseInt(userInput.nextLine());
        return choice;
    }



}
