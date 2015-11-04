/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.repository;

import com.store.core.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void insert(Customer customer) {
        final Session session = this.sessionFactory.getCurrentSession();
        session.persist(customer);
    }
    
    @Override
    public Customer findById(Long id) {
        final Session session = this.sessionFactory.getCurrentSession();
        Customer customer = (Customer)session.get(Customer.class, id);
        
        return customer;
    }
}
