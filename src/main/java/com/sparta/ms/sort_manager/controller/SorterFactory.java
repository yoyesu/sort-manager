package com.sparta.ms.sort_manager.controller;

import com.sparta.ms.sort_manager.model.algorithms.BubbleSort;
import com.sparta.ms.sort_manager.model.algorithms.MergeSort;
import com.sparta.ms.sort_manager.model.algorithms.Sorter;

import java.util.Scanner;

public class SorterFactory {

    public Sorter createSorter(String chosenOption){

        switch (chosenOption) {
            case "1" -> {
                return new BubbleSort();
            }
            case "2" -> {
                return new MergeSort();
            }
            case "X" -> System.out.println("Bye, bye!");
            default -> {
                System.out.println("Invalid option entered. Try again ");
                createSorter(chosenOption);
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
