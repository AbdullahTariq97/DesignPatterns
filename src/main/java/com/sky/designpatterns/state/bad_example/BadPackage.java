package com.sky.designpatterns.state.bad_example;

public class BadPackage {

    // You will need to add conditionals inside each method. It will bloat your code
    public void printStatus(String status) {
        switch (status){
            case "ordered":
                System.out.println("The package has been order by the buyer");
            case "delivered" :
                System.out.println("The package has been delivered to the post office");
                break;
            case "received":
                System.out.println("The package has been received by the buyer");
                break;
            default: throw new RuntimeException();
        }
    }
}
