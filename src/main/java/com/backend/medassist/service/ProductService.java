package com.backend.medassist.service;

import com.backend.medassist.model.Products;
import com.backend.medassist.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository ProductRepository;
    public Products getProductById(Integer productId){
        Products product= ProductRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product with productId not found"));
        return product;
    }

}
