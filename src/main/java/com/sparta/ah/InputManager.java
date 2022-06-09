package com.sparta.ah;
import java.util.Scanner;

public class InputManager {

    public static int getUserChoice() {
        System.out.print("ENTER YOUR CHOICE HERE: ");
        Scanner userInput = new Scanner(System.in);
        int choice = Integer.parseInt(userInput.nextLine());
        return choice;
    }

    public static int getSizeOfArray() {
        System.out.print("ENTER SIZE OF ARRAY HERE: ");
        Scanner userInput = new Scanner(System.in);
        int size = Integer.parseInt(userInput.nextLine());
        return size;
    }



}
