/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class Product implements java.io.Serializable {
    
    @Id
    @Column(name="ID", nullable=false, length=11)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Basic
    @Column(name="NAME", nullable=false)
    private String name;
    
    @Basic
    @Column(name="PRICE", nullable=false)
    private Double price;
    
    @ManyToOne
    @JoinColumn(name="CATEGORY_ID", nullable=false)
    private Category category;
    
    /**
     * 
     * @see com.store.core.entity.Product
     */
    public Product() {
        super();
    }
    
    /**
     * 
     * @param id
     * @param name
     * @param price
     * @param category 
     * @see com.store.core.entity.Category
     */
    public Product(Long id, String name, Double price, Category category) {
        super();
        
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
    
    /**
     * 
     * @param name
     * @param price
     * @param category 
     * @see com.store.core.entity.Category
     */
    public Product(String name, Double price, Category category) {
        super();
        
        this.name = name;
        this.price = price;
        this.category = category;
    }
    
    /**
     * 
     * @param name 
     * @param price
     */
    public Product(String name, Double price) {
        super();
        
        this.name = name;
        this.price = price;
    }
    
    /**
     * 
     * @return 
     */
    public Long getId() {
        return id;
    }
    
    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * 
     * @return 
     */
    public String getName() {
        return name;
    }
    
    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 
     * @return 
     */
    public Double getPrice() {
        return price;
    }
    
    /**
     * 
     * @param price 
     */
    public void setPrice(Double price) {
        this.price = price;
    }
    
    /**
     * 
     * @return 
     */
    public Category getCategory() {
        return category;
    }
    
    /**
     * 
     * @param category 
     */
    public void setCategory(Category category) {
        this.category = category;
    }
    
    
    @Override
    public String toString() {
        return "Product{" + "id=" + this.id + ", name=" + this.name + ", price=" + this.price + ", category=" + this.category.toString() + '}';
    }
}
