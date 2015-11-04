/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.repository;

import com.store.core.entity.Order;

/**
 *
 * @author Gyles
 */
public interface OrderDao {
    
    /**
     * 
     * @param order 
     */
    public void insert(Order order);
    
    /**
     * 
     * @param id
     * @return 
     */
    public Order findById(Long id);
}
