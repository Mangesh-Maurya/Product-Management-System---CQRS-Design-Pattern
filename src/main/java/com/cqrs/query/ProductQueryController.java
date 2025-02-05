package com.cqrs.query;

import java.util.List;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class ProductQueryController {


    private ProductQueryService productQueryService;

    @GetMapping
    public ResponseEntity<List<ProductReadModel>> getAllProducts() {
        return ResponseEntity.ok(productQueryService.getAllProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductReadModel> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok(productQueryService.getProductById(id));
    }
}
