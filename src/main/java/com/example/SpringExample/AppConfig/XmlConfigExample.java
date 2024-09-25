package com.example.SpringExample.AppConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MessageProcessor processor = context.getBean(MessageProcessor.class);
        processor.processMessage("Hello, XML Configuration!", "john.doe@example.com");
    }
}
