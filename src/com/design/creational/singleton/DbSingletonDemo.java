package com.design.creational.singleton;

public class DbSingletonDemo {
    public static void main(String[] args) {

        DbSingleton instance = DbSingleton.getInstance();

        DbSingleton test = DbSingleton.getInstance();

        System.out.println(instance + "\n" + test);
    }
}
