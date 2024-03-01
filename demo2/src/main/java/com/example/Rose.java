package com.example;

public class Rose {
  
    private String color;
    public Rose(String color) {
        this.color=color;
        System.out.println("Rose is created..."+this);
    }
    void flowering() {
        System.out.println(color+"Rose is flowering...."+this);
    }
}