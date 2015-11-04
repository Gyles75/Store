/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.service;

import com.store.core.entity.Customer;

/**
 *
 * @author Gyles
 */
public interface CustomerService {
    
    /**
     * 
     * @param customer 
     */
    public void register(Customer customer);
    
    /**
     * 
     * @param id
     * @return 
     */
    public Customer getById(Long id);
}
