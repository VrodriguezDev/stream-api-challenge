package unosquare.coe.challenge.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private final List<String> productFilled = new ArrayList<>();

    public Product(String id, String name, String brand, String price, String stockQuantity){
        productFilled.add(id);
        productFilled.add(name);
        productFilled.add(brand);
        productFilled.add(price);
        productFilled.add(stockQuantity);
    }

    public List<String> getProduct(){
        return productFilled;
    }
}
