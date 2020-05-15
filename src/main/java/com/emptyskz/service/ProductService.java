package com.emptyskz.service;

import com.emptyskz.pojo.Product;

import java.util.List;

public interface ProductService {

    //获取所有的产品信息
    public List<Product> findAll();

    //添加产品
    void save(Product product);

    Product findById(Integer id);
}
