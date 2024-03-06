package Practica1.Ejercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        Time time=new Time(1,2,3);
        assertEquals(1,time.getHour());
    }

    @Test
    void getMinute() {
        Time time=new Time(1,2,3);
        assertEquals(2,time.getMinute());
    }

    @Test
    void getSecond() {
        Time time=new Time(1,2,3);
        assertEquals(3,time.getSecond());
    }


    @Test
    void setHour() {
        Time time=new Time(1,2,3);
        time.setHour(4);
        assertEquals(4,time.getHour());
    }

    @Test
    void setMinute() {
        Time time=new Time(1,2,3);
        time.setMinute(5);
        assertEquals(5,time.getMinute());
    }

    @Test
    void setSecond() {
        Time time=new Time(1,2,3);
        time.setSecond(6);
        assertEquals(6, time.getSecond());
    }


    @Test
    void setTime() {
        Time time = new Time(1, 2, 3);
        time.setTime(4, 5, 6);
        assertEquals(4, time.getHour());
        assertEquals(5, time.getMinute());
        assertEquals(6, time.getSecond());
    }

    @Test
    void testToString() {
            Time time = new Time(1, 2, 3);
            assertEquals("01:02:03", time.toString());


    }


    @Test
    void nextSecond() {
        Time time = new Time(23, 59, 58);
        time.nextSecond();
        assertEquals(59, time.getSecond());
        time.setTime(23, 59, 59);
        time.nextSecond();
        assertEquals(0, time.getSecond());
        assertEquals(0, time.getMinute());
        assertEquals(0, time.getHour());
    }

    @Test
    void previousSecond() {
        Time time = new Time(0, 0, 0);
        time.previousSecond();
        assertEquals(59, time.getSecond());
        assertEquals(59, time.getMinute());
        assertEquals(23, time.getHour());
        time.setTime(0, 0, 1);
        time.previousSecond();
        assertEquals(0, time.getSecond());
    }
}