package productManagement.service.impl;

import productManagement.model.Product;
import productManagement.repository.IProductRepository;
import productManagement.repository.impl.ProductRepositoryImpl;
import productManagement.service.IProductService;

import java.util.List;


public class ProductServiceImpl implements IProductService {
private IProductRepository iProductRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> getAll() {
        return iProductRepository.getAll();
    }

    @Override
    public void save(Product product) {
        this.iProductRepository.save(product);
    }

    @Override
    public void update(int id, Product product) {
        this.iProductRepository.update(id,product);
    }

    @Override
    public Product findById(Integer id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        this.iProductRepository.remove(id);
    }

}
