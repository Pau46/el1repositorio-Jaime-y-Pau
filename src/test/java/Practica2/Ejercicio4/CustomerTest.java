package Practica2.Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        assertEquals(88, customer.getId());
    }

    @Test
    void getName() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        assertEquals("Tan Ah Teck", customer.getName());
    }

    @Test
    void getDiscount() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        assertEquals(10, customer.getDiscount());
    }

    @Test
    void setDiscount() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        customer.setDiscount(8);
        assertEquals(8, customer.getDiscount());
    }

    @Test
    void testToString() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        assertEquals("Tan Ah Teck(88)(10%)", customer.toString());
    }
}