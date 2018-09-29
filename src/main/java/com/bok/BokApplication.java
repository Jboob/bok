package com.bok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.bok.repository"})
public class BokApplication {

    public static void main(String[] args) {
        SpringApplication.run(BokApplication.class, args);
    }
}
