package com.fjcorona.java8.DefaultMethod;

public class DefaultMethodApp implements PersonA, PersonB {

    @Override
    public void walk() {
        System.out.println("I'm Person A... I'm walking.");
    }

    @Override
    public void sleep() {
        System.out.println("PersonB is sleeping now.");
    }

    @Override
    public void talk() {
        /*
         * Since we have two interfaces which have default methods
         * With the exactly same name. It's necessary to indicate which one
         * Will be implemented.
         * If we don't want to indicate either of the two, it's possible
         * to overwrite the logic.
         */
        PersonA.super.talk();
        // PersonB.super.talk();
    }

    public static void main (String[] args) {
        DefaultMethodApp app = new DefaultMethodApp();

        app.walk();
        app.talk();
        app.eat();
        app.sing();
        app.sleep();
    }
}
