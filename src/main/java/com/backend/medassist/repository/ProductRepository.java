package com.backend.medassist.repository;

import com.backend.medassist.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {
//    @Query("SELECT p FROM products p where p.ProductID = :productId")
    Products findByProductID(Integer productId);
}
