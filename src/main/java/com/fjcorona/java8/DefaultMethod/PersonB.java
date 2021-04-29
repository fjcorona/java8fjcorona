package com.fjcorona.java8.DefaultMethod;

public interface PersonB {

    public void sleep();

    default public void talk() {
        System.out.println("Hi, PersonB is talking to you.");
    }

    default public void eat() {
        System.out.println("PersonB is eating now.");
    }
}
