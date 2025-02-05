package com.cqrs.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductQueryService {

    @Autowired
    private ProductReadRepository productReadRepository;

    public List<ProductReadModel> getAllProducts() {
        return productReadRepository.findAll();
    }

    public ProductReadModel getProductById(Long id) {
        return productReadRepository.findById(id).orElseThrow();
    }
}
