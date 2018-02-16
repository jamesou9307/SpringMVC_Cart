package com.james.springdemo.service;

import com.james.springdemo.dao.ProductDao;
import com.james.springdemo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProducts() {
        return productDao.getProducts();
    }
}
