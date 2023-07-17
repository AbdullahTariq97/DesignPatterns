package com.sky.designpatterns.strategy;

public interface RequestStrategy {

    String createRequest();

    String getAndProcessResponse();
}
