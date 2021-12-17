package com.sky.designpatterns.adapter.example2;

public class Computer {

    public File downloadFileUsingChrome(String fileName){
        return new File(fileName, "data for file " + fileName);
    }
}
