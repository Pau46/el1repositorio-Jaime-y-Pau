package Practica1.Ejercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getID() {
        Account account=new Account("A101", "Tan Ah Teck", 88);
        assertEquals("A101",account.getID());
    }

    @Test
    void getName() {
        Account account=new Account("A101", "Tan Ah Teck", 88);
        assertEquals("Tan Ah Teck",account.getName());
    }

    @Test
    void getBalance() {
        Account account=new Account("A101", "Tan Ah Teck", 88);
        assertEquals(88,account.getBalance());
    }

    @Test
    void credit() {
        Account account=new Account("A101", "Tan Ah Teck", 88);
        account.credit(100);
        assertEquals(188,account.getBalance());
    }

    @Test
    void debit() {
        Account account=new Account("A101", "Tan Ah Teck", 88);
        account.debit(50);
        assertEquals(38,account.getBalance());
        account.debit(500);

    }

    @Test
    void transferTo() {
        Account account1=new Account("A101", "Tan Ah Teck",138);
        Account account2=new Account("A102", "Kumar");
        account1.transferTo(account2,100);
        assertEquals(38,account1.getBalance());
        assertEquals(100,account2.getBalance());
    }

    @Test
    void testToString() {
        Account account=new Account("A101", "Tan Ah Teck", 88);
        assertEquals("Account[id=A101,name=Tan Ah Teck,balance=88]", account.toString());
    }
}