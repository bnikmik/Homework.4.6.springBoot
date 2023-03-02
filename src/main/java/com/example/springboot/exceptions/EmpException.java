package com.example.springboot.exceptions;

public class EmpException extends RuntimeException{
    public EmpException(String message) {
        super(message);
    }
}
