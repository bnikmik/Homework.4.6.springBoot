package com.example.springboot.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<MessageForException> handleException(
            EmpException empException) {
        MessageForException message = new MessageForException();
        message.setMessage(empException.getMessage());
        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }
}
