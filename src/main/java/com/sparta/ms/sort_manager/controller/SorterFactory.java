package com.sparta.ms.sort_manager.controller;

import com.sparta.ms.sort_manager.model.algorithms.*;
import com.sparta.ms.sort_manager.model.exceptions.InvalidSorterException;

import java.util.Scanner;

public class SorterFactory {

    public Sorter createSorter(String chosenOption) throws InvalidSorterException {

        switch (chosenOption) {
            case "1" -> {
                return new BubbleSort();
            }
            case "2" -> {
                return new MergeSort();
            }
            case "3" -> {
                return new BinaryTreeSort(0);
            }
            case "4" -> {
                return new Quicksort();
            }
            case "X" -> System.out.println("Bye, bye!");
            default -> {
                System.out.println();
                throw new InvalidSorterException("Invalid sorter.");
            }
        }

        return null;
    }

    public String getChosenSorterFromUser() {

        Scanner sc = new Scanner(System.in);
        String chosenOption = sc.nextLine().toUpperCase();
        //have validation checks here?
        return chosenOption;
    }


}
