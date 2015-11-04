/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.repository;

import com.store.core.entity.Customer;
import com.store.core.service.CustomerService;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Gyles
 */
public class CustomerDaoImplTest {
    
    private CustomerService customerService;
    
    public CustomerDaoImplTest() {
        this.customerService = (CustomerService)new ClassPathXmlApplicationContext("applicationContext.xml").getBean("customerService");
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass CustomerDaoImplTest");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass CustomerDaoImplTest");
    }
    
    @Before
    public void setUp() {
        System.out.println("setUp CustomerDaoImplTest");
    }
    
    @After
    public void tearDown() {
        System.out.println("tearDown CustomerDaoImplTest");
    }
    
    @Test
    public void testInsert() {
        System.out.println("Test insert CustomerDaoImplTest");
        
        Customer customer = new Customer("Test Customer");
        this.customerService.register(customer);
    }
    
    @Test
    public void testFindById() {
        System.out.println("Test findById CustomerDaoImplTest");
        
        Long id = 6L;
        Customer customer = this.customerService.getById(id);
        
        assertNotNull(customer);
    }
}
