package com.sparta.ms.sort_manager.view;

import com.sparta.ms.sort_manager.controller.SorterFactory;
import com.sparta.ms.sort_manager.model.ArrayGenerator;
import com.sparta.ms.sort_manager.model.algorithms.Sorter;
import com.sparta.ms.sort_manager.exceptions.InvalidSorterException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Starter {

    public static void startApp(){

        try{
            DisplayManager.printStartMenu();

            //getting input
            SorterFactory sorterFactory = new SorterFactory();
            int userInput = sorterFactory.getChosenSorterFromUser();
            Sorter chosenSorter = sorterFactory.createSorter(userInput);
            String sorterName = chosenSorter.getSorterName();
            int[] unsortedArray = ArrayGenerator.generateRandomArray();
            DisplayManager.printOriginalArray(sorterName, unsortedArray);

            //sorting
            long startTime = System.nanoTime();
            int[] sortedArray = chosenSorter.sortArray(unsortedArray);
            long endTime = System.nanoTime();

            DisplayManager.printResult(sortedArray, startTime, endTime);

        } catch (InvalidSorterException | InputMismatchException e){

            System.out.println(e.getMessage());
            startApp();
        }


    }
}
