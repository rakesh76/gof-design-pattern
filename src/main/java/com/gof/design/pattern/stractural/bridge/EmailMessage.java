package com.gof.design.pattern.stractural.bridge;

public class EmailMessage extends Message {

    public EmailMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        System.out.println("Send Email Message");
    }
}
