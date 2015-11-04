/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.repository;

import com.store.core.entity.Category;
import com.store.core.entity.Product;
import com.store.core.service.CategoryService;
import com.store.core.service.ProductService;
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
public class ProductDaoImplTest {
    
    private ApplicationContext context;
    private ProductService productService;
    
    public ProductDaoImplTest() {
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.productService = (ProductService)this.context.getBean("productService");
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass ProductDaoImplTest");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass ProductDaoImplTest");
    }
    
    @Before
    public void setUp() {
        System.out.println("setUp ProductDaoImplTest");
    }
    
    @After
    public void tearDown() {
        System.out.println("tearDown ProductDaoImplTest");
    }
    
    @Test
    public void testInsert() {
        System.out.println("Test insert ProductDaoImplTest");
        
        Category category = ((CategoryService)this.context.getBean("categoryService")).getById(1L);
        Double price = 3.35;
        
        Product product = new Product("Carotte", price, category);
        this.productService.register(product);
    }
    
    @Test
    public void testFindById() {
        System.out.println("Test findById ProductDaoImplTest");
        
        Long id = 3L;
        Product product = this.productService.getById(id);
        
        assertNotNull(product);
    }
}
