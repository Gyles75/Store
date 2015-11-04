/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.controller;

import com.store.core.entity.Product;
import com.store.core.service.ProductService;
import com.store.core.util.SystemUtil;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("productController")
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
    
    public void registerFromConsole() {
        final Scanner scanner = new Scanner(System.in);
        final String name = SystemUtil.strFromConsole(scanner, "Quel est le nom du produit ?");
        final Double price = SystemUtil.doubleFromConsole(scanner, "Quel est le prix unitaire ?");
        
        this.productService.register(new Product(name, price));
    }
    
    public Product getFromConsole() {
        final Scanner scanner = new Scanner(System.in);
        final Long id = SystemUtil.longFromConsole(scanner, "Quel est l'identifiant du produit ?");
        
        return this.productService.getById(id);
    }
}
