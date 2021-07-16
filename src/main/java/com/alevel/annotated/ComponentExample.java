package com.alevel.annotated;

import org.springframework.stereotype.Component;

@Component
public class ComponentExample {
    public ComponentExample() {
        System.out.println(this.getClass().getSimpleName() + " is created!!!");
    }
}
