package com.kodilla.spring.reader;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ReaderTestSuite {

    @Test
    void testRead() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        Reader reader = context.getBean(Reader.class);

        //When & Then
        reader.read();
    }

    @Test
    void testConditoral() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);

        //When
        boolean book2Exists = context.containsBean("book2");

        //Then
        System.out.println("book2 was found in container: " + book2Exists);

    }
}
