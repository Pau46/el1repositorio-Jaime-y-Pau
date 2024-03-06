package Practica1.Ejercicio9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(1.1f, ball.getX());
    }

    @Test
    void setX() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.setX(80.0f);
        assertEquals(80.0f, ball.getX());
    }

    @Test
    void getY() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(2.2f, ball.getY());
    }

    @Test
    void setY() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.setY(35.0f);
        assertEquals(35.0f, ball.getY());
    }

    @Test
    void getRadius() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(10, ball.getRadius());
    }

    @Test
    void setRadius() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.setRadius(5);
        assertEquals(5, ball.getRadius());
    }

    @Test
    void getXDelta() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(3.3f, ball.getXDelta());
    }

    @Test
    void setXDelta() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.setXDelta(4.0f);
        assertEquals(4.0f, ball.getXDelta());
    }

    @Test
    void getYDelta() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(4.4f, ball.getYDelta());
    }

    @Test
    void setYDelta() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.setYDelta(6.0f);
        assertEquals(6.0f, ball.getYDelta());
    }

    @Test
    void move() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.move();
        assertEquals(4.4f, ball.getX());
        assertEquals(6.6000004f, ball.getY());
    }

    @Test
    void reflectHorizontal() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.reflectHorizontal();
        assertEquals(-3.3f, ball.getXDelta());
    }

    @Test
    void reflectVertical() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.reflectVertical();
        assertEquals(-4.4f, ball.getYDelta());
    }

    @Test
    void testToString() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals("Ball[(1,1,2,2),speed=(3,3,4,4)]", ball.toString());
    }
}