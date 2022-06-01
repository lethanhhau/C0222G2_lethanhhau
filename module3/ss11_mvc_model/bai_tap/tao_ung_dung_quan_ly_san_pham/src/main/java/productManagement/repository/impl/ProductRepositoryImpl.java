package productManagement.repository.impl;

import productManagement.model.Product;
import productManagement.repository.IProductRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryImpl implements IProductRepository {
    private static Map<Integer,Product> products;

    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"hao hao",4.5d,"ngon","hao hao"));
        products.put(2,new Product(2,"hon da",12.5d,"đẹp","hon da"));
        products.put(3,new Product(3,"toyota",99.5d,"đẹp","toyota"));
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
products.remove(id);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }
}
