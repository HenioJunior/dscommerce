package com.heniojunior.dscommerce.dto;

import com.heniojunior.dscommerce.entities.Product;

public class ProductDto {
    private Long id;

    private String name;

    private String description;

    private Double price;

    private String imageUrl;

    public ProductDto() {
    }

    public ProductDto(Long id, String name, String description, Double price, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public ProductDto(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imageUrl = entity.getImageUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
