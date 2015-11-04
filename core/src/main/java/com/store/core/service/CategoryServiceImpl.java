/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.service;

import com.store.core.entity.Category;
import com.store.core.repository.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
    
    @Autowired
    private CategoryDao categoryDao;
    
    @Autowired
    public void setCategoryDao(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }
    
    @Override
    @Transactional
    public void register(Category category) {
        this.categoryDao.insert(category);
    }
    
    @Override
    @Transactional
    public Category getById(Long id) {
        return this.categoryDao.findById(id);
    }
}
