package com.sparta.ms.sort_manager.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomLoggingConfig {

    public static void configTestLogger(Logger logger, String fileName){
        logger.setUseParentHandlers(false);
        logger.addHandler(CustomFileHandler.getFileHandler(fileName));
        logger.setLevel(Level.ALL);
    }

}
