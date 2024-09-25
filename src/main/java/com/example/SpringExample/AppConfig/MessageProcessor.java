package com.example.SpringExample.AppConfig;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageProcessor {
    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    @Autowired
    public void processMessage(String message, String recipient) {
        System.out.println(messageService.sendMessage(message, recipient));
    }
}
