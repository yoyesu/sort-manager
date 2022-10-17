package com.sparta.ms.sort_manager.algorithms;

import com.sparta.ms.sort_manager.ArrayGenerator;
import com.sparta.ms.sort_manager.DisplayManager;

public class BubbleSort implements Sortable{

    @Override
    public void sortArray(){
        sortArrayWithBubblesort(ArrayGenerator.generateRandomArray());
    }
    private static void sortArrayWithBubblesort(int[] array){
       int[] sortedArray = copyArray(array, array.length);

        if(sortedArray.length <= 1){
            DisplayManager.printResult(sortedArray,sortedArray);
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

        DisplayManager.printResult(array,sortedArray);
    }

    private static int[] copyArray(int[] arrayToCopy, int length) {
        int[] copyOfArray = new int[length];
        for(int i = 0; i < length; i++){
            copyOfArray[i] = arrayToCopy[i];
        }

        return copyOfArray;
    }

    private static void swapped(int[] array, int j) {
        int num1 = array[j];
        array[j] = array[j +1];
        array[j +1] = num1;
    }
}
