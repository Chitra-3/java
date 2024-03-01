package com.example;
public class DetailsNotFoundException extends RuntimeException{
    public DetailsNotFoundException(String msg){
        super(msg);
    }
}