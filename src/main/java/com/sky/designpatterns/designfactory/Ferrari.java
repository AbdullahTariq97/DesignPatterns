package com.sky.designpatterns.designfactory;

public class Ferrari implements Car {

    public Ferrari(){

    }

    @Override
    public void showCarDetails() {
        System.out.println("name: FerrariF1 manufacturer:Ferrari top-speed:322km/h");
    }
}
