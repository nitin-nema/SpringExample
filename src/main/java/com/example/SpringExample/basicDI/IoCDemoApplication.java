package com.example.SpringExample.basicDI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IoCDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(IoCDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ApplicationContext context = SpringApplication.run(IoCDemoApplication.class, args);
        GreetingService greetingService = context.getBean(GreetingService.class);
        System.out.println(greetingService.greet("Alice"));
    }
}
