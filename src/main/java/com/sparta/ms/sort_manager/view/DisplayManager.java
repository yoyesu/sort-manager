package com.sparta.ms.sort_manager.view;

import com.sparta.ms.sort_manager.controller.SorterFactory;
import com.sparta.ms.sort_manager.model.algorithms.BubbleSort;
import com.sparta.ms.sort_manager.model.algorithms.Sorter;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class DisplayManager {
    public static void printStartMenu(){
        System.out.println("Hello! Enter the number of the sorter you prefer or press X to exit");
        System.out.println("1. Bubble Sort \n2. Merge Sort \n3. Binary Tree Sort \n4. Quick Sort \nX. Exit");
    }

    public static void askForArrayLength(){
        System.out.println("Please introduce the length of the array to sort.");
    }

    public static void printSortedArray(int[] sortedArray){
        System.out.println("Sorted array = " + Arrays.toString(sortedArray));
    }

    public static void printError() {
        System.out.println("Invalid value. Try again.");
    }

    public static void printOriginalArray(String sorterName, int[] unsortedArray) {
        String originalArray = Arrays.toString(unsortedArray);
        System.out.println("Algorithm used: " + sorterName +
                "\nSorted array:\n " + originalArray);
    }

    public static void printResult(int[] sortedArray, long startTime, long endTime) {
        DecimalFormat df = new DecimalFormat("###,###.##");
        String resultingArray = Arrays.toString(sortedArray);
        System.out.println("Sorted array:\n " + resultingArray + "\nNanoseconds taken: " + df.format(endTime - startTime));
    }
}
