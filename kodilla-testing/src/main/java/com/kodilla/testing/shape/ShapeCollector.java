package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private Shape shape;
    private List<Shape> shapeCollection = new ArrayList<>();

    public void addFigure(Shape shape) {

        shapeCollection.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapeCollection.contains(shape)) {
            shapeCollection.remove(shape);
            result = true;
        }
        return result;
    }

    public int getSize() {

        return shapeCollection.size();
    }

    public List<Shape> showFigures() {
        return shapeCollection;
    }
}
