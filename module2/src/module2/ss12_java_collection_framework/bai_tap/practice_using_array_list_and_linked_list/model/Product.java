package module2.ss12_java_collection_framework.bai_tap.practice_using_array_list_and_linked_list.model;

public class Product {
    private String name;
    private Integer id;
    private String productCode;
    private double price;

    public Product() {
    }

    public Product(String name, Integer id, String productCode, double price) {
        this.name = name;
        this.id = id;
        this.productCode = productCode;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", product Code='" + productCode + '\'' +
                ", price ='" + price + '\'' +
                '}';
    }

}
