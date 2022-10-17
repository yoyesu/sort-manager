package com.sparta.ms.sort_manager.algorithms;

import com.sparta.ms.sort_manager.ArrayGenerator;
import com.sparta.ms.sort_manager.DisplayManager;

public class BubbleSort implements Sortable{

    public void sortArray(){
        sortArrayWithBubblesort(ArrayGenerator.generateRandomArray());
    }
    private static void sortArrayWithBubblesort(int[] array){
        int[] sortedArray = array;

        if(sortedArray.length <= 1){
            DisplayManager.printResult(array,array);
        }
        for(int i = 0; i < sortedArray.length -1; i++){
            boolean sorted = true;

            for (int j = 0; j < sortedArray.length -i -1;j++){
                if (array[j] > array[j+1]){
                    swapped(sortedArray, j);
                    sorted = false;
                }
            }
            if(sorted){
                break;
            }
        }

        DisplayManager.printResult(array,sortedArray);
    }

    private static void swapped(int[] array, int j) {
        int num1 = array[j];
        array[j] = array[j +1];
        array[j +1] = num1;
    }
}
