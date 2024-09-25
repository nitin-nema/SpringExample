package com.example.SpringExample.difference;

//public class SpringConfigClassExample {
//
//}

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig{
    @Bean
    public Service service(){
        return new Service();
    }

    @Bean
    public  Consumer consumer(){
        return new Consumer(service());
    }
}