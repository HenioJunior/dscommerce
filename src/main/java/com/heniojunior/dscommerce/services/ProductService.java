package com.heniojunior.dscommerce.services;

import com.heniojunior.dscommerce.dto.ProductDto;
import com.heniojunior.dscommerce.entities.Product;
import com.heniojunior.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDto findById(Long id) {
        Product product = repository.findById(id).get();
        return new ProductDto(product);
    }
}
