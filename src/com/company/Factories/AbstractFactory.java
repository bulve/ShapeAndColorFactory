package com.company.Factories;

import com.company.Color.Color;
import com.company.Shape.Shape;

public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);

}
