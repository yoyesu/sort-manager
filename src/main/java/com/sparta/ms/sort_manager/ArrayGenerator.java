package com.sparta.ms.sort_manager;

import java.util.Random;
import java.util.Scanner;

public class ArrayGenerator {

    public static int[] generateRandomArray(){
        int arrayLength = setArrayLength();
        int[] array = new int[arrayLength];
        Random randNumber = new Random();

        for(int value: array){
            value = randNumber.nextInt(1001);
        }
        return array;
    }

    private static int setArrayLength(){
        DisplayManager.askForArrayLength();

        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        sc.hasNextLine();
        return arrayLength;
    }
}
