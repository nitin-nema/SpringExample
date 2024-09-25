package com.example.SpringExample.difference;

//public class IOCExample {
//}

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
public Service{
    public void serve(){
        System.out.println("service been called");
    }
}

@Component
class Consumer{
    private final Service service;

    @Autowired
    public Consumer(Service service){
        this.service =service;
    }

    public void doSomething(){
        // put additonal thngs
    }

}

