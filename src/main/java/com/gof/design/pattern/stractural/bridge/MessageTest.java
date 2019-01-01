package com.gof.design.pattern.stractural.bridge;

import org.junit.Test;

public class MessageTest {

@Test

    public void testMessage(){
    TextMessageSender textMessageSender = new TextMessageSender();
    Message textMessage = new TextMessage(textMessageSender);
    textMessage.send();

    EmailMessageSender emailMessageSender = new EmailMessageSender();
    Message emailMessage = new EmailMessage(textMessageSender);
    emailMessage.send();
 }
}
