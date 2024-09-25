package com.example.SpringExample.basicDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServiceLocator {
    private static ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    public static <T> T getService(Class<T> serviceClass) {
        return context.getBean(serviceClass);
    }
}

// main
public class IoCDemoApplication implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        GreetingService greetingService = ServiceLocator.getService(GreetingService.class);
        System.out.println(greetingService.greet("Bob"));
    }
}
