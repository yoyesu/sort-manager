package com.sparta.ms.sort_manager.model.algorithms;

import com.sparta.ms.sort_manager.logging.CustomLoggingConfig;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BubbleSort extends Sorter {
    public static String sorterName = "Bubble Sort";

    private static final Logger logger = Logger.getLogger("bubblesort-logger");
    static {
        CustomLoggingConfig.configTestLogger(logger, "bubble-sort.log");
    }

    public String getSorterName(){
        return sorterName;
    }

    public int[] sortArray(int[] sortedArray){

        if(sortedArray.length <= 1){
            return sortedArray;
        }
        for(int i = 0; i < sortedArray.length -1; i++){
            logger.log(Level.FINE, "Iteration #" + i);
            boolean sorted = true;

            for (int j = 0; j < sortedArray.length -i -1;j++){

                logger.log(Level.FINER, "\nIndex #" + j + "\n #1 Element value = " + sortedArray[j] + "\n #2 Element " +
                        "value = " + sortedArray[j+1]);

                if (sortedArray[j] > sortedArray[j+1]){
                    swapped(sortedArray, j);
                    sorted = false;
                }
            }
            if(sorted){
                logger.log(Level.INFO, "Breaking out of the loop at iteration #" + i);
                break;
            }
        }

        return sortedArray;
    }

    private static void swapped(int[] array, int j) {
        int num1 = array[j];
        array[j] = array[j + 1];
        array[j + 1] = num1;
    }

}
