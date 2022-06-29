// /////////////////////////////////////////////////////////////////////////////
// PLEASE DO NOT RENAME OR REMOVE ANY OF THE CODE BELOW. 
// THE INTERFACE FOR THIS FILE SHOULD NOT BE CHANGED 
// YOU CAN ADD YOUR CODE TO THIS FILE TO EXTEND THE FEATURES TO USE THEM IN YOUR WORK.
// /////////////////////////////////////////////////////////////////////////////

package com.scopic.javachallenge;

import com.scopic.javachallenge.exceptions.*;

public class ShapeFactory {

    private ShapeFactory() {
        throw new IllegalStateException("Utility class");
    }

    public static GeometricShape createShape(String shape, float[] params) throws WrongParamCountException,UnsupportedShapeException{
        // TODO
        switch (shape) {
            case "Circle": 
                if (params.length == 1){
                    return new Circle(params[0]);
                }else{
                    throw new WrongParamCountException("Circle only needs a single parameter");
                }
            case "Rectangle": 
                if (params.length == 2){
                    return new Rectangle(params[0], params[1]);
                }else{
                    throw new WrongParamCountException("Rectangle needs two parameters");
                }
            case "Square":
                if (params.length == 1){
                    return new Square(params[0]);
                }else{
                    throw new WrongParamCountException("Square only needs a single parameter");
                }
            default: 
                throw new UnsupportedShapeException(shape + " is not a supported shape.");
        }
    }
}
