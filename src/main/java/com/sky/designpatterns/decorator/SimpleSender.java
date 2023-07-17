package com.sky.designpatterns.decorator;

public class SimpleSender implements Sender{

    @Override
    public void sendMessage(String message) {
        System.out.println("The message " + message + " has been sent using simple sender");
    }
}
