package com.sky.designpatterns.strategy;

public class GetRequestStrategy implements RequestStrategy{
    @Override
    public String createRequest() {
        return "get request";
    }

    @Override
    public String getAndProcessResponse() {
        return "get request response";
    }
}
