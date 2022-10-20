package com.sparta.ms.sort_manager.logging;

import java.io.IOException;
import java.util.logging.*;

public class MergeSingletonLog {

    private static MergeSingletonLog instance = new MergeSingletonLog();

    private MergeSingletonLog(){}

    public static MergeSingletonLog getInstance(){
        return instance;
    }

    public void logMerge(Logger logger) {

        try {
            logger.setUseParentHandlers(false);
            FileHandler loggerFH = new FileHandler("src/main/resources/mergesort-log.log", 0, 1, true);
            logger.addHandler(loggerFH);
            logger.setLevel(Level.ALL);
            loggerFH.setLevel(Level.ALL);
            loggerFH.setFormatter(new CustomFormatter());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
