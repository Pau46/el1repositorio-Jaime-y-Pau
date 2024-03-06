package Practica2.Ejercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void getX() {
        MyPoint point = new MyPoint(3, 4);
        assertEquals(3, point.getX());
    }

    @Test
    void setX() {
        MyPoint point = new MyPoint(3, 4);
        point.setX(5);
        assertEquals(5, point.getX());
    }

    @Test
    void getY() {
        MyPoint point = new MyPoint(3, 4);
        assertEquals(4, point.getY());
    }

    @Test
    void setY() {
        MyPoint point = new MyPoint(3, 4);
        point.setY(6);
        assertEquals(6, point.getY());
    }

    @Test
    void setXY() {
        MyPoint point = new MyPoint(3, 4);
        point.setXY(5, 6);
        assertArrayEquals(new int[]{5, 6}, point.getXY());
    }

    @Test
    void getXY() {
        MyPoint point = new MyPoint(3, 4);
        assertArrayEquals(new int[]{3, 4}, point.getXY());
    }

    @Test
    void distance() {
        MyPoint point1 = new MyPoint(3, 4);
        MyPoint point2 = new MyPoint(6, 8);
        assertEquals(5.0, point1.distance(point2));
    }

    @Test
    void testDistance() {
        MyPoint point = new MyPoint(3, 4);
        assertEquals(5.0, point.distance(6, 8));
    }

    @Test
    void testDistance1() {
        MyPoint point1 = new MyPoint(3, 4);
        assertEquals(5.0, point1.distance());
    }

    @Test
    void testToString() {
        MyPoint point = new MyPoint(3, 4);
        assertEquals("(3, 4)", point.toString());
    }

    @Test
    void testDefaultConstructor() {
        MyPoint point = new MyPoint();
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
    }
}