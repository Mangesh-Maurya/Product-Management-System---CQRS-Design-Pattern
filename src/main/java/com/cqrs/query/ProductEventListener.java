package com.cqrs.query;

import com.cqrs.command.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ProductEventListener {

    @Autowired
    private ProductReadRepository productReadRepository;

    @EventListener
    public void handleProductCreated(ProductEntity product) {
        ProductReadModel readModel = new ProductReadModel();
        readModel.setId(product.getId());
        readModel.setName(product.getName());
        readModel.setPrice(product.getPrice());
        productReadRepository.save(readModel);
    }
}
