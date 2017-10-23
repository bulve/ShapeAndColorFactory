package com.company.Factories;

import com.company.Color.Color;
import com.company.Shape.Circle;
import com.company.Shape.Rectangle;
import com.company.Shape.Shape;
import com.company.Shape.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else {
            return null;
        }
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
