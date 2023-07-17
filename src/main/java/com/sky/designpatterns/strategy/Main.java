package com.sky.designpatterns.strategy;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Motivation:
 * - use it to replace place if statement blocks which are implementation the same functionality but differently
 * - its becomes easy to add more types of implementations for the functionality. just need to implement the strategy interface.
 * - The client then "has a" strategy, which it delegates responsibility to
 * - you don't need to open the class up and add more code inside to enhance its functionality, you pass in functionality through the strategy object (change behaviour at runtime not compile time)
 * - using this makes you adhere to the open close principle. The classes are closed to code modification but open to extension
 *
 *
 * Example https://github.com/sky-uk/entitlements-manager/blob/147e7a0cb651261ef88e44186fce91278c981051/entitlements-manager/src/main/java/uk/sky/commerce/entitlements/manager/web/resources/DelegatingEntitlementsHandler.java#L45
 * https://github.com/sky-uk/mvpd-bridge/blob/ae5921db280e5fef68b96586fc6b00fd322898f7/service/src/main/java/uk/sky/ovp/mvpdb/service/service/strategy/HandlingStrategy.java#L6
 */
public class Main {
    public static void main(String[] args) {

        // Bad Example
        StrategyBadExample strategyBadExample = new StrategyBadExample();
        System.out.println(strategyBadExample.fly("fast"));
        System.out.println(strategyBadExample.fly("medium"));
        System.out.println(strategyBadExample.fly("slow"));



        // Good Example
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the type of request you would like to make (G - get , P - post)");
//        String next = scanner.next();
//
//        try {
//
//            RequestStrategy requestStrategy = switch (next) {
//                case "G" -> new GetRequestStrategy();
//                case "P" -> new PostRequestStrategy();
//                default -> throw new Exception("This is not an excepted request. P or G allowed. try again");
//            };
//            DownstreamClient  client = new DownstreamClient(requestStrategy);
//            client.makeRequest();
//
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//            main(null);
//        }

    }

}
