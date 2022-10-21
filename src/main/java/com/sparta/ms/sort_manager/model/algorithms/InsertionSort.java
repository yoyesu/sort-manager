package com.sparta.ms.sort_manager.model.algorithms;

import java.util.logging.Logger;

public class InsertionSort extends Sorter {

    public static String sorterName = "Insertion Sort";
    private static final Logger logger = Logger.getLogger("insertionsort-logger");


    @Override
    public String getSorterName() {
        return sorterName;
    }

    @Override
    public int[] sortArray(int[] unsortedArray) {
        for (int j = 1; j < unsortedArray.length; j++) {
            int key = unsortedArray[j];
            int i = j - 1;
            while ((i > -1) && (unsortedArray[i] > key)) {
                unsortedArray[i + 1] = unsortedArray[i];
                i--;
            }
            unsortedArray[i + 1] = key;
        }

        return unsortedArray;
    }
}
