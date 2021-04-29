package com.fjcorona.java8.DefaultMethod;

public interface PersonB {

    void sleep();

    default void talk() {
        System.out.println("Hi, PersonB is talking to you.");
    }

    default void eat() {
        System.out.println("PersonB is eating now.");
    }
}
