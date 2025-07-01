package model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    int id;
    int userId;
    List<Product> products;

    public ShoppingCart(int userId) {
        this.userId = userId;
        products = new ArrayList<>();
    }

    public ShoppingCart() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
