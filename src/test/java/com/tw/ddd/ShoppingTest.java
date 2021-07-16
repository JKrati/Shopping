package com.tw.ddd;

import java.util.HashMap;

import org.junit.Test;

import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ShoppingTest {

    @Test
    public void addProductsToCart() {
        Map<Product, Integer> products = new HashMap<>();
        Product ipadPro = new Product("IpadPro");
        Product hero_ink_pen = new Product("Hero Ink Pen");
        Product gm_cricket_bat = new Product("GM Cricket Bat");

        products.put(ipadPro, 1);
        products.put(hero_ink_pen, 1);
        products.put(gm_cricket_bat, 2);

        Cart cart = Shopping.addProductToCart(new Cart(), products);
        assertEquals(3, cart.products.size());
        assertThat(cart.products.get(ipadPro), is(1));
        assertThat(cart.products.get(hero_ink_pen), is(1));
        assertThat(cart.products.get(gm_cricket_bat), is(2));

        assertEquals(3, cart.products.size());
    }
}
