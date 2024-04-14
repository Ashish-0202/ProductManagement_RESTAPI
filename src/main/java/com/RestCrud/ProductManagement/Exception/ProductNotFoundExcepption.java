package com.RestCrud.ProductManagement.Exception;

public class ProductNotFoundExcepption extends RuntimeException{
    public ProductNotFoundExcepption(String message){
        super(message);
    }

    public ProductNotFoundExcepption(String message, Throwable cause){
        super(message, cause);
    }

    public ProductNotFoundExcepption(Throwable cause){
        super(cause);
    }
}
