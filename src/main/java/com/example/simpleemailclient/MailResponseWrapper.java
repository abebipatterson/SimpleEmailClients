package com.example.simpleemailclient;

import lombok.Data;

@Data
public class MailResponseWrapper {
    private int responseCode;
    private String responseMessage;
}
