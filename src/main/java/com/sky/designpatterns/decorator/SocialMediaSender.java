package com.sky.designpatterns.decorator;

/**
 * Motivation: The decorator pattern is used to add more functionality to the processing of your request by wrapping an object inside decorators
 * The alternative to decorator pattern would be to extend a class and add more methods to add functionality. However, this would lead to a class explosion
 * Using the decorator pattern the decorator can process the arguments to a method or preprocess the response from a wrapped object before returning it to the client
 * You can pick and choose which and how many layer you wrap the object in order to add or remove functionality you need
 * The pattern adheres to open close principle, it order to add new functionality you don't need to change code inside class, just need to wrap it inside a decorator
 *
 * How to implement? create an interface representing the thing you want to add more functionality to. Then have a class implementing that interface,
 * this class will represent the center most object that will be decorated with decorators. Then create several class that implement the same inteface
 * these classes should represent the extra functionality or processing you will add to the method. They are the decorators. Most importantly, the decorator
 * classes have a "has a" or composition relationship to themselves. They will accept a type of the interface they implemented through a constructor and a instance variable
 * Then to add more functionality you just keep wrapping decorators over each others. They in turn delegate to the decorator they are wrapping
 *
 * examples - in em fire and forget class there is a kafka sender instance. It implements the interface kafka sender.
 * The inner most object is simple kafka sender and the decorators are failover kafka sender, kafka metrics decoratorn and graceful shutdown which enchance the functionality of the simple kafka sender
 * in mvpdb there is an interface Executor. It is implemented by downstream executor which is the inner most object. It is decorated with other executors such as resiliece4j executor, cache executor
 **/
public class SocialMediaSender implements Sender {

    private Sender sender;

    public SocialMediaSender(Sender sender) {
        this.sender = sender;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("The message " + message + " has been sent to your social media");
        // delegates work to the sender object its wrapping
        sender.sendMessage(message);
    }
}
