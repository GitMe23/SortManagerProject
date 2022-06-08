package com.sparta.ah;

import com.sparta.ah.logging.CustomFilter;
import com.sparta.ah.logging.CustomFormatter;
import com.sparta.ah.sorters.binarytree.BinaryTree;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class App
{
    public static Logger logger = Logger.getLogger("sort logger");
    public static void main( String[] args )
    {
        LogConfig.setLogConfig();
        SortManager sortManager = new SortManager();
        sortManager.run();

    }
}
