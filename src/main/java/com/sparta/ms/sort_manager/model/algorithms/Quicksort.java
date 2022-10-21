package com.sparta.ms.sort_manager.model.algorithms;

import com.sparta.ms.sort_manager.logging.CustomLoggingConfig;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Quicksort extends Sorter{
    public static String sorterName = "Quick sort";
    private static final Logger logger = Logger.getLogger("quicksort-logger");

    static{
        CustomLoggingConfig.configQuickSortLogger(logger);
    }
    @Override
    public String getSorterName() {
        return sorterName;
    }

    @Override
    public int[] sortArray(int[] unsortedArray) {
        logger.log(Level.INFO, "Unsorted array = " + Arrays.toString(unsortedArray));
        int start = 0;
        int end = unsortedArray.length-1;
        quickSort(unsortedArray, start, end);
        return unsortedArray;
    }

    static int partition(int[] array, int low, int high) {

        int pivot = array[high];

        // pointer for greater element
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return (i + 1);
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            logger.log(Level.FINE, "Partition has started");
            int pi = partition(array, low, high);
            //call on the left numbers of the pivot
            quickSort(array, low, pi - 1);
            logger.log(Level.FINE, "Numbers on the left checked. Highest index is " + (pi-1));
            //call on the right numbers of the pivot
            quickSort(array, pi + 1, high);
            logger.log(Level.FINE, "Numbers on the right checked. Lowest index is " + (pi+1));
        }
    }
}
