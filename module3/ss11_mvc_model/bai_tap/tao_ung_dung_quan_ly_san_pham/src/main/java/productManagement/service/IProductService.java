package productManagement.service;

import productManagement.model.Product;

import java.util.List;

public interface IProductService {
        List<Product> getAll();

        void save(Product product);

        void update(int id,Product product);


        Product findById(Integer id);

        void remove(Integer id);
}