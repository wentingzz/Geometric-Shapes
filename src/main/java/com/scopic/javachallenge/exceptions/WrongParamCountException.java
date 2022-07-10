// /////////////////////////////////////////////////////////////////////////////
// WORKING AREA
// THIS IS AN AREA WHERE YOU SHOULD WRITE YOUR CODE AND MAKE CHANGES
// /////////////////////////////////////////////////////////////////////////////

package com.scopic.javachallenge.exceptions;
public class WrongParamCountException extends Exception {
    public WrongParamCountException(String errorMsg){
        super(errorMsg);
    }
}