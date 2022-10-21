package com.sparta.ms.sort_manager.exceptions;

public class InvalidSorterException extends Exception{

    private final String message;

    public InvalidSorterException(){
        this.message = "Invalid sorter.";
    }
    @Override
    public String getMessage() {
        return message;
    }
}
