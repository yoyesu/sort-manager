package com.sparta.ms.sort_manager;

import com.sparta.ms.sort_manager.model.algorithms.*;
import com.sparta.ms.sort_manager.view.DisplayManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class TimeTester {
    private int[] unsortedArray;
    private static int[] arrayToSort;

    public void printResults(String sorterName, long duration, int[] array){
        DecimalFormat df = new DecimalFormat("###,###.##");
        System.out.println("Sorter used: " + sorterName
                + "\nNanoseconds taken: " + df.format(duration)
                + "\nSorted array: " + Arrays.toString(array));
    }

    @BeforeAll
    public static void createArray(){
        int arrayLength = 100;
        arrayToSort = new int[arrayLength];
        Random randNumber = new Random();

        for (int i = 0; i < arrayLength; i++){
            arrayToSort[i] = randNumber.nextInt(1000 + 1000) -1000;
        }
    }

    @BeforeEach
    public void setup(){
        unsortedArray = arrayToSort.clone();
    }

    @Test
    public void testBubbleSort(){
        System.out.println("-----------\n" + "Original array\n" + Arrays.toString(unsortedArray));
        Sorter sorter = new BubbleSort();
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        printResults(sorter.getSorterName(), end-start, sortedArray);
    }

    @Test
    public void testMergeSort(){
        System.out.println("-----------\n" + "Original array\n" + Arrays.toString(unsortedArray));
        Sorter sorter = new MergeSort();
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        printResults(sorter.getSorterName(), end-start, sortedArray);
    }

    @Test
    public void testBinaryTreeSort(){
        System.out.println("-----------\n" + "Original array\n" + Arrays.toString(unsortedArray));
        Sorter sorter = new BinaryTreeSort();
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        printResults(sorter.getSorterName(), end-start, sortedArray);
    }

    @Test
    public void testInsertionSort(){
        System.out.println("-----------\n" + "Original array\n" + Arrays.toString(unsortedArray));
        Sorter sorter = new InsertionSort();
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        printResults(sorter.getSorterName(), end-start, sortedArray);
    }

    @Test
    public void testQuickSort(){
        System.out.println("-----------\n" + "Original array\n" + Arrays.toString(unsortedArray));
        Sorter sorter = new Quicksort();
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        printResults(sorter.getSorterName(), end-start, sortedArray);
    }
}
