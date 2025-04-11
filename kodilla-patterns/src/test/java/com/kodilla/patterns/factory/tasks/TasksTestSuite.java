package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TasksTestSuite {

    @Test
    void shoppingTaskTest() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.createTask(TaskFactory.SHOPPING_TASK);

        //Then
        assertEquals("Shopping task", shoppingTask.getName());
    }
    @Test
    void drivingTaskTest() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.createTask(TaskFactory.DRIVING_TASK);

        //Then
        assertEquals("Driving task", drivingTask.getName());
    }
    @Test
    void paintingTaskTest() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingTask = factory.createTask(TaskFactory.PAINTING_TASK);

        //Then
        assertEquals("Painting task", paintingTask.getName());
    }
}
