package com.sky.designpatterns.adapter.example2;

public class DeviceAdaptor implements Phone {

    @Override
    public File downloadFileUsingInternet(String fileName) {
        Computer computer = new Computer();
        return computer.downloadFileUsingChrome(fileName);
    }
}
