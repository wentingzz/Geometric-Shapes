// /////////////////////////////////////////////////////////////////////////////
// IMPORTANT:
// THE CODE BELOW IS READ ONLY CODE AND YOU SHOULD INSPECT IT TO SEE WHAT IT
// DOES IN ORDER TO COMPLETE THE TASK, BUT DO NOT MODIFY IT IN ANY WAY AS THAT
// WILL RESULT IN A TEST FAILURE
// /////////////////////////////////////////////////////////////////////////////

package com.scopic.javachallenge;

public abstract class GeometricShape {
    protected static final float PI = 3.14f;

    public GeometricShape(){
        _._();
    }
    
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
