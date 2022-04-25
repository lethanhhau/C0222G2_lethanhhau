package module2.ss17_binary_file_and_serialization.bai_tap.ss1_product_manager_saves_to_binary_files;

import java.io.Serializable;

public class ProductManagement implements Serializable {
    private String productCode;
    private String productName;
    private String manufacturer;
    private Double price;

    public ProductManagement() {
    }

    public ProductManagement(String productCode, String productName, String manufacturer, Double price) {
        this.productCode = productCode;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductManagement{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
}
