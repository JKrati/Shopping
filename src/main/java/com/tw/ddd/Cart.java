package com.tw.ddd;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<Product, Integer> products = new HashMap<>();

    public Cart() {
    }

    public void addProduct(Product product, Integer quantity) {
        this.products.put(product, quantity);
    }
}
