package Practica2.Ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getIsbn() {
        Author author = new Author("John Doe", "john@example.com");
        Book book = new Book("12345", "Java for Dummies", author, 19.99, 99);
        assertEquals("12345", book.getIsbn());
    }

    @Test
    void getName() {
        Author author = new Author("John Doe", "john@example.com");
        Book book = new Book("12345", "Java for Dummies", author, 19.99, 99);
        assertEquals("Java for Dummies", book.getName());
    }

    @Test
    void getPrice() {
        Author author = new Author("John Doe", "john@example.com");
        Book book = new Book("12345", "Java for Dummies", author, 19.99, 99);
        assertEquals(19.99, book.getPrice());
    }

    @Test
    void setPrice() {
        Author author = new Author("John Doe", "john@example.com");
        Book book = new Book("12345", "Java for Dummies", author, 19.99, 99);
        book.setPrice(29.99);
        assertEquals(29.99, book.getPrice());
    }

    @Test
    void getQty() {
        Author author = new Author("John Doe", "john@example.com");
        Book book = new Book("12345", "Java for Dummies", author, 19.99, 99);
        assertEquals(99, book.getQty());
    }

    @Test
    void setQty() {
        Author author = new Author("John Doe", "john@example.com");
        Book book = new Book("12345", "Java for Dummies", author, 19.99, 99);
        book.setQty(50);
        assertEquals(50, book.getQty());
    }

    @Test
    void getAuthor() {
        Author author = new Author("John Doe", "john@example.com");
        Book book = new Book("12345", "Java for Dummies", author, 19.99, 99);
        assertEquals(author, book.getAuthor());
    }

    @Test
    void getAuthorName() {
        Author author = new Author("John Doe", "john@example.com");
        Book book = new Book("12345", "Java for Dummies", author, 19.99, 99);
        assertEquals("John Doe", book.getAuthorName());
    }

    @Test
    void getAuthorEmail() {
        Author author = new Author("John Doe", "john@example.com");
        Book book = new Book("12345", "Java for Dummies", author, 19.99, 99);
        assertEquals("john@example.com", book.getAuthorEmail());
    }

    @Test
    void testToString() {
        Author author = new Author("John Doe", "john@example.com");
        Book book = new Book("12345", "Java for Dummies", author, 19.99, 99);
        assertEquals("Book[isbn=12345,name=Java for Dummies,Author[name=John Doe,email=john@example.com],price=19.99,qty=99]", book.toString());
    }
}