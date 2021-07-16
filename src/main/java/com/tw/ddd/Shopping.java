package com.tw.ddd;

import java.util.HashMap;
import java.util.Map;

public class Shopping {
    public static void main(String[] args) {
        Product ipadPro = new Product("IpadPro");
        Product heroInkPen = new Product("Hero Ink Pen");
        Product cricketBat = new Product("GM Cricket Bat");
        Cart cart = new Cart();

        Map<Product, Integer> products = new HashMap<>();
        products.put(ipadPro, 1);
        products.put(heroInkPen, 1);
        products.put(cricketBat, 2);

        addProductToCart(cart, products);
        removeProduct(cart, cricketBat);
    }

    public static Cart addProductToCart(Cart cart, Map<Product, Integer> productsList) {
        productsList.forEach(cart::addProduct);
        return cart;
    }

    public static Integer removeProduct(Cart cart, Product product) {
        return cart.products.remove(product);
    }
}
