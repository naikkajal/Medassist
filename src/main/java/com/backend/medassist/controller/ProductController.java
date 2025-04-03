package com.backend.medassist.controller;

import com.backend.medassist.model.Products;
import com.backend.medassist.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/{ProductId}")
    public ResponseEntity<Products> getProductById(@PathVariable Integer ProductId) {
        return ResponseEntity.ok(productService.getProductById(ProductId));
    }
}
