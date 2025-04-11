package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING_TASK = "Driving";
    public static final String SHOPPING_TASK = "Shopping";
    public static final String PAINTING_TASK = "Painting";

    public final Task createTask(final String taskType) {
        return switch (taskType) {
            case DRIVING_TASK -> new DrivingTask("Driving task", "Ohio", "Rented car");
            case SHOPPING_TASK -> new ShoppingTask("Shopping task", "Shopping city center", 2);
            case PAINTING_TASK -> new PaintingTask("Painting task", "white", "Classroom");
            default -> null;
        };
    }
}
