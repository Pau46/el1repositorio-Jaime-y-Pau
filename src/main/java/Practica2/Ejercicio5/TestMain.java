package Practica2.Ejercicio5;

public class TestMain {
    public static void main(String[] args) {
        // Test Customer class
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(c1); // Customer's toString()
        c1.setDiscount(8);
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("discount is: " + c1.getDiscount());

        // Test Account class
        Account acc1 = new Account(101, c1, 888.8);
        System.out.println(acc1);
        acc1.setBalance(999.9);
        System.out.println(acc1);
        System.out.println("id is: " + acc1.getId());
        System.out.println("customer is: " + acc1.getCustomer()); // Customer's toString()
        System.out.println("balance is: " + acc1.getBalance());
        System.out.println("customer's id is: " + acc1.getCustomerId());
        System.out.println("customer's name is: " + acc1.getCustomerName());
        System.out.println("customer's discount is: " + acc1.getCustomerDiscount());
        System.out.printf("balance after discount is: %.2f%n", acc1.getBalanceAfterDiscount());
    }
}
