package com.example.SpringExample.AppConfig;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService {
    @Override
    public String sendMessage(String message, String recipient) {
        return "Email sent to " + recipient + " with message: " + message;
    }
}
