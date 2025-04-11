package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    private static Logger newLog;

    @BeforeAll
    public static void setUp() {
        newLog = new Logger();
        newLog.log("Hello World");
    }

    @Test
    void TestGetLastLog() {
        //Given


        //When
        String log = newLog.getLastLog();
        System.out.println("My log: " + log);

        //Then
        assertEquals("Hello World", log);
    }


}
