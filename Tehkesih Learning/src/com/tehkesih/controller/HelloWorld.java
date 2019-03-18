package com.tehkesih.controller;


import com.tehkesih.model.Message;
import com.tehkesih.service.MessageService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named @RequestScoped
public class HelloWorld {

    private Message message = new Message();
    private List<Message> messages;

    @Inject
    private MessageService messageService;

    @PostConstruct
    public void init(){
        messages = messageService.list();
    }

    public void submit() {
        messageService.create(message);
        messages.add(message);
    }

    public Message getMessage(){
        return message;
    }

    public List<Message> getMessages(){
        return messages;
    }
}
