package productManagement.service;

import productManagement.model.Product;

import java.util.List;

public interface IProductService {
        List<Product> findAll();

        void save(Product customer);

        Product findById(int id);

        void update(int id, Product customer);

        void remove(int id);

        void search(int id);
}