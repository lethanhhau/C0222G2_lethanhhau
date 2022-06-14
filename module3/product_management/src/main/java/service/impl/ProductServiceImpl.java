package service.impl;

import model.Category;
import model.Product;
import repository.IProductRepository;
import repository.impl.ProductRepositoryImpl;
import service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private IProductRepository iProductRepository =new ProductRepositoryImpl();
    @Override
    public List<Product> selectAllProduct() {
        return iProductRepository.getAllProduct();
    }

    @Override
    public List<Category> selectAllCategory() {
        return iProductRepository.getAllCategory();
    }

    @Override
    public void saveProduct(Product product) {
        iProductRepository.saveProduct(product);
    }

    @Override
    public Product findById(int id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void editProduct(Product product) {
        iProductRepository.editProduct(product);
    }


}
