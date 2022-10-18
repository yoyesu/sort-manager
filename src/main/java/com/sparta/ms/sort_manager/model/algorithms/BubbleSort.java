package com.sparta.ms.sort_manager.model.algorithms;

import com.sparta.ms.sort_manager.model.ArrayGenerator;
import com.sparta.ms.sort_manager.view.DisplayManager;

public class BubbleSort extends Sorter {
    public static String sorterName = "Bubble sort";

//    BubbleSort(String sorterName) {
//        super(sorterName);
//    }


    public String getSorterName(){
        return sorterName;
    }

    public int[] sortArray(int[] array){
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
