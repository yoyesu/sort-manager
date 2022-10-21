package com.sparta.ms.sort_manager.model;

import com.sparta.ms.sort_manager.view.DisplayManager;
import com.sparta.ms.sort_manager.view.Starter;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayGenerator {

    public static int[] generateRandomArray(){

        try{

            int arrayLength = setArrayLength();
            int[] array2 = new int[arrayLength];
            Random randNumber = new Random();

            for (int i = 0; i < arrayLength; i++){
                array2[i] = randNumber.nextInt(1000 + 1000) - 1000;
            }

            return array2;
        } catch (NegativeArraySizeException | InputMismatchException e){
            System.out.println("Invalid length");
            return generateRandomArray();
        }

    }

    private static int setArrayLength() throws NegativeArraySizeException{

        DisplayManager.askForArrayLength();
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        sc.nextLine();

        if (arrayLength <0){
            throw new NegativeArraySizeException();
        }
        return arrayLength;
    }
}
