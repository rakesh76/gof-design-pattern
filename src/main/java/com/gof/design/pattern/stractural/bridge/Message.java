package com.gof.design.pattern.stractural.bridge;

public abstract class Message {
    private MessageSender messageSender;

    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    abstract public void send();
}
