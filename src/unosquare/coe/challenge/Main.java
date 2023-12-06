package unosquare.coe.challenge;

import unosquare.coe.challenge.model.Customer;
import unosquare.coe.challenge.model.Order;
import unosquare.coe.challenge.model.Product;
import unosquare.coe.challenge.util.PopulateData;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
//        customers.stream()
//                .filter(c -> Integer.parseInt(c.getCustomer().get(3)) >= 29)
//                .forEach(c -> c.getCustomer()
//                        .forEach(Main::printCustomerElementsWithComma));
//
//        /* Challenge #2
//           Get the list of products out of stock
//         */
//
//        //with dropWhile; disadvantage: it needs to be sorted, and it needs to be ascending
//        products.stream().sorted(new Comparator<Product>() {
//                    @Override
//                    public int compare(Product o1, Product o2) {
//                        return Integer.parseInt(o1.getProduct().get(4)) - Integer.parseInt(o2.getProduct().get(4));
//                    }
//                })
//                .dropWhile(c -> Integer.parseInt(c.getProduct().get(4)) > 1)
//                .forEach(c -> c.getProduct().forEach(Main::printProductElementsWithComma));
//
////        //with filter
//        products.stream().filter(c -> Integer.parseInt(c.getProduct().get(4)) == 0)
//                .forEach(c -> c.getProduct().forEach(Main::printProductElementsWithComma));
//
//        /* Challenge #3
//            Get the list of orders already delivered
//         */
//        orders.stream()
//                .filter(o -> o.getOrder().get(3).equals("DELIVERED"))
//                .forEach(o -> o.getOrder()
//                        .forEach(Main::printOrderElementsWithComma));
//
//        /* Challenge #4
//            Get the list of orders that contains products out of stock
//         */
//        orderproducts.stream()
//                .filter(op ->
//                products.stream().anyMatch(
//                        p -> p.getProduct().get(0).equals(op.get(1)) &&
//                                Integer.parseInt(p.getProduct().get(4)) == 0))
//                .map(op -> orders.stream()
//                        .filter(o -> o.getOrder().get(0).equals(op.get(0)))
//                        .findFirst().orElseThrow())
//                .forEach(o -> o.getOrder().forEach(Main::printOrderElementsWithComma));
//
//        /* Challenge #5
//            Get the total money spent by customer ordered by CustomerId
//         */
//
        //try using a linkedHashMap
        Stream<LinkedHashMap<String, Integer>> linkedHashMapStream = orders.stream().map(o -> orderproducts.stream()
                .filter(op -> op.get(0).equals(o.getOrder().get(0)))
                .map(op -> products.stream()
                        .filter(p -> p.getProduct().get(0).equals(op.get(1)))
                        .findFirst().orElseThrow())
                .map(p -> Integer.parseInt(p.getProduct().get(3)))
                .collect(Collectors.toMap(p -> o.getOrder().get(1), Function.identity(), Integer::sum, LinkedHashMap::new)));

        linkedHashMapStream.toList().forEach(e -> e.forEach((s, i) -> System.out.println(s + ", " + i)));

//
//
//
//        /* Challenge #6
//            Get the list of customers who have already received all their products
//         */
//
//        orders.stream()
//                .filter(o -> o.getOrder().get(3).equals("DELIVERED"))
//                .map(o -> o.getOrder().get(1))
//                .map(cid -> customers.stream()
//                        .filter(c -> c.getCustomer().get(0).equals(cid))
//                        .findFirst().get())
//                .forEach(c -> c.getCustomer().forEach(Main::printCustomerElementsWithComma));

        /* Challenge #7
            Get the total amount of taxes spent in Nike products
         */
//        double sumTaxes = orders.stream().mapToDouble(o -> orderproducts.stream()
//                .filter(op -> op.get(0).equals(o.getOrder().get(0)))
//                .map(op -> op.get(1))
//                .map(pid -> products.stream()
//                        .filter(p -> p.getProduct().get(0).equals(pid) && p.getProduct().get(2).equals("Nike"))
//                        .findFirst()
//                        .orElseThrow()
//                        .getProduct().get(3))
//                .mapToDouble(priceStr -> Double.parseDouble(priceStr) * Double.parseDouble(o.getOrder().get(2)) / 100).sum()).sum();
//        System.out.println(sumTaxes);

    }

    private static final int PRODUCT_FIELDS_AMMOUNT = 5;
    private static final int CUSTOMER_FIELDS_AMMOUNT = 4;
    private static final int ORDER_FIELDS_AMMOUNT = 4;
    static int productFieldsCounter = 1;
    static int orderFieldsCounter = 1;
    static int customerFieldsCounter = 1;

    static void printProductElementsWithComma(String element) {
        if (productFieldsCounter == PRODUCT_FIELDS_AMMOUNT) {
            System.out.println(element);
            productFieldsCounter = 1;
            return;
        }
        System.out.print(element + ", ");
        productFieldsCounter++;
    }

    static void printOrderElementsWithComma(String element) {
        if (orderFieldsCounter == ORDER_FIELDS_AMMOUNT) {
            System.out.println(element);
            orderFieldsCounter = 1;
            return;
        }
        System.out.print(element + ", ");
        orderFieldsCounter++;
    }

    static void printCustomerElementsWithComma(String element) {
        if (customerFieldsCounter == CUSTOMER_FIELDS_AMMOUNT) {
            System.out.println(element);
            customerFieldsCounter = 1;
            return;
        }
        System.out.print(element + ", ");
        customerFieldsCounter++;
    }
}