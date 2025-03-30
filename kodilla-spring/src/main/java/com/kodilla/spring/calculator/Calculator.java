package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private double numberA;
    private double numberB;

    @Autowired
    private Display display;

    public void add(double numberA, double numberB) {
        double result = numberA + numberB;
        display.displayValue(result);
    }

    public void sub(double numberA, double numberB) {
        double result = numberA - numberB;
        display.displayValue(result);
    }

    public void mul(double numberA, double numberB) {
        double result = numberA * numberB;
        display.displayValue(result);
    }

    public void div(double numberA, double numberB) {
        double result = numberA / numberB;
        display.displayValue(result);
    }
}
