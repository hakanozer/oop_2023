package com.works.models;

import lombok.Data;

import java.util.List;

@Data
public class ProductModel {
    private List<Product> products;
    private Long total;
    private Long skip;
    private Long limit;
}