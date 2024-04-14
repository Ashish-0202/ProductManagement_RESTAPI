package com.RestCrud.ProductManagement.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.RestCrud.ProductManagement.Entity.CustomErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler
    public ResponseEntity<CustomErrorResponse> handleException(ProductNotFoundExcepption excepption){
        CustomErrorResponse customErrorResponse=new CustomErrorResponse();
        customErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        customErrorResponse.setMessage(excepption.getMessage());
        customErrorResponse.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<CustomErrorResponse>(customErrorResponse, HttpStatus.BAD_REQUEST);
    }
}
