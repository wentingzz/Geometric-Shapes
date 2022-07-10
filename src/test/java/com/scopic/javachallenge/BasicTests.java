package com.scopic.javachallenge;
import com.scopic.javachallenge.exceptions.*;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;

public class BasicTests {
    DecimalFormat df = new DecimalFormat("0.00");

    GeometricShape CreateCircle(float radius) {
        try {
            return ShapeFactory.createShape("Circle", new float[] { radius });
        } catch (Exception e) {
            return null;
        }
    }
    
    @Test
    void testCircleCreateObject() {

        Circle circle = new Circle(4);

        assertThat(circle, instanceOf(Circle.class));
    }

    @Test
    void testCircleName() {

        Circle circle = new Circle(4);

        assertThat(circle, instanceOf(Circle.class));
        assertEquals("Circle", circle.getName());
    }

    @Test
    void testCircleArea() {
        Circle circle = new Circle(4);
        assertThat(circle, instanceOf(Circle.class));

        assertEquals(df.format(50.24), df.format(circle.getArea()));
    }

    @Test
    void testCirclePerimiter() {
        Circle circle = new Circle(4);
        assertThat(circle, instanceOf(Circle.class));
        assertEquals(df.format(25.12), df.format(circle.getPerimeter()));
    }

    @Test
    void testShapeFactoryCircleCreateObject() {
        Circle circle = (Circle)CreateCircle(4);
        assertThat(circle, instanceOf(Circle.class));

        try {
            ShapeFactory.createShape("Triangle", new float[] {4,3,2});
            fail("should throw exception");
        } catch (Exception e){
            assertThat(e, instanceOf(UnsupportedShapeException.class));
        }
        
        try {
            ShapeFactory.createShape("Circle", new float[] {4,3,2});
            fail("should throw exception");
        } catch (Exception e){
            assertThat(e, instanceOf(WrongParamCountException.class));
        }
        
        
    }
}
