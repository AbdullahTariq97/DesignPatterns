package com.sky.designpatterns.decorator;

public class KafkaSender {
    public static void main(String[] args) {

        Sender sender1 = new FailoverSender(new SimpleSender());
        sender1.sendMessage("I will be late to work");

        System.out.println("\n\n");
        Sender sender2 = new SocialMediaSender(new FailoverSender(new SimpleSender()));
        sender2.sendMessage("I will not come to work tommorow");
    }
}
