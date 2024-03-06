package Practica2.Ejercicio7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    @Test
    void getBegin() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(4, 6);
        MyLine line = new MyLine(begin, end);
        assertEquals(begin, line.getBegin());
    }

    @Test
    void setBegin() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint newBegin = new MyPoint(3, 4);
        MyPoint end = new MyPoint(4, 6);
        MyLine line = new MyLine(begin, end);
        line.setBegin(newBegin);
        assertEquals(newBegin, line.getBegin());
    }

    @Test
    void getEnd() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(4, 6);
        MyLine line = new MyLine(begin, end);
        assertEquals(end, line.getEnd());
    }

    @Test
    void setEnd() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(4, 6);
        MyPoint newEnd = new MyPoint(7, 8);
        MyLine line = new MyLine(begin, end);
        line.setEnd(newEnd);
        assertEquals(newEnd, line.getEnd());
    }

    @Test
    void getBeginX() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(4, 6);
        MyLine line = new MyLine(begin, end);
        assertEquals(1, line.getBeginX());
    }

    @Test
    void setBeginX() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(4, 6);
        MyLine line = new MyLine(begin, end);
        line.setBeginX(3);
        assertEquals(3, line.getBeginX());
    }

    @Test
    void getBeginY() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(4, 6);
        MyLine line = new MyLine(begin, end);
        assertEquals(2, line.getBeginY());
    }

    @Test
    void setBeginY() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(4, 6);
        MyLine line = new MyLine(begin, end);
        line.setBeginY(5);
        assertEquals(5, line.getBeginY());
    }

    @Test
    void getEndX() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(4, 6);
        MyLine line = new MyLine(begin, end);
        assertEquals(4, line.getEndX());
    }

    @Test
    void setEndX() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(4, 6);
        MyLine line = new MyLine(begin, end);
        line.setEndX(7);
        assertEquals(7, line.getEndX());
    }

    @Test
    void getEndY() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(4, 6);
        MyLine line = new MyLine(begin, end);
        assertEquals(6, line.getEndY());
    }

    @Test
    void setEndY() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(4, 6);
        MyLine line = new MyLine(begin, end);
        line.setEndY(8);
        assertEquals(8, line.getEndY());
    }

    @Test
    void getBeginXY() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(4, 6);
        MyLine line = new MyLine(begin, end);
        assertArrayEquals(new int[]{1, 2}, line.getBeginXY());
    }

    @Test
    void setBeginXY() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(4, 6);
        MyLine line = new MyLine(begin, end);
        line.setBeginXY(3, 4);
        assertArrayEquals(new int[]{3, 4}, line.getBeginXY());
    }

    @Test
    void getEndXY() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(4, 6);
        MyLine line = new MyLine(begin, end);
        assertArrayEquals(new int[]{4, 6}, line.getEndXY());
    }

    @Test
    void setEndXY() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(4, 6);
        MyLine line = new MyLine(begin, end);
        line.setEndXY(7, 8);
        assertArrayEquals(new int[]{7, 8}, line.getEndXY());
    }

    @Test
    void getLength() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(4, 6);
        MyLine line = new MyLine(begin, end);
        assertEquals(2.23606797749979, line.getLength());
    }

}







