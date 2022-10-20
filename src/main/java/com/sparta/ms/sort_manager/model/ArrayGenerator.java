package com.sparta.ms.sort_manager.model;

import com.sparta.ms.sort_manager.view.DisplayManager;

import java.util.Random;
import java.util.Scanner;

public class ArrayGenerator {

    public static int[] generateRandomArray(){
        int arrayLength = setArrayLength();
        int[] array = new int[arrayLength];
        Random randNumber = new Random();

        for (int i = 0; i < arrayLength; i++){
            array[i] = randNumber.nextInt(1001);
        }

        return array;
    }

    private static int setArrayLength(){

        try{
            DisplayManager.askForArrayLength();
            Scanner sc = new Scanner(System.in);
            int arrayLength = sc.nextInt();
            sc.hasNextLine();

            if(arrayLength < 0){
                DisplayManager.printError();
                setArrayLength();
            }cd 
            return arrayLength;
        } catch (Exception e){
            setArrayLength();
        }
        return 0;
    }
}
