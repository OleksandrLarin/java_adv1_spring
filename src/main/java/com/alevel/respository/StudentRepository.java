package com.alevel.respository;

import org.springframework.stereotype.Component;

@Component
public class StudentRepository {
    public void createStudent() {
        System.out.println("Student is Created");
    }

    private void finish() {
        System.out.println("StudentRepository. The End");
    }
}
