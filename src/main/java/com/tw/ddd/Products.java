package com.tw.ddd;

public class Products {
    Product product;
    int quantity = 1;

    public Products(Product product) {
        this.product = product;
    }

    public Products(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
