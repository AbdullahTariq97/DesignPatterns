package com.sky.designpatterns.decorator;

public class FailoverSender implements Sender {

    private final Sender sender;

    public FailoverSender(Sender sender){
        this.sender = sender;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("The message " + message + " has been sent using failover sender");
        // delegates work to the sender object its wrapping
        sender.sendMessage(message);
    }
}
