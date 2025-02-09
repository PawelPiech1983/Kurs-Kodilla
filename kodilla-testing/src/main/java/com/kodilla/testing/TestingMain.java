package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("6.2 Testowanie kalkulatora");
        Calculator calculator = new Calculator();
        double numberA = 25;
        double numberB = 50;
        if (calculator.calculateAddition(numberA, numberB) == numberA + numberB) {
            System.out.println("Dodawanie kalkulatora przeszło pozytywny test");
        }
        else {
            System.out.println("Dodawanie kalkulatora nie przeszło pozytywnie testu");
        }
        if (calculator.calculateSubtraction(numberA, numberB) == numberA + numberB) {
            System.out.println("Odejmowanie kalkulatora przeszło pozytywny test");
        }
        else {
            System.out.println("Odejmowanie kalkulatora nie przeszło pozytywnie testu");
        }
        if (calculator.calculateMultiplication(numberA, numberB) == numberA * numberB) {
            System.out.println("Mnożenie kalkulatora przeszło pozytywny test");
        }
        else {
            System.out.println("Mnożenie kalkulatora nie przeszło pozytywnie testu");
        }
        if (calculator.calculateDivision(numberA, numberB) == numberA / numberB) {
            System.out.println("Dzielenie kalkulatora przeszło pozytywny test");
        }
        else {
            System.out.println("Dzielenie kalkulatora nie przeszło pozytywnie testu");
        }

    }
}
