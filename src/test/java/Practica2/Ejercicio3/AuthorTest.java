package Practica2.Ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author author = new Author("John Doe", "john@example.com");
        assertEquals("John Doe", author.getName());
    }

    @Test
    void getEmail() {
        Author author = new Author("John Doe", "john@example.com");
        assertEquals("john@example.com", author.getEmail());
    }

    @Test
    void setEmail() {
        Author author = new Author("John Doe", "john@example.com");
        author.setEmail("johndoe@example.com");
        assertEquals("johndoe@example.com", author.getEmail());
    }

    @Test
    void testToString() {
        Author author = new Author("John Doe", "john@example.com");
        assertEquals("Author[name=John Doe,email=john@example.com]", author.toString());
    }
}
