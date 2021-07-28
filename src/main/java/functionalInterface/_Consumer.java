package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Jorge", "5555555555");
        greetCustomer(customer1);
        greetCustomerConsumer.accept(customer1);
        greetCustomerV2.accept(customer1, false);
    }

    // Consumer is a (void) function that accepts one argument and return nothing
    static Consumer<Customer> greetCustomerConsumer = customer -> {
        System.out.println("Hello " +
                customer.customerName +
                " thanks for register your phone: "
                + customer.customerPhone);
    };

    static BiConsumer<Customer, Boolean> greetCustomerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " +
                customer.customerName +
                " thanks for register your phone: "
                + (showPhoneNumber ? customer.customerPhone : "*********"));

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " +
                customer.customerName +
                " thanks for register your phone: "
                + customer.customerPhone);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhone;

        Customer(String customerName, String customerPhone) {
            this.customerName = customerName;
            this.customerPhone = customerPhone;
        }
    }
}
