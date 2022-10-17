package com.sparta.ms.sort_manager;

import java.util.Arrays;

public class DisplayManager {
    public static void printStartMenu(){
        System.out.println("Hello! Enter the number of the sorter you prefer or press X to exit");
        System.out.println("1. Bubblesort \n 2. Mergesort \n 3. Binary tree \n X. Exit");
    }

    public static void askForArrayLength(){
        System.out.println("Please introduce the length of the array to sort.");
    }

    public static void printResult(int[] unsortedArray, int[] sortedArray){
        System.out.println("Unsorted array = " + Arrays.toString(unsortedArray));
        System.out.println("Sorted array = " + Arrays.toString(sortedArray));
    }
}
