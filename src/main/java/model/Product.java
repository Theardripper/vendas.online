package model;

public class Product {

    int id;
    String name;
    String description;
    double price;
    String dimension;

    Product(String name, String description, double price, String dimension) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.dimension = dimension;
    }

    Product(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }
}
