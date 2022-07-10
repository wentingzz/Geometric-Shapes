package com.scopic.javachallenge;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;

public class RecTests {
    DecimalFormat df = new DecimalFormat("0.00");

    GeometricShape CreateRec(float[] params) {
        try {
            return ShapeFactory.createShape("Rectangle", params);
        } catch (Exception e) {
            return null;
        }
    }
    
    @Test
    void testRecCreateObject() {

        Rectangle rec = new Rectangle(3,5);

        assertThat(rec, instanceOf(Rectangle.class));
    }

    @Test
    void testRecName() {

        Rectangle rec = new Rectangle(3,5);

        assertThat(rec, instanceOf(Rectangle.class));
        assertEquals("Rectangle", rec.getName());
    }

    @Test
    void testRecArea() {
        Rectangle rec = new Rectangle(3,5);
        assertThat(rec, instanceOf(Rectangle.class));

        assertEquals(df.format(15.00), df.format(rec.getArea()));
    }

    @Test
    void testRecPerimiter() {
        Rectangle rec = new Rectangle(3,5);
        assertThat(rec, instanceOf(Rectangle.class));
        assertEquals(df.format(16.00), df.format(rec.getPerimeter()));
    }

    @Test
    void testRecAngle() {
        Rectangle rec = new Rectangle(3,5);
        assertThat(rec, instanceOf(Rectangle.class));
        assertEquals(360, rec.getAngles());
    }

    @Test
    void testShapeFactoryRecCreateObject() {
        Rectangle rec = (Rectangle)CreateRec(new float[] {5,4});
        assertThat(rec, instanceOf(Rectangle.class));

        rec = (Rectangle)CreateRec(new float[] {5});
        assertNull(rec);
    }
}
