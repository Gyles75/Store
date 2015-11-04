/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.util;

import com.store.core.entity.Category;
import com.store.core.entity.Customer;
import com.store.core.entity.Order;
import com.store.core.entity.Product;
import com.store.core.service.CategoryService;
import com.store.core.service.CustomerService;
import com.store.core.service.OrderService;
import com.store.core.service.ProductService;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Gyles
 */
public final class SystemUtil {
    
    /**
     * 
     * @see com.store.core.util.SystemUtil
     */
    private SystemUtil() {
    }
    
    /**
     * 
     * @param orderService 
     */
    public final static void passOrder(final OrderService orderService, final CustomerService customerService, ProductService productService) {
        final Date date = new Date();
        final Customer customer = customerService.getById(5L);
        
        final Product p1 = productService.getById(6L);
        final Product p2 = productService.getById(8L);
        final Product p3 = productService.getById(2L);
        
        final Map<Integer, Product> products = new HashMap<Integer, Product>();
        products.put(2, p1);
        products.put(2, p2);
        products.put(5, p3);
        
        final Order order = new Order(date, customer, products);
        orderService.register(order);
    }
    
    /**
     * 
     * @param categoryService
     * @param customerService
     * @param productService 
     */
    public final static void create(final CategoryService categoryService, final CustomerService customerService, ProductService productService) {
        categoryService.register(new Category("Legume"));
        categoryService.register(new Category("Fruit"));
        categoryService.register(new Category("Amande"));
        categoryService.register(new Category("Vaisselle"));
        categoryService.register(new Category("Parfum"));
        categoryService.register(new Category("Cosmetique"));
        categoryService.register(new Category("Boisson"));
        
        customerService.register(new Customer("Ghiles Mahrane"));
        customerService.register(new Customer("Omar Khouas"));
        customerService.register(new Customer("Zohir Kherroubi"));
        customerService.register(new Customer("Karim Dali"));
        customerService.register(new Customer("Faycal Belhocine"));
        customerService.register(new Customer("Azedine Ait-Said"));
        customerService.register(new Customer("Nassim Masdoua"));
        
        productService.register(new Product("Pomme de terre", 1.25, categoryService.getById(1L)));
        productService.register(new Product("Mir", 2.35, categoryService.getById(4L)));
        productService.register(new Product("Dior Intense", 79.99, categoryService.getById(5L)));
        productService.register(new Product("Tomate", 0.95, categoryService.getById(1L)));
        productService.register(new Product("Coca-Cola", 1.85, categoryService.getById(7L)));
        productService.register(new Product("Nuxe Prodigieurse", 18.00, categoryService.getById(6L)));
        productService.register(new Product("Banane", 1.05, categoryService.getById(2L)));
        productService.register(new Product("Bleu de Chanel", 101.99, categoryService.getById(5L)));
    }
    
    /**
     * 
     * @param scanner
     * @param prompt
     * @return 
     */
    public final static String strFromConsole(final Scanner scanner, final String prompt) {
        System.out.print(prompt + " ");
        return scanner.nextLine();
    }
    
    /**
     * 
     * @param scanner
     * @param prompt
     * @return 
     */
    public final static Integer integerFromConsole(final Scanner scanner, final String prompt) {
        System.out.print(prompt + " ");
        return scanner.nextInt();
    }
    
    /**
     * 
     * @param scanner
     * @param prompt
     * @return 
     */
    public final static Long longFromConsole(final Scanner scanner, final String prompt) {
        System.out.print(prompt + " ");
        return scanner.nextLong();
    }
    
    /**
     * 
     * @param scanner
     * @param prompt
     * @return 
     */
    public final static Double doubleFromConsole(final Scanner scanner, final String prompt) {
        System.out.print(prompt + " ");
        return scanner.nextDouble();
    }
}
