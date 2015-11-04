/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.controller;

import com.store.core.entity.Customer;
import com.store.core.entity.Order;
import com.store.core.entity.Product;
import com.store.core.service.OrderService;
import com.store.core.util.SystemUtil;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("orderController")
public class OrderController {
    
    @Autowired
    private OrderService orderService;
    
    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
    
    public void registerFromConsole(Customer customer, Map<Integer, Product> products) {
        final Scanner scanner = new Scanner(System.in);
        final Date date = new Date();
        
        this.orderService.register(new Order(date, customer, products));
    }
    
    public Order getFromConsole() {
        final Scanner scanner = new Scanner(System.in);
        final Long id = SystemUtil.longFromConsole(scanner, "Quel est l'identifiant de la commande ?");
        
        return this.orderService.getById(id);
    }
}
