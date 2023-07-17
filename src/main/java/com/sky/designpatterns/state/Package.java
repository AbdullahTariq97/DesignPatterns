package com.sky.designpatterns.state;

public class Package {

    private PackageState packageState = new OrderedState();

    // getter, setter

    public void previousState() {
        packageState.prev(this);
    }

    public void nextState() {
        packageState.next(this);
    }

    public void printStatus() {
        packageState.printStatus();
    }

    public void setState(PackageState packageState) {
        this.packageState = packageState;
    }
}
