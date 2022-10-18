package com.sparta.ms.sort_manager.model.algorithms;

import com.sparta.ms.sort_manager.model.ArrayGenerator;
import com.sparta.ms.sort_manager.view.DisplayManager;

public class MergeSort extends Sorter {

    public static String sorterName = "Merge sort";
    @Override
    public String getSorterName() {
        return sorterName;
    }

    public int[] sortArray(int[] givenArray){
        int arraySize = givenArray.length;

        if (arraySize <= 1){
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

        //if the half arrays are not sorted before merging, the merged array won't be sorted
        sortArray(leftArray);
        sortArray(rightArray);

        return mergeLeftAndRight(givenArray, leftArray, rightArray);
    }

    private static int[] mergeLeftAndRight(int[] givenArray, int[] leftArray, int[] rightArray) {
        int indexGivenArray = 0;
        int indexLeftArr = 0;
        int indexRightArr = 0;

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

        //if we have completely sorted one array (r/l), we need to sort the remaining ints in the array that is not
        // sorted yet
        while (indexLeftArr < leftArray.length){ //sort left is right is sorted above
            givenArray[indexGivenArray] = leftArray[indexLeftArr];
            indexLeftArr++;
            indexGivenArray++;
        }

        while (indexRightArr < rightArray.length){ //sort right if left is sorted above
            givenArray[indexGivenArray] = rightArray[indexRightArr];
            indexRightArr++;
            indexGivenArray++;
        }

        return givenArray;

    }
}
