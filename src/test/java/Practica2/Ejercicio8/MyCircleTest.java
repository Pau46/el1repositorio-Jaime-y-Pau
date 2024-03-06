package Practica2.Ejercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @Test
    void getCenter() {
        MyPoint center = new MyPoint(3, 4);
        MyCircle circle = new MyCircle(center, 5);
        assertEquals(center, circle.getCenter());
    }

    @Test
    void setCenter() {
        MyPoint center = new MyPoint(3, 4);
        MyPoint newCenter = new MyPoint(5, 6);
        MyCircle circle = new MyCircle(center, 5);
        circle.setCenter(newCenter);
        assertEquals(newCenter, circle.getCenter());
    }

    @Test
    void getCenterX() {
        MyPoint center = new MyPoint(3, 4);
        MyCircle circle = new MyCircle(center, 5);
        assertEquals(3, circle.getCenterX());
    }

    @Test
    void setCenterX() {
        MyPoint center = new MyPoint(3, 4);
        MyCircle circle = new MyCircle(center, 5);
        circle.setCenterX(6);
        assertEquals(6, circle.getCenterX());
    }

    @Test
    void getCenterY() {
        MyPoint center = new MyPoint(3, 4);
        MyCircle circle = new MyCircle(center, 5);
        assertEquals(4, circle.getCenterY());
    }

    @Test
    void setCenterY() {
        MyPoint center = new MyPoint(3, 4);
        MyCircle circle = new MyCircle(center, 5);
        circle.setCenterY(7);
        assertEquals(7, circle.getCenterY());
    }

    @Test
    void getCenterXY() {
        MyPoint center = new MyPoint(3, 4);
        MyCircle circle = new MyCircle(center, 5);
        assertArrayEquals(new int[]{3, 4}, circle.getCenterXY());
    }

    @Test
    void setCenterXY() {
        MyPoint center = new MyPoint(3, 4);
        MyCircle circle = new MyCircle(center, 5);
        circle.setCenterXY(6, 7);
        assertArrayEquals(new int[]{6, 7}, circle.getCenterXY());
    }

    @Test
    void getRadius() {
        MyPoint center = new MyPoint(3, 4);
        MyCircle circle = new MyCircle(center, 5);
        assertEquals(5, circle.getRadius());
    }

    @Test
    void setRadius() {
        MyPoint center = new MyPoint(3, 4);
        MyCircle circle = new MyCircle(center, 5);
        circle.setRadius(6);
        assertEquals(6, circle.getRadius());
    }

    @Test
    void getArea() {
        MyPoint center = new MyPoint(3, 4);
        MyCircle circle = new MyCircle(center, 5);
        assertEquals(78.53981633974483, circle.getArea());
    }

    @Test
    void getCircumference() {
        MyPoint center = new MyPoint(3, 4);
        MyCircle circle = new MyCircle(center, 5);
        assertEquals(31.41592653589793, circle.getCircumference());
    }

    @Test
    void distance() {
        MyPoint center1 = new MyPoint(1, 2);
        MyPoint center2 = new MyPoint(4, 6);
        MyCircle circle1 = new MyCircle(center1, 5);
        MyCircle circle2 = new MyCircle(center2, 6);
        assertEquals(0.0, circle1.distance(circle2));
    }
    @Test
    void constructorWithCoordinatesAndRadius() {
        MyCircle circle = new MyCircle(3, 4, 5);
        assertEquals(3, circle.getCenterX());
        assertEquals(4, circle.getCenterY());
        assertEquals(5, circle.getRadius());
    }
}
