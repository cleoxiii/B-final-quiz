package com.example.demo.exception;

public class TrainerNotExistedException extends RuntimeException{
    public TrainerNotExistedException(String message) {
        super(message);
    }
}
