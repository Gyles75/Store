/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.repository;

import com.store.core.entity.Category;

/**
 *
 * @author Gyles
 */
public interface CategoryDao {
    
    /**
     * 
     * @param category 
     */
    public void insert(Category category);
    
    /**
     * 
     * @param id
     * @return 
     */
    public Category findById(Long id);
}
