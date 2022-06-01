package productManagement.repository;

import productManagement.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void save(Product product);

    void update(int id,Product product);

    void remove(int id);

    Product findById(int id);
}
