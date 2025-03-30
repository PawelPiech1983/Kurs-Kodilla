package com.kodilla.spring.libraryWithoutAutowired;

import com.kodilla.spring.libraryWithoutAutowired.Library;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class LibraryWithoutAutowiredTestSuite {

    @Autowired
    private Library library;

    @Test
    public void testLoadFromDb() {
        //Given
        //When
        library.loadFromDb();
        //Then
        //do nothing
    }

    @Test
    public void testSaveToDb() {
        //Given
        //When
        library.saveToDb();
        //Then
        //do nothing
    }

    //Module 13.3
    @Test
    void testContext() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        //When+then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }
}
