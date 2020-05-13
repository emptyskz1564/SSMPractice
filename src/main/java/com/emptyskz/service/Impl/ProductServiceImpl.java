package com.emptyskz.service.Impl;

import com.emptyskz.dao.ProductDao;
import com.emptyskz.pojo.Product;
import com.emptyskz.service.ProductService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    public List<Product> findAll() {
        PageHelper.startPage(1,5);
        return productDao.findAll();
    }

    public void save(Product product) {
        productDao.save(product);
    }
}
