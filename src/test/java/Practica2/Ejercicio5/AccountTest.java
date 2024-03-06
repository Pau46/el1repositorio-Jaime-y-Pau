package Practica2.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Account account = new Account(101, new Customer(88, "Tan Ah Teck", 10), 1000);
        assertEquals(101, account.getId());
    }

    @Test
    void getCustomer() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        Account account = new Account(101, customer, 1000);
        assertEquals(customer, account.getCustomer());
    }

    @Test
    void setCustomer() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        Account account = new Account(101, customer, 1000);
        Customer newCustomer = new Customer(99, "Paul Tan", 5);
        account.setCustomer(newCustomer);
        assertEquals(newCustomer, account.getCustomer());
    }

    @Test
    void getBalance() {
        Account account = new Account(101, new Customer(88, "Tan Ah Teck", 10), 1000);
        assertEquals(1000, account.getBalance());
    }

    @Test
    void setBalance() {
        Account account = new Account(101, new Customer(88, "Tan Ah Teck", 10), 1000);
        account.setBalance(2000);
        assertEquals(2000, account.getBalance());
    }

    @Test
    void getCustomerId() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        Account account = new Account(101, customer, 1000);
        assertEquals(88, account.getCustomerId());
    }

    @Test
    void getCustomerName() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        Account account = new Account(101, customer, 1000);
        assertEquals("Tan Ah Teck", account.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        Account account = new Account(101, customer, 1000);
        assertEquals(10, account.getCustomerDiscount());
    }

    @Test
    void getBalanceAfterDiscount() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        Account account = new Account(101, customer, 1000);
        assertEquals(900, account.getBalanceAfterDiscount());
    }

    @Test
    void testToString() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        Account account = new Account(101, customer, 1000);
        assertEquals("Account[id=101,customer=Tan Ah Teck(88)(10%),balance=1000,0]", account.toString());
    }
}
