package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SettinngsFileEngineSingletonEnumTestSuite {

    private static SettingsFileEngineSingletonEnum settingsFileEngineSingletonEnum;

    @BeforeAll
    public static void openSettingsFile() {
        settingsFileEngineSingletonEnum = SettingsFileEngineSingletonEnum.INSTANCE;
        settingsFileEngineSingletonEnum.open("myapp.settings");
    }

    @AfterAll
    public static void closeSettingsFile() {
        settingsFileEngineSingletonEnum.close();
    }

    @Test
    void testGetFileName() {
        //Given
        //When
        String fileName = settingsFileEngineSingletonEnum.getFileName();
        System.out.println("Opened: " + fileName);
        //Then
        assertEquals("myapp.settings", fileName);
    }

    @Test
    void testLoadSettings() {
        //Given
        //When
        boolean result = settingsFileEngineSingletonEnum.loadSettings();
        //Then
        assertTrue(result);
    }

    @Test
    void testSaveSettings() {
        //Given
        //When
        boolean result = settingsFileEngineSingletonEnum.saveSettings();
        //Then
        assertTrue(result);
    }
}
