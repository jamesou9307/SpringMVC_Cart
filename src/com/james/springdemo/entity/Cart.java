package com.james.springdemo.entity;

import java.util.List;

public class Cart {

    private List<CartItem> cartItems;

    public Cart() {
    }

    public Cart(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }


}
