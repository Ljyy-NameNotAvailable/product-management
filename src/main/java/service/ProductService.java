package service;

import dao.ProductDao;
import entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductDao productDao;

    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public List<Product> getAllProducts(){
        return productDao.findAll();
    }

    public Product findById(Long id){
        return productDao.findById(id).orElseThrow(()->new RuntimeException("none"));
    }

    public Product save(Product p){
        return productDao.save(p);
    }

    public void delete(Long id){
        productDao.deleteById(id);
    }

    public List<Product> findAll() {
        return productDao.findAll();
    }
}
