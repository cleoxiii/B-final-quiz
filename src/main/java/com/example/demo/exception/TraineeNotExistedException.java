package com.example.demo.exception;

public class TraineeNotExistedException extends RuntimeException{
    public TraineeNotExistedException(String message) {
        super(message);
    }
}
