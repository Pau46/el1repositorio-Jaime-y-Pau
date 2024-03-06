package Practica1.Ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    void testGetLength() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);
        assertEquals(5.0f, rectangle.getLength());
    }

    @Test
    void testSetLength() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(7.0f);
        assertEquals(7.0f, rectangle.getLength());
    }

    @Test
    void testGetWidth() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);
        assertEquals(3.0f, rectangle.getWidth());
    }

    @Test
    void testSetWidth() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(4.0f);
        assertEquals(4.0f, rectangle.getWidth());
    }

    @Test
    void testGetArea() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);
        assertEquals(15.0f, rectangle.getArea());
    }

    @Test
    void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);
        assertEquals(16.0f, rectangle.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);
        assertEquals("Rectangle[length=5.0, width=3.0]", rectangle.toString());
    }
}
