package com.james.springdemo.entity;

public class Product {

    private int productid;
    private String productname;
    private String productdescription;
    private float productprice;

    public Product() {
    }

    public Product(int productid, String productname, String productdescription, float productprice) {
        this.productid = productid;
        this.productname = productname;
        this.productdescription = productdescription;
        this.productprice = productprice;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public float getProductprice() {
        return productprice;
    }

    public void setProductprice(float productprice) {
        this.productprice = productprice;
    }
}
