package com.sparta.ms.sort_manager;

import com.sparta.ms.sort_manager.controller.SorterFactory;
import com.sparta.ms.sort_manager.model.algorithms.Sorter;
import com.sparta.ms.sort_manager.model.exceptions.InvalidSorterException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortTester {

    private static Sorter sorter;
    private int[] unsortedArray;
    @BeforeAll
    public static void setClass() throws InvalidSorterException {
        SorterFactory sorterFactory = new SorterFactory();
        sorter = sorterFactory.createSorter(4);
        System.out.println("Testing using the sorter " + sorter.getSorterName());
    }

    @BeforeEach
    public void setup(){
        Random random = new Random();
        unsortedArray = new int[10];
        for(int i =0; i < 10; i++){
            unsortedArray[i] = random.nextInt(101);
        }
    }

    @Test
    public void testIsSorted(){
        int[] sortedArray = sorter.sortArray(unsortedArray);
        for (int i = 0; i < sortedArray.length-1;i++){
            Assertions.assertTrue(sortedArray[i+1] >= sortedArray[i]);
        }
    }

    @Test
    void testOddSizedArray(){
        int[] unsortedArray = {6,3,9,0,1};
        int[] sortedArray = sorter.sortArray(unsortedArray);
        Assertions.assertEquals(sortedArray.length, unsortedArray.length);
        Assertions.assertEquals(1,sortedArray.length%2);
        for (int i = 0; i < sortedArray.length-1;i++){
            Assertions.assertTrue(sortedArray[i+1] >= sortedArray[i]);
        }
    }

    @Test
    public void testAlreadySorted(){
        int[] unsortedArray = {1,2,3,4};
        int[] sortedArray = sorter.sortArray(unsortedArray);
        Assertions.assertEquals(sortedArray.length,sortedArray.length);
        for (int i = 0; i < sortedArray.length-1;i++){
            Assertions.assertEquals(sortedArray[i], unsortedArray[i]);
        }
    }

    @Test
    public void testLargeArray(){
        int[] sortedArray = sorter.sortArray(unsortedArray);
        Assertions.assertEquals(sortedArray.length,unsortedArray.length);
        for (int i = 0; i < sortedArray.length-1;i++){
            Assertions.assertTrue(sortedArray[i+1] >= sortedArray[i]);
        }
    }

    @Test
    public void testNegativeNumbersArray(){
        int[] unsortedArray = {-11,-2,-94,4};
        int[] sortedArray = sorter.sortArray(unsortedArray);
        Assertions.assertEquals(sortedArray.length,sortedArray.length);
        for (int i = 0; i < sortedArray.length-1;i++){
            Assertions.assertTrue(sortedArray[i+1] >= sortedArray[i]);
        }
    }

    @Test
    public void testDuplicateNumbersArray(){
        int[] unsortedArray = {-11,-2,-94,4};
        int[] sortedArray = sorter.sortArray(unsortedArray);
        Assertions.assertEquals(sortedArray.length,sortedArray.length);
        for (int i = 0; i < sortedArray.length-1;i++){
            Assertions.assertTrue(sortedArray[i+1] >= sortedArray[i]);
        }
    }

    @Test
    public void testZeroLengthArray(){
        int[] unsortedArray = {};
        int[] sortedArray = sorter.sortArray(unsortedArray);
        Assertions.assertEquals(sortedArray.length,sortedArray.length);
        for (int i = 0; i < sortedArray.length-1;i++){
            Assertions.assertTrue(sortedArray[i+1] >= sortedArray[i]);
        }
    }
    @Test
    public void testOneNumberArray(){
        int[] unsortedArray = {1};
        int[] sortedArray = sorter.sortArray(unsortedArray);
        Assertions.assertEquals(sortedArray.length,sortedArray.length);
        for (int i = 0; i < sortedArray.length-1;i++){
            Assertions.assertTrue(sortedArray[i+1] >= sortedArray[i]);
        }
    }


}
