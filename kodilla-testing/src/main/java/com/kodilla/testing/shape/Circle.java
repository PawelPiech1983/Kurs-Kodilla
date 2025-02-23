package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName = "Circle";
    private String field = "3.14*r^2";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0 && shapeName.equals(circle.shapeName) && field.equals(circle.field);
    }

    @Override
    public int hashCode() {
        int result = shapeName.hashCode();
        result = 31 * result + field.hashCode();
        result = 31 * result + Double.hashCode(radius);
        return result;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public String getShapeField() {
        return field;
    }
}
