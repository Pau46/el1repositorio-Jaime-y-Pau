package Practica1.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem invoiceItem = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals("A101", invoiceItem.getId());
    }

    @Test
    void getDesc() {
        InvoiceItem invoiceItem = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals("Pen Red", invoiceItem.getDesc());
    }

    @Test
    void getQty() {
        InvoiceItem invoiceItem = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals(888, invoiceItem.getQty());
    }

    @Test
    void setQty() {
        InvoiceItem invoiceItem = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        invoiceItem.setQty(1000);
        assertEquals(1000, invoiceItem.getQty());
    }

    @Test
    void getUnitPrice() {
        InvoiceItem invoiceItem = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals(0.08, invoiceItem.getUnitPrice());
    }

    @Test
    void setUnitPrice() {
        InvoiceItem invoiceItem = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        invoiceItem.setUnitPrice(0.1);
        assertEquals(0.1, invoiceItem.getUnitPrice());
    }

    @Test
    void getTotal() {
        InvoiceItem invoiceItem = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        double expectedTotal = 888 * 0.08;
        assertEquals(expectedTotal, invoiceItem.getTotal());
    }

    @Test
    void testToString() {
        InvoiceItem invoiceItem = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals("InvoiceItem[id=A101,desc=Pen Red,qty=888,unitPrice=0.08]", invoiceItem.toString());
    }
}


