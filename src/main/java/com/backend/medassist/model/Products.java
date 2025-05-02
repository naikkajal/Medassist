package com.backend.medassist.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Products {

    @Id
    private Integer productID;

    private String productName;

    @Column(columnDefinition = "TEXT")
    private String uses;

    @Column(columnDefinition = "TEXT")
    private String side_effects;

    private String image_url;

    private String manufacturer;

    @Override
    public String toString() {
        return "Products{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", uses='" + uses + '\'' +
                ", side_effects='" + side_effects + '\'' +
                ", image_url='" + image_url + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
