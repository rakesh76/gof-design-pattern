package com.gof.design.pattern.stractural.bridge;

public class TextMessage extends  Message{

    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        System.out.println("Sending Text Message");

    }
}
