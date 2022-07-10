package com.scopic.javachallenge;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;

public class SquareTests {
    DecimalFormat df = new DecimalFormat("0.00");

    GeometricShape CreateSquare(float[] params) {
        try {
            return ShapeFactory.createShape("Square", params);
        } catch (Exception e) {
            return null;
        }
    }
    
    @Test
    void testSquareCreateObject() {

        Square sqr = new Square(5);

        assertThat(sqr, instanceOf(Square.class));
    }

    @Test
    void testSquareName() {

        Square sqr = new Square(5);

        assertThat(sqr, instanceOf(Square.class));
        assertEquals("Square", sqr.getName());
    }

    @Test
    void testSquareArea() {
        Square sqr = new Square(5);
        assertThat(sqr, instanceOf(Square.class));

        assertEquals(df.format(25.00), df.format(sqr.getArea()));
    }

    @Test
    void testSquarePerimiter() {
        Square sqr = new Square(5);
        assertThat(sqr, instanceOf(Square.class));
        assertEquals(df.format(20.00), df.format(sqr.getPerimeter()));
    }

    @Test
    void testSquareAngle() {
        Square sqr = new Square(5);
        assertThat(sqr, instanceOf(Square.class));
        assertEquals(360, sqr.getAngles());
    }

    @Test
    void testShapeFactorySquareCreateObject() {
        Square rec = (Square)CreateSquare(new float[] {5});
        assertThat(rec, instanceOf(Square.class));

        rec = (Square)CreateSquare(new float[] {5,4});
        assertNull(rec);
    }
}
