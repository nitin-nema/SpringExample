package com.example.SpringExample.basicDI;

@Service
public class SMSService implements MessageService {
    @Override
    public String sendMessage(String message, String recipient) {
        return "SMS sent to " + recipient + " with message: " + message;
    }
}
