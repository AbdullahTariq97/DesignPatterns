package com.sky.designpatterns.state;

public interface PackageState {

    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();
}
