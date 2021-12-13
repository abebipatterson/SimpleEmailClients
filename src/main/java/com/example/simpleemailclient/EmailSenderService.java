package com.example.simpleemailclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender mailSender;

    public MailResponseWrapper sendSimpleEmail(String toEmail,String body,String subject){


//        SimpleMailMessage message = new SimpleMailMessage();
//
//        message.setTo(toEmail);
//        message.setText(body);
//        message.setSubject(subject);
//
//        mailSender.send(message);
//
//        System.out.println("mail sent");
MailResponseWrapper mailResponseWrapper=new MailResponseWrapper();
        //============================By nelson
        try{
            SimpleMailMessage message = new SimpleMailMessage();

            message.setTo(toEmail);
            message.setText(body);
            message.setSubject(subject);

            mailSender.send(message);

            System.out.println("mail sent");
            mailResponseWrapper.setResponseCode(200);
            mailResponseWrapper.setResponseMessage("Email Sent Successful");
        }
        catch (Exception ex){
            ex.printStackTrace();
            mailResponseWrapper.setResponseCode(400);
            mailResponseWrapper.setResponseMessage("Email NOT sent. "+ex.getMessage());
        }

        return mailResponseWrapper;
    }
}
