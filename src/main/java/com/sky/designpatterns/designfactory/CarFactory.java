package com.sky.designpatterns.designfactory;

public class CarFactory {
    // Since both types of class implement car interface they both have common super type Car.
    // Therefore one method can be used to handle both
    public Car getCar(String type){
        return switch(type){
            case "FERRARI" -> new Ferrari();
            case "PORSCHE" -> new Porsche();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}
