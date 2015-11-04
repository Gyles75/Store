/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.repository;

import com.store.core.entity.Category;
import com.store.core.service.CategoryService;
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
public class CategoryDaoImplTest {
    
    private final CategoryService categoryService;
    
    public CategoryDaoImplTest() {
        this.categoryService = (CategoryService)new ClassPathXmlApplicationContext("applicationContext.xml").getBean("categoryService");
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass CategoryDaoImplTest");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass CategoryDaoImplTest");
    }
    
    @Before
    public void setUp() {
        System.out.println("setUp CategoryDaoImplTest");
    }
    
    @After
    public void tearDown() {
        System.out.println("tearDown CategoryDaoImplTest");
    }

    /**
     * Test of insert method, of class CategoryDaoImpl.
     */
    @Test
    public void testInsert() {
        System.out.println("Test insert CategoryDaoImplTest");
        
        Category category = new Category("TestCategory");
        this.categoryService.register(category);
    }

    /**
     * Test of findById method, of class CategoryDaoImpl.
     */
    @Test
    public void testFindById() {
        System.out.println("Test findById CategoryDaoImplTest");
        
        Long id = 2L;
        Category result = this.categoryService.getById(id);
        
        assertNotNull(result);
    }
}
