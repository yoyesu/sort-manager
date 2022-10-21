package com.sparta.ms.sort_manager.exceptions;

public class InvalidSorterException extends Exception{

    private final String message;

    public InvalidSorterException(String message){
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
