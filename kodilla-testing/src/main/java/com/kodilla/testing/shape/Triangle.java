package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String shapeName = "Triangle";
    private String field = "0.5*a*h";
    private double sideA;
    private double height;

    public Triangle(double sideA, double height) {
        this.sideA = sideA;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;
        return Double.compare(sideA, triangle.sideA) == 0 && Double.compare(height, triangle.height) == 0 && shapeName.equals(triangle.shapeName) && field.equals(triangle.field);
    }

    @Override
    public int hashCode() {
        int result = shapeName.hashCode();
        result = 31 * result + field.hashCode();
        result = 31 * result + Double.hashCode(sideA);
        result = 31 * result + Double.hashCode(height);
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
