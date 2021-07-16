package com.alevel.beans;

public class BeanExample {

    public BeanExample() {
        System.out.println("BeanExample is created");
    }

    public void info() {
        System.out.println("Hello From BeanExample");
    }

    private void init() {
        System.out.println("Initialization");
    }

    private void finish() {
        System.out.println("The End");
    }
}
