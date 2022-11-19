package com.example.project.BookMyShow.Exceptions;

public class DuplicateEntityException extends RuntimeException{
    private final String message;
    public DuplicateEntityException(String message){
        super(message);
        this.message=message;
    }
}
