package com.sky.designpatterns.designfactory;

public class Porsche implements Car {

    public Porsche(){

    }

    @Override
    public void showCarDetails() {
        System.out.println("name: Porsche911 manufacturer:Porsche top-speed:205km/h");
    }
}
