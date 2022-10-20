package com.sparta.ms.sort_manager.model.algorithms;

import com.sparta.ms.sort_manager.logging.CustomLoggingConfig;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Quicksort extends Sorter{
    public static String sorterName = "Quick sort";
    private static final Logger logger = Logger.getLogger("quicksort-logger");
    @Override
    public String getSorterName() {
        return sorterName;
    }

    @Override
    public int[] sortArray(int[] unsortedArray) {
        CustomLoggingConfig.configQuickSortLogger(logger);
        int lowIndex = 0;
        int highIndex = unsortedArray.length -1;

        int pivot = unsortedArray[highIndex];
        return unsortedArray;
    }
}
