package com.sparta.ms.sort_manager.view;

import com.sparta.ms.sort_manager.controller.SorterFactory;
import com.sparta.ms.sort_manager.model.ArrayGenerator;
import com.sparta.ms.sort_manager.model.algorithms.Sorter;
import com.sparta.ms.sort_manager.model.exceptions.InvalidSorterException;
import com.sparta.ms.sort_manager.view.DisplayManager;

public class Starter {

    public static void startApp(){

        try{
            DisplayManager.printStartMenu();

            SorterFactory sorterFactory = new SorterFactory();
            String userInput = sorterFactory.getChosenSorterFromUser();
            Sorter chosenSorter = sorterFactory.createSorter(userInput);
            String sorterName = chosenSorter.getSorterName();
            int[] unsortedArray = ArrayGenerator.generateRandomArray();
            DisplayManager.printOriginalArray(unsortedArray);
            int[] sortedArray = chosenSorter.sortArray(unsortedArray);

            DisplayManager.printResult(sorterName, sortedArray);
        } catch (InvalidSorterException e){
            System.out.println(e.getMessage());
            startApp();
        }


    }
}
