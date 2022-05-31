package productManagement.repository.impl;

import productManagement.model.Product;
import productManagement.repository.IProductRepository;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository implements IProductRepository {
    private static Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1,new Product(1,"hao hao",4.5d,"ngon","hao hao"));
        productMap.put(2,new Product(2,"hon da",12.5d,"đẹp","hon da"));
        productMap.put(3,new Product(3,"toyota",99.5d,"đẹp","toyota"));
    }
}
