package com.udacity.jwdnd.c1.review;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Locale;


@Service
public class MessageService {
    String ms;
    public MessageService(String ms){
        System.out.println("In MessageService service");
        this.ms = ms;
    }

    public String uppercase(){
        return this.ms.toUpperCase();
    }

    public String lowercase(){
        return this.ms.toLowerCase();
    }

    @PostConstruct
    public void logging(){
        System.out.println("after constructing MessageService");
    }
}
