package com.kodilla.exception.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestsSuite {

    public static String lineSeparator = "-------------------------------------------";
    @BeforeAll
    public static void textBeforeBeginningTesting() {
        System.out.println(lineSeparator);
        System.out.println("Second Challenge Tests Suite");
    }
    @AfterAll
    public static void textAfterTesting() {
        System.out.println("Second Challenge Tests Suite has ended.");
        System.out.println(lineSeparator);
    }

    @Test
    public void testSecondChallengeWithEdgeCases() throws ExceptionHandling {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertThrows(ExceptionHandling.class, () -> secondChallenge.probablyIWillThrowException(2.0, 1)),
                () -> assertThrows(ExceptionHandling.class, () -> secondChallenge.probablyIWillThrowException(0.999999, 1)),
                () -> assertThrows(ExceptionHandling.class, () -> secondChallenge.probablyIWillThrowException(1.5, 1.5)),
                () -> assertTrue(secondChallenge.probablyIWillThrowException(1, 0).equals("Done!"))
        );
    }
}
