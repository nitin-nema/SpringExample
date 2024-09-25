package com.example.SpringExample.basicDI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageProcessorQualifiers {
    private final MessageService messageService;

    @Autowired
    public MessageProcessor(@Qualifier("smsService") MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String recipient) {
        System.out.println(messageService.sendMessage(message, recipient));
    }
}
