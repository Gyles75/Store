/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.repository;

import com.store.core.entity.Customer;

/**
 *
 * @author Gyles
 */
public interface CustomerDao {
    
    /**
     * 
     * @param customer 
     */
    public void insert(Customer customer);
    
    /**
     * 
     * @param id
     * @return 
     */
    public Customer findById(Long id);
}
