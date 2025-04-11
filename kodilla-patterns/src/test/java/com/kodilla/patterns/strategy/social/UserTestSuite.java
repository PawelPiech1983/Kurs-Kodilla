package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategy() {
        //Given
        User pawel = new Millenials("Pawel");
        User john = new YGeneration("John");
        User alice = new ZGeneration("Alice");

        //When
        String pawelStrategy = pawel.sharePost();
        System.out.println("Pawel strategy: " + pawelStrategy);
        String johnStrategy = john.sharePost();
        System.out.println("John strategy: " + johnStrategy);
        String aliceStrategy = alice.sharePost();
        System.out.println("Alice strategy: " + aliceStrategy);

        //Then
        assertEquals("Facebook", pawelStrategy);
        assertEquals("Twitter", johnStrategy);
        assertEquals("Snapchat", aliceStrategy);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User pawel = new Millenials("Pawel");

        //When
        String pawelStrategy = pawel.sharePost();
        System.out.println("Pawel strategy: " + pawelStrategy);
        pawel.setIndividualPrediction(new SnapchatPublisher());
        String pawelActualStrategy = pawel.sharePost();
        System.out.println("Pawel Actual strategy: " + pawelActualStrategy);

        //Then
        assertEquals("Snapchat", pawelActualStrategy);
    }
}
