package com.sparta.ms.sort_manager.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;

public class CustomFileHandler {

    private static final String FILE_PATH = "src/main/resources/";
    public static FileHandler getFileHandler(String fileName){
        try {
            FileHandler fileBTHandler = new FileHandler(FILE_PATH+fileName, true);
            fileBTHandler.setLevel(Level.ALL);
            fileBTHandler.setFormatter(new CustomFormatter());
            return fileBTHandler;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
