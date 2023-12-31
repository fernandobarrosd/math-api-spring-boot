package com.fernando.mathapi.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import com.fernando.mathapi.dtos.DeltaResponseError;
import com.fernando.mathapi.dtos.ResponseError;
import com.fernando.mathapi.exceptions.NegativeDeltaException;
import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalHandler {
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ResponseError> handleMethodArgumentTypeMismatch(MethodArgumentTypeMismatchException e, HttpServletRequest request) {
        String path = request.getRequestURI();
        String message = "Conversion error";
        ResponseError responseError = new ResponseError(message, true, path, HttpStatus.BAD_REQUEST.value());
        return ResponseEntity.badRequest().body(responseError);
    }

    @ExceptionHandler(NegativeDeltaException.class)
    public ResponseEntity<ResponseError> handleNegativeDelta(NegativeDeltaException e, HttpServletRequest request) {
        String path = request.getRequestURI();
        String message = e.getMessage();

        DeltaResponseError responseError = new DeltaResponseError(message, true, 
        path, HttpStatus.BAD_REQUEST.value(), e.getNumberOne(), 
        e.getNumberTwo(), e.getNumberThree(), e.getDelta());

        return ResponseEntity.badRequest().body(responseError);

    }
}