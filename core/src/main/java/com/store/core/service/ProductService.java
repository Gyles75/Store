/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.service;

import com.store.core.entity.Product;

/**
 *
 * @author Gyles
 */
public interface ProductService {
    
    /**
     * 
     * @param product 
     */
    public void register(Product product);
    
    /**
     * 
     * @param id
     * @return 
     */
    public Product getById(Long id);
}
