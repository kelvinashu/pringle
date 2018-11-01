package com.pingle.pringle.services;

import com.pingle.pringle.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();
    Product getProductById(Integer id);
}
