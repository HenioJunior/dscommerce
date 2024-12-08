package com.heniojunior.dscommerce.dto;

import com.heniojunior.dscommerce.entities.Product;

public class ProductDto {
    private Long id;

    private String name;

    private String description;

    private Double price;

    private String imgUrl;

    public ProductDto() {
    }

    public ProductDto(String name, String description, Double price, String imgUrl) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDto(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
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

    public String getImgUrl() {
        return imgUrl;
    }
}
