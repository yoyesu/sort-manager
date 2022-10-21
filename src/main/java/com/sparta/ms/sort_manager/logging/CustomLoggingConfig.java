package com.sparta.ms.sort_manager.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomLoggingConfig {

    public static void configBinaryTreeLogger(Logger logger){
        logger.setUseParentHandlers(false);
        logger.addHandler(CustomFileHandler.getBinaryTreeFileHandler());
        logger.setLevel(Level.ALL);
    }

    public static void configQuickSortLogger(Logger logger){
        logger.setUseParentHandlers(false);
        logger.addHandler(CustomFileHandler.getQuickSortFileHandler());
        logger.setLevel(Level.ALL);
    }

    public static void configBubbleSortLogger(Logger logger){
        logger.setUseParentHandlers(false);
        logger.addHandler(CustomFileHandler.getBubblesortFileHandler());
        logger.setLevel(Level.ALL);
    }

    public static void configMergeSortLogger(Logger logger){
        logger.setUseParentHandlers(false);
        logger.addHandler(CustomFileHandler.getMergesortFileHandler());
        logger.setLevel(Level.ALL);
    }

}
