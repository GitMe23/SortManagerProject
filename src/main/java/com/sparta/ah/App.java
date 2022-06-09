package com.sparta.ah;

import com.sparta.ah.logging.LogConfig;

import java.util.logging.Logger;


public class App
{

    public static void main( String[] args )
    {
        DisplayManager.displayMainMenu();
        LogConfig.setLogConfig();
        SortManager.run();
    }
}
