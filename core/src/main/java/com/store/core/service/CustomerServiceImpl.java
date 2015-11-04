/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.service;

import com.store.core.entity.Customer;
import com.store.core.repository.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    
    @Autowired
    private CustomerDao customerDao;
    
    @Autowired
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
    
    @Override
    @Transactional
    public void register(Customer customer) {
        this.customerDao.insert(customer);
    }
    
    @Override
    @Transactional
    public Customer getById(Long id) {
        return this.customerDao.findById(id);
    }
}
