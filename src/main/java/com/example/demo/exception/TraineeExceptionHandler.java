package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Objects;

@ControllerAdvice
public class TraineeExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResult> handle(MethodArgumentNotValidException exception) {
        String message = Objects.requireNonNull(exception.getBindingResult().getFieldError()).getDefaultMessage();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ErrorResult.builder().code(HttpStatus.BAD_REQUEST.value()).message(message).build());
    }

    @ExceptionHandler(TraineeNotExistedException.class)
    public ResponseEntity<ErrorResult> handle(TraineeNotExistedException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(ErrorResult.builder().code(HttpStatus.NOT_FOUND.value()).message(exception.getMessage()).build());
    }
}
