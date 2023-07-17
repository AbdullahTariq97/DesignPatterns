package com.sky.designpatterns.strategy;

public class DownstreamClient {

    private final RequestStrategy requestStrategy;

    public DownstreamClient(RequestStrategy requestStrategy){
        this.requestStrategy = requestStrategy;
    }

    public void makeRequest(){
        System.out.println(requestStrategy.createRequest());
        System.out.println(requestStrategy.getAndProcessResponse());
    }
}
