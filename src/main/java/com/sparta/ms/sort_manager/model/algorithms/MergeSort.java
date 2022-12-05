package com.sparta.ms.sort_manager.model.algorithms;

import com.sparta.ms.sort_manager.logging.CustomLoggingConfig;


import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MergeSort extends Sorter {

    public static String sorterName = "Merge sort";
    private static final Logger logger = Logger.getLogger("mergesort-logger");

    static {
        CustomLoggingConfig.configTestLogger(logger,"merge-sort.log");
    }

    @Override
    public String getSorterName() {
        return sorterName;
    }

    public int[] sortArray(int[] givenArray){

        int arraySize = givenArray.length;

        if (arraySize <= 1){
            logger.log(Level.INFO, "Array returned because length is <= 1 =");
           return givenArray;
        }
        int midIndex = arraySize /2;

        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[arraySize - midIndex];

        //assigning values to left array
        for (int i = 0; i < leftArray.length; i++){
            leftArray[i] = givenArray[i];
        }

        //assigning values to right array
        for (int i = midIndex; i < givenArray.length; i++){
            rightArray[i - midIndex] = givenArray[i];
        }

        sortArray(leftArray);
        sortArray(rightArray);

        return mergeLeftAndRight(givenArray, leftArray, rightArray);
    }

    private static int[] mergeLeftAndRight(int[] givenArray, int[] leftArray, int[] rightArray) {
        int indexGivenArray = 0;
        int indexLeftArr = 0;
        int indexRightArr = 0;

        logger.log(Level.INFO, "Merge started.");
        logger.log(Level.INFO, "L array size = " + leftArray.length);
        logger.log(Level.INFO, "R array size = " + rightArray.length);

        while (indexLeftArr < leftArray.length && indexRightArr < rightArray.length){
            if(leftArray[indexLeftArr] <= rightArray[indexRightArr]){ // <= in case we're comparing two equal numbers
                givenArray[indexGivenArray] = leftArray[indexLeftArr];
                indexLeftArr++;
            } else {
                givenArray[indexGivenArray] = rightArray[indexRightArr];
                indexRightArr++;
            }
            indexGivenArray++;
        }


        while (indexLeftArr < leftArray.length){ //sort left if right is sorted above
            logger.log(Level.FINE, "R array is sorted. Finalising L");
            givenArray[indexGivenArray] = leftArray[indexLeftArr];
            indexLeftArr++;
            indexGivenArray++;
        }

        while (indexRightArr < rightArray.length){ //sort right if left is sorted above
            logger.log(Level.FINE, "L array is sorted. Finalising R");
            givenArray[indexGivenArray] = rightArray[indexRightArr];
            indexRightArr++;
            indexGivenArray++;
        }

        logger.log(Level.INFO, "Merged array = " + Arrays.toString(givenArray));
        return givenArray;

    }
}
