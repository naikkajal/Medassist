package com.backend.medassist.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Products {
    @Id
//    @Column(name="ProductId")
    private Integer productID;

//    @Column(name="ProductName")
    private String productName;

    @Column(columnDefinition = "TEXT")
    private String uses;

    @Column(columnDefinition = "TEXT")
    private String side_effects;

//    @Column(name="image_url")
    private String image_url;

//    @Column(name="manufacturer")
    private String manufacturer;
}
