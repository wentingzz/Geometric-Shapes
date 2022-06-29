// /////////////////////////////////////////////////////////////////////////////
// WORKING AREA
// THIS IS AN AREA WHERE YOU SHOULD WRITE YOUR CODE AND MAKE CHANGES
// /////////////////////////////////////////////////////////////////////////////

package com.scopic.javachallenge;

public class Rectangle extends GeometricShape implements ShapeInterface, PolygonInterface{
    private float x;
    private float y;
    public Rectangle(float x, float y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String getName() {
        return "Rectangle";
    }

    public int getAngles(){
        return 360;
    }
    
    public float getPerimeter(){
        return 2 * (this.x + this.y);
    }
    public float getArea(){
        return this.x * this.y;
    }
}