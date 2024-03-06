package Practica1.Ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class CircleTest {

    @Test
    void testGetRadius() {
        Circle circle = new Circle(5.0);
        assertEquals(5.0, circle.getRadius());
    }

    @Test
    void testSetRadius() {
        Circle circle = new Circle();
        circle.setRadius(3.0);
        assertEquals(3.0, circle.getRadius());
    }

    @Test
    void testGetArea() {
        Circle circle = new Circle(4.0);
        assertEquals(Math.PI * 4.0 * 4.0, circle.getArea());
    }

    @Test
    void testGetCircumference() {
        Circle circle = new Circle(6.0);
        assertEquals(2 * Math.PI * 6.0, circle.getCircumference());
    }

    @Test
    void testToString() {
        Circle circle = new Circle(2.5);
        assertEquals("Circle[radius=2.5]", circle.toString());
    }
}