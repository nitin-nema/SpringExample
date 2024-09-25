package com.example.SpringExample.basicDI;


@Component
public class MessageProcessorSetter {
    private MessageService messageService;

    @Autowired
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String recipient) {
        System.out.println(messageService.sendMessage(message, recipient));
    }
}
