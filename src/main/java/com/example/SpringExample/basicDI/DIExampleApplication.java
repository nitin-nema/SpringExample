package com.example.SpringExample.basicDI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DIExampleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DIExampleApplication.class, args);
    }

    @Override
    public void run(String... args) {
        ApplicationContext context = SpringApplication.run(DIExampleApplication.class, args);
        MessageProcessor processor = context.getBean(MessageProcessor.class);
        processor.processMessage("Hello, Dependency Injection!", "john.doe@example.com");
    }
}
