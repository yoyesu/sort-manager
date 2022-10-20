package com.sparta.ms.sort_manager.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;

public class CustomFileHandler {


    public static FileHandler getBinaryTreeFileHandler() {
        try {
            FileHandler fileBTHandler = new FileHandler("src/main/resources/binaryTree-log.log", true);
            fileBTHandler.setLevel(Level.ALL);
            fileBTHandler.setFormatter(new CustomFormatter());
            return fileBTHandler;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Handler getQuickSortFileHandler() {
        try {
            FileHandler fileQuickSortHandler = new FileHandler("src/main/resources/quicksort-log.log", true);
            fileQuickSortHandler.setLevel(Level.ALL);
            fileQuickSortHandler.setFormatter(new CustomFormatter());
            return fileQuickSortHandler;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Handler getBubblesortFileHandler() {
        try {
            FileHandler fileBubbleSortHandler = new FileHandler("src/main/resources/bubblesort-log.log", true);
            fileBubbleSortHandler.setLevel(Level.ALL);
            fileBubbleSortHandler.setFormatter(new CustomFormatter());
            return fileBubbleSortHandler;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

//    public static Handler getMergesortFileHandler() {
//        try {
//            FileHandler fileMergeSortHandler = new FileHandler("src/main/resources/mergesort-log.log", true);
//            fileMergeSortHandler.setLevel(Level.ALL);
//            fileMergeSortHandler.setFormatter(new CustomFormatter());
//            return fileMergeSortHandler;
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
}
