package com.example.SpringExample.basicDI;

@Component
public class MessageProcessor {
    private final MessageService messageService;
    private final AppConfig appConfig;

    @Autowired
    public MessageProcessor(MessageService messageService, AppConfig appConfig) {
        this.messageService = messageService;
        this.appConfig = appConfig;
    }

    public void processMessage(String message) {
        System.out.println(messageService.sendMessage(message, appConfig.getDefaultRecipient()));
    }
}
