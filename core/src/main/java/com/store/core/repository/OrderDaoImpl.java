/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.repository;

import com.store.core.entity.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("orderDao")
public class OrderDaoImpl implements OrderDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void insert(Order order) {
        final Session session = this.sessionFactory.getCurrentSession();
        session.persist(order);
    }
    
    @Override
    public Order findById(Long id) {
        final Session session = this.sessionFactory.getCurrentSession();
        Order order = (Order)session.get(Order.class, id);
        
        return order;
    }
}
