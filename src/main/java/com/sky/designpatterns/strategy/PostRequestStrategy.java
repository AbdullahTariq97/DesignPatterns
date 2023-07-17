package com.sky.designpatterns.strategy;

public class PostRequestStrategy implements RequestStrategy{
    @Override
    public String createRequest() {
        return "post request";
    }

    @Override
    public String getAndProcessResponse() {
        return "post request response";
    }
}
