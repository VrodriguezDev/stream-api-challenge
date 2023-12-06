package unosquare.coe.challenge;

import unosquare.coe.challenge.model.Customer;
import unosquare.coe.challenge.model.Order;
import unosquare.coe.challenge.model.Product;
import unosquare.coe.challenge.util.PopulateData;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        List<Order> orders = new ArrayList<>();
        List<List<String>> orderproducts = new ArrayList<>();

        PopulateData.populate(customers, products, orders, orderproducts);

        /** Test data **
         System.out.println("CUSTOMERS:");
         customers.forEach(customer -> customer.getCustomer().forEach(System.out::println));

         System.out.println("PRODUCTS:");
         products.forEach(product -> product.getProduct().forEach(System.out::println));

         System.out.println("ORDERS:");
         orders.forEach(order -> order.getOrder().forEach(System.out::println));

         System.out.println("ORDERPRODUCTS:");
         orderproducts.forEach(orderidproductid -> orderidproductid.forEach(System.out::println));
         ***/

        /* Challenge #1
           Get the customers older than 29 years
         */

        /* Challenge #2
           Get the list of products out of stock
         */

        /* Challenge #3
            Get the list of orders already delivered
         */

        /* Challenge #4
            Get the list of orders that contains products out of stock
         */

        /* Challenge #5
            Get the total money spent by customer ordered by CustomerId
         */

        /* Challenge #6
            Get the list of customers who have already received all their products
         */

        /* Challenge #7
            Get the total amount of taxes spent in Nike products
         */
    }
}