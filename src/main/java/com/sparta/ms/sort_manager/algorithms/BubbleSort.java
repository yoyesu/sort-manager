package com.sparta.ms.sort_manager.algorithms;

import com.sparta.ms.sort_manager.ArrayGenerator;
import com.sparta.ms.sort_manager.DisplayManager;

public class BubbleSort implements Sortable{

    @Override
    public void sortArray(){
        DisplayManager.printSortedArray(sortArrayWithBubblesort(ArrayGenerator.generateRandomArray()));
    }
    private static int[] sortArrayWithBubblesort(int[] array){
       int[] sortedArray = array;

        if(sortedArray.length <= 1){
            return sortedArray;
        }
        for(int i = 0; i < sortedArray.length -1; i++){
            boolean sorted = true;

            for (int j = 0; j < sortedArray.length -i -1;j++){
                if (sortedArray[j] > sortedArray[j+1]){
                    swapped(sortedArray, j);
                    sorted = false;
                }
            }
            if(sorted){
                break;
            }
        }

        return sortedArray;
    }

    private static void swapped(int[] array, int j) {
        int num1 = array[j];
        array[j] = array[j +1];
        array[j +1] = num1;
    }
}
