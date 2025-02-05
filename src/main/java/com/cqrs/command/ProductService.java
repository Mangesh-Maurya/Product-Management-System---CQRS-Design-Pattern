package com.cqrs.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class
ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductEntity createProduct(ProductCommand command) {
        ProductEntity product = new ProductEntity();
        product.setName(command.getName());
        product.setPrice(command.getPrice());
        return productRepository.save(product);
    }

    public void updateProduct(Long id, ProductCommand command) {
        ProductEntity product = productRepository.findById(id).orElseThrow();
        product.setName(command.getName());
        product.setPrice(command.getPrice());
        productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public void readProduct(Long id){productRepository.readById(id);
    }

}
