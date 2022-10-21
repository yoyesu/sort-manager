package com.sparta.ms.sort_manager;

import com.sparta.ms.sort_manager.model.algorithms.BinaryTreeSort;
import com.sparta.ms.sort_manager.model.algorithms.BubbleSort;
import com.sparta.ms.sort_manager.model.algorithms.MergeSort;
import com.sparta.ms.sort_manager.model.algorithms.Sorter;
import com.sparta.ms.sort_manager.view.DisplayManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.Arrays;

public class TimeTester {
    private int[] unsortedArray;
    private int[] arrayToSort;

    public void printResults(String sorterName, long duration, int[] array){
        DecimalFormat df = new DecimalFormat("###,###.##");
        System.out.println("Sorter used: " + sorterName
                + "\nNanoseconds taken: " + df.format(duration)
                + "\nSorted array: " + Arrays.toString(array));
    }
    @BeforeEach
    public void setup(){
        unsortedArray = arrayToSort.clone();
    }

    @Test
    public void testBubbleSort(){
        System.out.println("---------" + Arrays.toString(unsortedArray));
        Sorter sorter = new BubbleSort();
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        printResults(sorter.getSorterName(), end-start, sortedArray);
    }

    @Test
    public void testMergeSort(){
        System.out.println("---------" + Arrays.toString(unsortedArray));
        Sorter sorter = new MergeSort();
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        printResults(sorter.getSorterName(), end-start, sortedArray);
    }

    @Test
    public void testBinaryTreeSort(){
        System.out.println("---------" + Arrays.toString(unsortedArray));
        Sorter sorter = new BinaryTreeSort(0);
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        long end = System.nanoTime();
        printResults(sorter.getSorterName(), end-start, sortedArray);
    }
}
