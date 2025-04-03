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
@Table(name = "Products")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Products {
    @Id
    @Column(name="productId")
    private Integer productId;

    @Column(name="productName")
    private String productName;

    @Column(name="Uses", columnDefinition = "TEXT")
    private String Uses;

    @Column(name="Side_effects", columnDefinition = "TEXT")
    private String Side_effects;

    @Column(name="Image_url")
    private String Image_url;

    @Column(name="Manufacturer")
    private String Manufacturer;
}
