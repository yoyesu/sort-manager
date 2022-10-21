package com.sparta.ms.sort_manager.controller;

import com.sparta.ms.sort_manager.model.algorithms.*;
import com.sparta.ms.sort_manager.exceptions.InvalidSorterException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SorterFactory {

    public Sorter createSorter(int chosenOption) throws InvalidSorterException {

        switch (chosenOption) {
            case 1 -> {
                return new BubbleSort();
            }
            case 2 -> {
                return new MergeSort();
            }
            case 3 -> {
                return new BinaryTreeSort();
            }
            case 4 -> {
                return new Quicksort();
            }
            case 5 -> {
                return new InsertionSort();
            }
            default -> {
                throw new InvalidSorterException();
            }
        }

    }

    public int getChosenSorterFromUser() throws InvalidSorterException {
        try{
            Scanner sc = new Scanner(System.in);
            int chosenOption = sc.nextInt();

            return chosenOption;
        } catch (InputMismatchException e){
            throw new InvalidSorterException();
        }

    }


}
