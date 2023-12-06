package unosquare.coe.challenge.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final List<String> customerFilled = new ArrayList<>();

    public Customer(String id, String firstName, String lastName, String age){
        customerFilled.add(id);
        customerFilled.add(firstName);
        customerFilled.add(lastName);
        customerFilled.add(age);
    }

    public List<String> getCustomer(){
        return customerFilled;
    }
}
