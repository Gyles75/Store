/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.controller;

import com.store.core.entity.Category;
import com.store.core.service.CategoryService;
import com.store.core.util.SystemUtil;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("categoryController")
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;
    
    @Autowired
    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    
    public void registerFromConsole() {
        final Scanner scanner = new Scanner(System.in);
        final String name = SystemUtil.strFromConsole(scanner, "Quel est le nom de la catégorie ?");
        
        this.categoryService.register(new Category(name));
    }
    
    public Category getFromConsole() {
        final Scanner scanner = new Scanner(System.in);
        final Long id = SystemUtil.longFromConsole(scanner, "Quel est l'identifiant de la catégorie ?");
        
        return this.categoryService.getById(id);
    }
}
