package com.alevel.beans;

import java.util.List;

public class BeanContainer {
    private List<BeanExample> beanExamples;

    public BeanContainer(List<BeanExample> beanExamples) {
        this.beanExamples = beanExamples;
    }

    public void info() {
        for (BeanExample beanExample : beanExamples) {
            beanExample.info();
        }
    }
}
