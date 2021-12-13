package com.example.simpleemailclient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Email {
@Id
@GeneratedValue
    private Long id;
    private String from;
    private String to;
    private String subject;
    private String message;
    private Date date=new Date();
}
