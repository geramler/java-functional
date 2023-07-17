package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class _Consumer {
    public static void main(String[] args) {
        System.out.println("...printing greeting using Function-->");
        Customer customer = new Customer("Gerardo", "55-2667-7318");
        System.out.println(greetCustomerFunction.apply(customer));

        System.out.println("...printing greeting using Consumer-->");
        greetCustomerConsumer.accept(customer);

        System.out.println("...printing greeting using BiConsumer-->");
        greetCustomerConsumerV2.accept(customer, false);

        System.out.println("...printing greeting using BiConsumer-->");
        greetCustomerConsumerV2.accept(customer, true);
    }

    static Function<Customer, String> greetCustomerFunction = customer ->
            "Hello " +
                    customer.customerName +
                    ", thanks for registering phone number " +
                    customer.customerPhoneNumber;

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println(
                    "Hello " +
                            customer.customerName +
                            ", thanks for registering phone number " +
                            customer.customerPhoneNumber
            );

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 =
            (customer, showPhoneNumber) ->
                    System.out.println(
                            "Hello " +
                                    customer.customerName +
                                    ", thanks for registering phone number " +
                                    (showPhoneNumber ? customer.customerPhoneNumber : "**-****-****")
                    );

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
