package com.gof.design.pattern.stractural.bridge;

public class EmailMessageSender implements MessageSender {

    @Override
    public void sendMessage() {
        System.out.println("Sending Email Message");
    }
}
