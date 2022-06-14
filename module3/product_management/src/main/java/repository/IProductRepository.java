package repository;

import model.Category;
import model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAllProduct();

    List<Category> getAllCategory();

    void saveProduct(Product product);

    Product findById(int id);

    void editProduct(Product product);
}
