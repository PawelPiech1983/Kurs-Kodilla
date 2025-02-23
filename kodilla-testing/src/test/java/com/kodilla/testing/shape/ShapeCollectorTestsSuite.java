package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("Modul 6.4 shape collectors test suite")
public class ShapeCollectorTestsSuite {
    private static int counter = 0;

    @BeforeAll
    public static void setUp() {
        System.out.println("Test begin.");
    }

    @BeforeEach
    public void setUpEach() {
        counter++;
        System.out.println("Begin test nr. #" + counter);
    }

    @AfterAll
    public static void endOfTests() {
        System.out.println("Test end.");
    }

    @Nested
    @DisplayName("Test for adding shape")
    class AddingShapeTests {

        @Test
        void testAddingShape() {
            //Given
            Circle circle = new Circle(1.2);
            ShapeCollector shapeArray = new ShapeCollector();

            //When
            shapeArray.addFigure(circle);

            //Then
            Assertions.assertEquals(1, shapeArray.getSize());

        }

    }

    @Nested
    @DisplayName("Tests for removing shape")
    class RemovingShapeTests {

        @Test
        void testRemovingNotExistingShape() {
            //Given
            Circle circle = new Circle(2.3);
            ShapeCollector shapeArray = new ShapeCollector();

            //When
            boolean result = shapeArray.removeFigure(circle);

            //Then
            Assertions.assertFalse(result);

        }

        @Test
        void testRemovingExistingShape() {
            //Given
            Circle circle = new Circle(5.7);
            ShapeCollector shapeArray = new ShapeCollector();
            shapeArray.addFigure(circle);

            //When
            boolean result = shapeArray.removeFigure(circle);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeArray.getSize());
        }
    }

    @Nested
    @DisplayName("Tests for getting ans showing figures")
    class GettingAndShowingFiguresTests {

        @Test
        void testShowingFigures() {
            //Given
            Circle circle = new Circle(5.7);
            Triangle triangle = new Triangle(5.7, 2.4);
            Square square = new Square(4.6);
            ShapeCollector shapeArray = new ShapeCollector();
            shapeArray.addFigure(circle);
            shapeArray.addFigure(triangle);
            shapeArray.addFigure(square);

            //When
            System.out.println(shapeArray.showFigures());

            //Then
        }
    }
}
