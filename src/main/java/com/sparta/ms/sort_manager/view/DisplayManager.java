package com.sparta.ms.sort_manager.view;

import java.text.DecimalFormat;
import java.util.Arrays;

public class DisplayManager {
    public static void printStartMenu(){
        System.out.println("Hello! Enter the number of the sorter you prefer or press X to exit");
        System.out.println("1. Bubble Sort \n2. Merge Sort \n3. Binary Tree Sort \n4. Quick Sort \n5. Insertion Sort");
    }

    public static void askForArrayLength(){
        System.out.println("Please introduce the length of the array to sort.");
    }

    public static void printOriginalArray(String sorterName, int[] unsortedArray) {
        String originalArray = Arrays.toString(unsortedArray);
        System.out.println("Algorithm used: " + sorterName +
                "\nOriginal array:\n " + originalArray);
    }

    public static void printResult(int[] sortedArray, long startTime, long endTime) {
        DecimalFormat df = new DecimalFormat("###,###.##");
        String resultingArray = Arrays.toString(sortedArray);
        System.out.println("Sorted array:\n " + resultingArray + "\nNanoseconds taken: " + df.format(endTime - startTime));
    }
}
