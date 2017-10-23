package com.company.Factories;

import com.company.Color.Blue;
import com.company.Color.Color;
import com.company.Color.Green;
import com.company.Color.Red;
import com.company.Shape.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }else {
            return null;
        }
    }
}
