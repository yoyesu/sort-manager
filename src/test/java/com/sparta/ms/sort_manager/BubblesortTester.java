package com.sparta.ms.sort_manager;

import com.sparta.ms.sort_manager.algorithms.BubbleSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

//public class BubblesortTester {
//
//        @Test
//        @DisplayName("is the array in ascending order?")
//        void testBubbleSort() {
//
//            int[] expected = {1, 2, 3};
//            int[] actual = {3,2,1};
//            assertArrayEquals(expected, BubbleSort);
//        }
//
//        @Test
//        @DisplayName("is the array in descending order?")
//        void testDescendingBubbleSort() {
//
//            int[] expected = {3,2,1,-9};
//            int[] actual = {-9,1, 2, 3};
//            assertArrayEquals(expected, BubbleSort.sortDescendingArray(actual));
//        }
//
//        @Test
//        @DisplayName("works with empty array?")
//        void testEmptyArray() {
//            BubbleSort bubble = new BubbleSort();
//            int[] expected = {};
//            int[] actual = {};
//            assertArrayEquals(expected, BubbleSort.sortArrayWithBubblesort(actual));
//        }
//}
