package com.sparta.ms.sort_manager.model.algorithms;

public abstract class Sorter {
    public String sorterName;

    public abstract String getSorterName();

    public abstract int[] sortArray(int[] unsortedArray);

}
