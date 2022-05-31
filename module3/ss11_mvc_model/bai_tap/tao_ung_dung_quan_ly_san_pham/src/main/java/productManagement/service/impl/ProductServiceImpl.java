package productManagement.service.impl;

import productManagement.model.Product;
import productManagement.service.IProductService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements IProductService {
        private static Map<Integer, Product> productMap;
        static {
            productMap = new HashMap<>();
            productMap.put(1,new Product(1,"hao hao",4.5d,"ngon","hao hao"));
            productMap.put(2,new Product(2,"hon da",12.5d,"đẹp","hon da"));
            productMap.put(3,new Product(3,"toyota",99.5d,"đẹp","toyota"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public void search(int id) {

    }
}
