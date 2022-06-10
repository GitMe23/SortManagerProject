package com.sparta.ah;

import com.sparta.ah.IO.DisplayManager;
import com.sparta.ah.contol.SortManager;


public class App
{

    public static void main( String[] args )
    {
        DisplayManager.displayMainMenu();
        SortManager.run();
    }
}
