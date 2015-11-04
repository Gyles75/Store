/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.controller;

import com.store.core.entity.Customer;
import com.store.core.entity.Order;
import com.store.core.service.CustomerService;
import com.store.core.util.SystemUtil;
import java.io.FileWriter;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("customerController")
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;
    
    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }
    
    public void registerFromConsole() {
        final Scanner scanner = new Scanner(System.in);
        final String name = SystemUtil.strFromConsole(scanner, "Quel est le nom du client ?");
        
        this.customerService.register(new Customer(name));
    }
    
    public Customer getFromConsole() {
        final Scanner scanner = new Scanner(System.in);
        final Long id = SystemUtil.longFromConsole(scanner, "Quel est l'identifiant du client ?");
        
        return this.customerService.getById(id);
    }
    
    public void printIntoFile() {
        final Customer customer = getFromConsole();
        
        try {
            final FileWriter writer = new FileWriter("/Users/Gyles/Desktop/Orders.txt");
            for (Order order: customer.getOrders()) {
                writer.write(order.print());
            }
            writer.close();
        }catch(Throwable e) {
            e.printStackTrace();
        }
    }
}
