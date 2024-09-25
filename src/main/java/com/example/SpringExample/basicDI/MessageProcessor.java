package com.example.SpringExample.basicDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageProcessor {
    private final MessageService messageService;

    @Autowired
    public MessageProcessor(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String recipient) {
        System.out.println(messageService.sendMessage(message, recipient));
    }
}
