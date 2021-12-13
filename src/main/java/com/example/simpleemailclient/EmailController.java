package com.example.simpleemailclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    private EmailSenderService emailSenderService;

    @GetMapping("/email/send/{to}/{subject}")
    public ResponseEntity<MailResponseWrapper> sendMail(@PathVariable String to,@PathVariable String subject){
MailResponseWrapper mailResponseWrapper= emailSenderService.sendSimpleEmail(to,"RE :MONEYPAL TRANSACTION",subject);
    return ResponseEntity.ok().body(mailResponseWrapper);
    }

}
