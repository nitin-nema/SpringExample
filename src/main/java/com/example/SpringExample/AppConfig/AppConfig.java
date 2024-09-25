package com.example.SpringExample.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {

    @Bean
    public MessageService messageService() {
        return new EmailService();
    }

    @Bean
    public MessageProcessor messageProcessor() {
        return new MessageProcessor(messageService());
    }
}
