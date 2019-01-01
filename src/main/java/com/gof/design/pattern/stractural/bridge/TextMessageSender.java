package com.gof.design.pattern.stractural.bridge;

public class TextMessageSender implements MessageSender {

    @Override
    public void sendMessage() {
        System.out.println("Sending Text Message");
    }

}
