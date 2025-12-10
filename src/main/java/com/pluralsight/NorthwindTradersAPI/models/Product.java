package com.pluralsight.NorthwindTradersAPI.models;

public class Product {
    private int productId;
    private String productName;
    private int categoryId;
    private double unitPrice;

    public Product(int productId, String name, int categoryId, double unitPrice) {
        this.productId = productId;
        this.productName = name;
        this.categoryId = categoryId;
        this.unitPrice = unitPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return productName;
    }

    public void setProductNameName(String productName) {
        this.productName = productName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
