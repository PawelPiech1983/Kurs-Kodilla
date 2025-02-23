package com.kodilla.testing.shape;

public class Square implements Shape {
    private String shapeName = "Square";
    private String field = "a*a";
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;
        return Double.compare(side, square.side) == 0 && shapeName.equals(square.shapeName) && field.equals(square.field);
    }

    @Override
    public int hashCode() {
        int result = shapeName.hashCode();
        result = 31 * result + field.hashCode();
        result = 31 * result + Double.hashCode(side);
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
