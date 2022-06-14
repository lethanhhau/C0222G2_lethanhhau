package model;

public class Product {
    private Integer productId;
    private String productName;
    private Double price;
    private Integer quantity;
    private String color;
    private String describe;
    private Integer categoryId;

    public Product() {
    }

    public Product(String productName, Double price, Integer quantity, String color, String describe, Integer categoryId) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.describe = describe;
        this.categoryId = categoryId;
    }

    public Product(Integer productId, String productName, Double price, Integer quantity, String color, String describe, Integer categoryId) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.describe = describe;
        this.categoryId = categoryId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
