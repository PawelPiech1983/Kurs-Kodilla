package com.kodilla.spring.intro.shape;

public class Circle implements Shape {

    @Override
    public String draw() {
        System.out.println("This is Circle");
        return "This is Circle";
    }
}
