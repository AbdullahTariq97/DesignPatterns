package com.sky.designpatterns.strategy;

public class StrategyBadExample {

    public String fly(String name){
        // All the branches of the if statement implement the same functionality for flying but have different implementations for it
        if(name.equals("fast")){
           return "fly using an aeroplace";
        } else if (name.equals("medium")){
            return "fly using helicopter";
        } else {
            return "fly using glider";
        }

//        To add more functionality I would need to do this
//        else if {
//            ...
//            ...
//            ...
//        }
    }
}
