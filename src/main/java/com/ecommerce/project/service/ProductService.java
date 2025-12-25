package com.ecommerce.project.service;

import com.ecommerce.project.model.Product;
import com.ecommerce.project.payload.ProductDTO;
import com.ecommerce.project.payload.ProductResponse;
import org.springframework.stereotype.Service;

public interface ProductService {

    ProductResponse getAllProducts();
    ProductDTO addProduct(Long categoryId, Product product);
}
