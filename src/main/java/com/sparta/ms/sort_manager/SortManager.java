package com.sparta.ms.sort_manager;

import com.sparta.ms.sort_manager.algorithms.BubbleSort;
import com.sparta.ms.sort_manager.algorithms.MergeSort;

import java.util.Scanner;

public class SortManager {

    public static void chooseTypeOfSorter(){
        DisplayManager.printStartMenu();

        String chosenOption = getChosenSorterFromUser();

        switch (chosenOption) {
            case "1" -> {
                BubbleSort bubble = new BubbleSort();
                bubble.sortArray();
            }
            case "2" -> {
                MergeSort merge = new MergeSort();
                merge.sortArray();
            }
            case "X" -> System.out.println("Bye, bye!");
            default -> {
                System.out.println("Invalid option entered. Try again ");
                chooseTypeOfSorter();
            }
        }
    }

    private static String getChosenSorterFromUser() {

        Scanner sc = new Scanner(System.in);
        String chosenOption = sc.nextLine().toUpperCase();
        //have validation checks here?
        return chosenOption;
    }
}
