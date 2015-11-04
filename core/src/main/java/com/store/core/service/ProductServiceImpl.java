/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.service;

import com.store.core.entity.Product;
import com.store.core.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("productService")
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductDao productDao;
    
    @Autowired
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }
    
    @Override
    @Transactional
    public void register(Product product) {
        this.productDao.insert(product);
    }
    
    @Override
    @Transactional
    public Product getById(Long id) {
        return this.productDao.findById(id);
    }
}
