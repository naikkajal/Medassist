package com.backend.medassist.repository;

import com.backend.medassist.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Products, Integer> {
}
