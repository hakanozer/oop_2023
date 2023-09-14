package com.works.services;

import com.works.entities.Product;
import com.works.models.ProductModel;
import com.works.repositories.ProductRepository;
import com.works.utils.Util;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    final ProductRepository productRepository;
    final RestTemplate restTemplate;
    final CacheManager cacheManager;

    public ResponseEntity save(Product product) {
        productRepository.save(product);
        cacheManager.getCache("product").clear();
        return Util.success(product);
    }

    @Cacheable("product")
    public ResponseEntity list() {
        List<Product> list = productRepository.findAll();
        return Util.success(list);
    }

    public ResponseEntity dummyList() {
        String url = "https://dummyjson.com/products";
        ProductModel productModel = restTemplate.getForObject(url, ProductModel.class);
        return Util.success(productModel.getProducts());
    }

}
