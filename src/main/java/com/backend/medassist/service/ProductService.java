package com.backend.medassist.service;

import com.backend.medassist.model.Products;
import com.backend.medassist.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository ProductRepository;
    public Products getProductById(Integer productId){
        System.out.println("Calling getProductById in service: productID: "+productId);
        try {
//        Products product= ProductRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product with productId not found"));
            Products product = ProductRepository.findByProductID(productId);
            if (product == null) {
                throw new RuntimeException("Product not found");
            }
            System.out.println("products data is: "+product);
            System.out.println("productId is: "+product.toString());
        return product;
        }
        catch (Exception e) {
            throw e;
        }
    }

}
