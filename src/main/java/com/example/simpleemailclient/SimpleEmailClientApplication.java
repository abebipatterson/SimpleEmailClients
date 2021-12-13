package com.example.simpleemailclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SimpleEmailClientApplication {

    @Autowired
    private EmailSenderService emailSenderService;

    public static void main(String[] args) {
        SpringApplication.run(SimpleEmailClientApplication.class, args);
    }


//    @EventListener(ApplicationReadyEvent.class)
//    public void triggerMail(){
//    emailSenderService.sendSimpleEmail("lorineachieng357@gmail.com",
//            "This Email i'm not trying AGAIN!!!",
//            "Test Email Service");
//    }
}
