package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@DisplayName("CalculateAdvStatistics Tests Suite")
public class CalculateAdvStatisticsTestsSuite {


    private Statistics statisticsMock = Mockito.mock(Statistics.class);

    @DisplayName("Null posts Tests Suite")
    @Test
    void calculateAdvStatisticsWithNullPosts() {
        //Given
        List<String> usersNames;
        usersNames = usersNamesGenerator(100);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentCount()).thenReturn(100);
        CalculateStatistics calc = new CalculateStatistics(statisticsMock);

        //When
        double[] statistics = calc.calculateAdvStatistics(statisticsMock);
        System.out.println(statistics);
        // Then
        assertEquals(0.0, statistics[1]);

    }

    @DisplayName("1000 posts Tests Suite")
    @Test
    void calculateAdvStatisticsWith1000Posts() {
        //Given
        List<String> usersNames;
        usersNames = usersNamesGenerator(100);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentCount()).thenReturn(0);
        CalculateStatistics calc = new CalculateStatistics(statisticsMock);

        //When
        double[] statistics = calc.calculateAdvStatistics(statisticsMock);
        System.out.println(statistics);
        // Then
        assertEquals(10.0, statistics[3]);

    }

    @DisplayName("Null comments Tests Suite")
    @Test
    void calculateAdvStatisticsWithNullComments() {
        //Given
        List<String> usersNames;
        usersNames = usersNamesGenerator(100);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(100);
        when(statisticsMock.commentCount()).thenReturn(0);
        CalculateStatistics calc = new CalculateStatistics(statisticsMock);

        //When
        double[] statistics = calc.calculateAdvStatistics(statisticsMock);
        System.out.println(statistics);
        // Then
        assertEquals(0.0, statistics[2]);

    }

    @DisplayName("Comments more than Posts Tests Suite")
    @Test
    void calculateAdvStatisticsWithMoreCommentsThanPosts() {
        //Given
        List<String> usersNames;
        usersNames = usersNamesGenerator(100);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(100);
        when(statisticsMock.commentCount()).thenReturn(10000);
        CalculateStatistics calc = new CalculateStatistics(statisticsMock);

        //When
        double[] statistics = calc.calculateAdvStatistics(statisticsMock);
        System.out.println(statistics);
        // Then
        assertEquals(100.0, statistics[5]);

    }

    @DisplayName("Posts more than comments Tests Suite")
    @Test
    void calculateAdvStatisticsWithMorePostsThanComments() {
        //Given
        List<String> usersNames;
        usersNames = usersNamesGenerator(100);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(10000);
        when(statisticsMock.commentCount()).thenReturn(100);
        CalculateStatistics calc = new CalculateStatistics(statisticsMock);

        //When
        double[] statistics = calc.calculateAdvStatistics(statisticsMock);
        System.out.println(statistics);
        // Then
        assertEquals(0.01, statistics[5]);

    }

    @DisplayName("Null users Tests Suite")
    @Test
    void calculateAdvStatisticsWithNullUsers() {
        //Given
        List<String> usersNames = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentCount()).thenReturn(0);
        CalculateStatistics calc = new CalculateStatistics(statisticsMock);

        //When
        double[] statistics = calc.calculateAdvStatistics(statisticsMock);
        System.out.println(statistics);
        // Then
        assertEquals(0.0, statistics[0]);

    }

    @DisplayName("100 users Tests Suite")
    @Test
    void calculateAdvStatisticsWith100Users() {
        //Given
        List<String> usersNames;
        usersNames = usersNamesGenerator(100);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentCount()).thenReturn(0);
        CalculateStatistics calc = new CalculateStatistics(statisticsMock);

        //When
        double[] statistics = calc.calculateAdvStatistics(statisticsMock);
        System.out.println(statistics);
        // Then
        assertEquals(100.0, statistics[0]);

    }

    public List usersNamesGenerator(int number) {
        List usersNames = new ArrayList<>();
        for(int i=0; i<number; i++) {
            usersNames.add("User " + i);
        }
        return usersNames;
    }

}
