package service;

import model.Category;
import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> selectAllProduct();

    List<Category> selectAllCategory();

    void saveProduct(Product product);

    Object findById(int id);

    void editProduct(Product product);
}
