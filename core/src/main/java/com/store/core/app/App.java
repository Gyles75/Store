/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.app;

import com.store.core.controller.CustomerController;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Gyles
 */
public class App {
    private final static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] argv) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //final CategoryController categoryController = (CategoryController)context.getBean("categoryController");
        //System.out.println(categoryController.getFromConsole());
        
        final CustomerController customerController = (CustomerController)context.getBean("customerController");
        //final Customer customer = customerController.getFromConsole();
        
        /*for (Order order: customer.getOrders()) {
            System.out.println(order.print());
        }*/
        customerController.printIntoFile();
        
        //final OrderController orderController = (OrderController)context.getBean("orderController");
        //System.out.println(orderController.getFromConsole());
        
        //HibernateUtil.exportSchema();
        
        /*final CategoryService categoryService = new CategoryServiceImpl();
        final CustomerService customerService = new CustomerServiceImpl();
        final ProductService productService = new ProductServiceImpl();
        final OrderService orderService = new OrderServiceImpl();
        
        //SystemUtil.create(categoryService, customerService, productService);
        //SystemUtil.passOrder(orderService, customerService, productService);
        
        //final Long categoryId = SystemUtil.longFromConsole(scanner, "Quel est l'identifiant de la catégorie ?");
        //final Category category = categoryService.getById(categoryId);
        //System.out.println(category.toString());
        
        final Long customerId = SystemUtil.longFromConsole(scanner, "Quel est l'identifiant du client ?");
        final Customer customer = customerService.getById(customerId);
        
        for (Order order: customer.getOrders()) {
            System.out.println(order.print());
        }*/
    }
}
