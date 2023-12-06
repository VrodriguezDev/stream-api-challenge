package unosquare.coe.challenge.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<String> orderFilled = new ArrayList<>();

    public Order(String id, String customerId, String taxPercentage, String status){
        orderFilled.add(id);
        orderFilled.add(customerId);
        orderFilled.add(taxPercentage);
        orderFilled.add(status);
    }

    public List<String> getOrder(){
        return orderFilled;
    }
}
