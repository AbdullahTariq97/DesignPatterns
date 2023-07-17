package com.sky.designpatterns.state;

import com.sky.designpatterns.state.bad_example.BadPackage;

/**
 * You have a class which can have several states
 * You create classes for each of those states implement a state interface
 * You initial class starts out with a particular state
 * The class delegates' behaviour to the state class
 * You also pass an instance of the intial class itself to the state class using "this" keyword so that it can change its state
 * Once you reach a particular stage there can only be another logical state, which is set by the first state in your initial class
 *
 *
 * Single Responsibility Principle. Organize the code related to particular states into separate classes.
 *  Open/Closed Principle. Introduce new states without changing existing state classes or the context.
 *
 * */

public class RunnerClass {
    public static void main(String[] args) {

//        Bad example
        BadPackage badParcel = new BadPackage();
        badParcel.printStatus("delivered");

//        Good example
        Package parcel = new Package();
        parcel.printStatus();

        parcel.nextState();
        parcel.printStatus();

        parcel.nextState();
        parcel.printStatus();
    }
}
