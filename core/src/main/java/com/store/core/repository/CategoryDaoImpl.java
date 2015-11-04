/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.repository;

import com.store.core.entity.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void insert(Category category) {
        final Session session = this.sessionFactory.getCurrentSession();
        session.persist(category);
    }
    
    @Override
    public Category findById(Long id) {
        final Session session = this.sessionFactory.openSession();
        Category category = (Category)session.get(Category.class, id);
        
        return category;
    }
}
