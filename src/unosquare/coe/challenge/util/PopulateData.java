package unosquare.coe.challenge.util;

import unosquare.coe.challenge.model.Customer;
import unosquare.coe.challenge.model.Order;
import unosquare.coe.challenge.model.Product;

import java.util.ArrayList;
import java.util.List;

public class PopulateData {
    public static void populate(List<Customer> customers, List<Product> products, List<Order> orders, List<List<String>> orderProducts){
        generateCustomers(customers);
        generateProducts(products);
        generateOrdersProducts(orderProducts);
        generateOrders(orders);
    }

    private static void generateCustomers(List<Customer> customers){
        customers.add(new Customer("23","Jaire","Alexander","25"));
        customers.add(new Customer("31","Adrian","Amos","29"));
        customers.add(new Customer("69","David","Bakhtiari","30"));
        customers.add(new Customer("59","De'Vondre","Campbell","29"));
    }

    private static void generateProducts(List<Product> products){
        products.add(new Product("1001", "Gloves", "Nike", "130", "25"));
        products.add(new Product("1011", "Gloves", "Under Armor", "120", "23"));
        products.add(new Product("1002","Leg Pads","Nike","140","21"));
        products.add(new Product("1012","Leg Pads","Under Armor","130","20"));
        products.add(new Product("1003","Helmet","Ridell","220","43"));
        products.add(new Product("1004","Shoulder Pads","Ridell","180","44"));
        products.add(new Product("1005","Spike Shoes","Nike","250","4"));
        products.add(new Product("1015","Spike Shoes","Under Armor","240","7"));
        products.add(new Product("1006","Black Wristband","Nike","80","129"));
        products.add(new Product("1016","Black Wristband","Under Armor","70","137"));
        products.add(new Product("1009","Black Head band","Nike","50","0"));
        products.add(new Product("1019","Black Head band","Under Armor","40","0"));
    }

    private static void generateOrdersProducts(List<List<String>> orderProducts){
        //Order 1
        orderProducts.add(new ArrayList<>());
        orderProducts.get(0).add("1");//orderid
        orderProducts.get(0).add("1001");//productid  130
        orderProducts.add(new ArrayList<>());
        orderProducts.get(1).add("1");//orderid
        orderProducts.get(1).add("1002");//productid  140
        orderProducts.add(new ArrayList<>());
        orderProducts.get(2).add("1");//orderid
        orderProducts.get(2).add("1003");//productid
        orderProducts.add(new ArrayList<>());
        orderProducts.get(3).add("1");//orderid
        orderProducts.get(3).add("1004");//productid
        orderProducts.add(new ArrayList<>());
        orderProducts.get(4).add("1");//orderid
        orderProducts.get(4).add("1005");//productid  250

        //Order 2
        orderProducts.add(new ArrayList<>());
        orderProducts.get(5).add("2");//orderid
        orderProducts.get(5).add("1011");//productid
        orderProducts.add(new ArrayList<>());
        orderProducts.get(6).add("2");//orderid
        orderProducts.get(6).add("1012");//productid
        orderProducts.add(new ArrayList<>());
        orderProducts.get(7).add("2");//orderid
        orderProducts.get(7).add("1003");//productid
        orderProducts.add(new ArrayList<>());
        orderProducts.get(8).add("2");//orderid
        orderProducts.get(8).add("1004");//productid
        orderProducts.add(new ArrayList<>());
        orderProducts.get(9).add("2");//orderid
        orderProducts.get(9).add("1015");//productid

        //Order 3
        orderProducts.add(new ArrayList<>());
        orderProducts.get(10).add("3");//orderid
        orderProducts.get(10).add("1001");//productid 130
        orderProducts.add(new ArrayList<>());
        orderProducts.get(11).add("3");//orderid
        orderProducts.get(11).add("1002");//productid 140
        orderProducts.add(new ArrayList<>());
        orderProducts.get(12).add("3");//orderid
        orderProducts.get(12).add("1003");//productid
        orderProducts.add(new ArrayList<>());
        orderProducts.get(13).add("3");//orderid
        orderProducts.get(13).add("1004");//productid
        orderProducts.add(new ArrayList<>());
        orderProducts.get(14).add("3");//orderid
        orderProducts.get(14).add("1005");//productid 250

        //Order 4
        orderProducts.add(new ArrayList<>());
        orderProducts.get(15).add("4");//orderid
        orderProducts.get(15).add("1011");//productid
        orderProducts.add(new ArrayList<>());
        orderProducts.get(16).add("4");//orderid
        orderProducts.get(16).add("1012");//productid
        orderProducts.add(new ArrayList<>());
        orderProducts.get(17).add("4");//orderid
        orderProducts.get(17).add("1003");//productid
        orderProducts.add(new ArrayList<>());
        orderProducts.get(18).add("4");//orderid
        orderProducts.get(18).add("1014");//productid
        orderProducts.add(new ArrayList<>());
        orderProducts.get(19).add("4");//orderid
        orderProducts.get(19).add("1015");//productid

        //Order 5
        orderProducts.add(new ArrayList<>());
        orderProducts.get(20).add("5");//orderid
        orderProducts.get(20).add("1006");//productid 80

        //Order 6
        orderProducts.add(new ArrayList<>());
        orderProducts.get(21).add("6");//orderid
        orderProducts.get(21).add("1016");//productid

        //Order 7
        orderProducts.add(new ArrayList<>());
        orderProducts.get(22).add("7");//orderid
        orderProducts.get(22).add("1009");//productid 90
    }

    private static void generateOrders(List<Order> orders){
        orders.add(new Order("1","23","16","DELIVERED"));
        orders.add(new Order("2","31","16","ON THE ROAD"));
        orders.add(new Order("3","69","16","DELIVERED"));
        orders.add(new Order("4","59","16","ON THE ROAD"));
        orders.add(new Order("5","23","16","DELAYED"));
        orders.add(new Order("6","31","16","DELIVERED"));
        orders.add(new Order("7","69","16","DELIVERED"));
    }
}
