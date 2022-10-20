package com.sparta.ms.sort_manager.model.exceptions;

public class ChildNotFoundException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Child was not found";
    }
}
