package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculator() {
        //Given
        //When
        calculator.add(3, 2);
        calculator.div(3, 2);
        calculator.sub(3, 2);
        calculator.mul(3, 2);
        //Then
    }
}
