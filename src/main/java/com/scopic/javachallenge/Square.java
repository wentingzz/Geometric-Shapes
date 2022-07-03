// /////////////////////////////////////////////////////////////////////////////
// WORKING AREA
// THIS IS AN AREA WHERE YOU SHOULD WRITE YOUR CODE AND MAKE CHANGES
// /////////////////////////////////////////////////////////////////////////////

package com.scopic.javachallenge;
public class Square extends Rectangle{
    private float x;
    public Square(float x){
        super(x,x);
    }
    @Override
    public String getName() {
        return "Square";
    }
}