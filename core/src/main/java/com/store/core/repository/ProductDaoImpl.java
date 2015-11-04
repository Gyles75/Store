/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.repository;

import com.store.core.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void insert(Product product) {
        final Session session = this.sessionFactory.getCurrentSession();
        session.persist(product);
    }
    
    @Override
    public Product findById(Long id) {
        final Session session = this.sessionFactory.getCurrentSession();
        Product product = (Product)session.get(Product.class, id);
        
        return product;
    }
}
