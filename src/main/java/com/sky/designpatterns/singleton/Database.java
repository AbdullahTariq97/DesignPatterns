package com.sky.designpatterns.singleton;

public class Database {

    // only one instance of database will be created that will be shared amoung all threads of the server
    private static Database database = new Database();

    // static method can work with static variables only
    public static Database getSingleton(){
        return database;
    }
}
