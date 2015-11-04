/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.service;

import com.store.core.entity.Order;

/**
 *
 * @author Gyles
 */
public interface OrderService {
    
    /**
     * 
     * @param order 
     */
    public void register(Order order);
    
    /**
     * 
     * @param id
     * @return 
     */
    public Order getById(Long id);
}
