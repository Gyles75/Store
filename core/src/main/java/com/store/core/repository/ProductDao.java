/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.repository;

import com.store.core.entity.Product;

/**
 *
 * @author Gyles
 */
public interface ProductDao {
    
    /**
     * 
     * @param product 
     */
    public void insert(Product product);
    
    /**
     * 
     * @param id
     * @return 
     */
    public Product findById(Long id);
}
