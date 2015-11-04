/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.repository;

import com.store.core.entity.Customer;
import com.store.core.entity.Order;
import com.store.core.entity.Product;
import com.store.core.service.CustomerService;
import com.store.core.service.OrderService;
import com.store.core.service.ProductService;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Gyles
 */
public class OrderDaoImplTest {
    
    private ApplicationContext context;
    private OrderService orderService;
    
    public OrderDaoImplTest() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.orderService = (OrderService)context.getBean("orderService");
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass OrderDaoImplTest");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass OrderDaoImplTest");
    }
    
    @Before
    public void setUp() {
        System.out.println("setUp OrderDaoImplTest");
    }
    
    @After
    public void tearDown() {
        System.out.println("tearDown OrderDaoImplTest");
    }
    
    @Test
    public void testInsert() {
        System.out.println("Test insert OrderDaoImplTest");
        
        Date date = new Date();
        Customer customer = ((CustomerService)this.context.getBean("customerService")).getById(5L);
        
        ProductService productService = (ProductService)this.context.getBean("productService");
        Product p1 = productService.getById(3L);
        Product p2 = productService.getById(5L);
        
        Map<Integer, Product> products = new HashMap<Integer, Product>();
        products.put(5, p1);
        products.put(2, p2);
        
        Order order = new Order(date, customer, products);
        this.orderService.register(order);
    }
    
    @Test
    public void testFindById() {
        System.out.println("Test findById OrderDaoImplTest");
        
        Long id = 2L;
        Order order = this.orderService.getById(id);
        
        assertNotNull(order);
    }
}
