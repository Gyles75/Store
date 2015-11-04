/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.service;

import com.store.core.entity.Category;

/**
 *
 * @author Gyles
 */
public interface CategoryService {
    
    /**
     * 
     * @param category 
     */
    public void register(Category category);
    
    /**
     * 
     * @param id
     * @return 
     */
    public Category getById(Long id);
}
