package com.kodilla.testing.calculator;

public class Calculator {
    public double numberA;
    public double numberB;

    public double calculateAddition(double numberA, double numberB) {
        return this.numberA + this.numberB;
    }
    public double calculateSubtraction(double numberA, double numberB) {
        return numberA - numberB;
    }
    public double calculateMultiplication(double numberA, double numberB) {
        return numberA * numberB;
    }
    public double calculateDivision(double numberA, double numberB) {
        return numberA / numberB;
    }

}
