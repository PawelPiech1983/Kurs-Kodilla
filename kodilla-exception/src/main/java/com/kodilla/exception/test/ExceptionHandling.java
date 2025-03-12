package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(0, 5);
        }
        catch(ExceptionHandling e) {
            System.out.println("ExceptionHandling");
        }
        finally {
            System.out.println("Finally! I will throw an exception");
        }
    }
}
