package com.example.pet_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetProjectApplication {
    int a;

    public static void main(String[] args) {
       SpringApplication.run(PetProjectApplication.class, args);
        System.out.println("Hello");
    }

}
