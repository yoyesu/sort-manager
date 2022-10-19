package com.sparta.ms.sort_manager.view;

import com.sparta.ms.sort_manager.controller.SorterFactory;
import com.sparta.ms.sort_manager.model.algorithms.BubbleSort;
import com.sparta.ms.sort_manager.model.algorithms.Sorter;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayManager {
    public static void printStartMenu(){
        System.out.println("Hello! Enter the number of the sorter you prefer or press X to exit");
        System.out.println("1. Bubblesort \n2. Mergesort \n3. Binary tree \nX. Exit");
    }

    public static void askForArrayLength(){
        System.out.println("Please introduce the length of the array to sort.");
    }
    public static void printSorterName(String name){
        System.out.println("Array sorted with " + name + " algorithm.");
    }
    public static void printSortedArray(int[] sortedArray){
        System.out.println("Sorted array = " + Arrays.toString(sortedArray));
    }

    public static void printError() {
        System.out.println("Invalid value. Try again.");
    }

    public static void printOriginalArray(int[] unsortedArray) {
        System.out.println("Unsorted array = " + Arrays.toString(unsortedArray));
    }

    public static void printResult(String sorterName, int[] sortedArray) {
//        String originalArray = Arrays.toString(unsortedArray);
        String resultingArray = Arrays.toString(sortedArray);
        System.out.println("Algorithm used: " + sorterName +
                "\nSorted array: " + resultingArray);
    }
}
