package Practica1.Ejercicio7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        Date date = new Date(1, 2, 2014);
        assertEquals(1, date.getDay());
    }

    @Test
    void getMonth() {
        Date date = new Date(1, 2, 2014);
        assertEquals(2, date.getMonth());
    }

    @Test
    void getYear() {
        Date date = new Date(1, 2, 2014);
        assertEquals(2014, date.getYear());
    }

    @Test
    void setDay() {
        Date date = new Date(1, 2, 2014);
        date.setDay(10);
        assertEquals(10, date.getDay());
    }

    @Test
    void setMonth() {
        Date date = new Date(1, 2, 2014);
        date.setMonth(12);
        assertEquals(12, date.getMonth());
    }

    @Test
    void setYear() {
        Date date = new Date(1, 2, 2014);
        date.setYear(2099);
        assertEquals(2099, date.getYear());
    }

    @Test
    void setDate() {
        Date date = new Date(1, 2, 2014);
        date.setDate(3, 4, 2016);
        assertEquals(3, date.getDay());
        assertEquals(4, date.getMonth());
        assertEquals(2016, date.getYear());
    }

    @Test
    void testToString() {
        Date date = new Date(1, 2, 2014);
        assertEquals("01/02/2014", date.toString());
    }
}