// /////////////////////////////////////////////////////////////////////////////
// WORKING AREA
// THIS IS AN AREA WHERE YOU SHOULD WRITE YOUR CODE AND MAKE CHANGES
// /////////////////////////////////////////////////////////////////////////////

package com.scopic.javachallenge;

public class Circle extends GeometricShape implements ShapeInterface{
    private float radius;
    public Circle(float radius){
        this.radius = (float)radius;
    }
    @Override
    public String getName() {
        return "Circle";
    }
    
    public float getPerimeter(){
        return 2 * super.PI * this.radius;
    }
    public float getArea(){
        return super.PI * this.radius * this.radius;
    }
}