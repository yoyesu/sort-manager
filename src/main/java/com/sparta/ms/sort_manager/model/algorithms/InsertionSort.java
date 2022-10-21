package com.sparta.ms.sort_manager.model.algorithms;

import com.sparta.ms.sort_manager.logging.CustomLoggingConfig;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertionSort extends Sorter {

    public static String sorterName = "Insertion Sort";
    private static final Logger logger = Logger.getLogger("insertionsort-logger");
        static {
            CustomLoggingConfig.configInsertionSortLogger(logger);
        }

    @Override
    public String getSorterName() {
        return sorterName;
    }

    @Override
    public int[] sortArray(int[] unsortedArray) {
            logger.log(Level.INFO, "SortArray has started with array " + Arrays.toString(unsortedArray));

        for (int j = 1; j < unsortedArray.length; j++) {
            int key = unsortedArray[j];
            int i = j - 1;
            while ((i > -1) && (unsortedArray[i] > key)) {
                unsortedArray[i + 1] = unsortedArray[i];
                logger.log(Level.FINER, "Adding " + unsortedArray[i] + " to array at position " + (i + 1));
                logger.log(Level.FINER, "Array now is " + Arrays.toString(unsortedArray));
                i--;
            }
            unsortedArray[i + 1] = key;
            logger.log(Level.FINE, "Adding " + key + " to array at position " + (i+1));
            logger.log(Level.FINE, "Array now is " + Arrays.toString(unsortedArray));
        }

        return unsortedArray;
    }
}
