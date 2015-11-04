/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Categories")
public class Category implements java.io.Serializable {
    
    @Id
    @Column(name="ID", nullable=false, length=11)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Basic
    @Column(name="NAME", nullable=false)
    private String name;
    
    /**
     * 
     * @see com.store.core.entity.Category
     */
    public Category() {
        super();
    }
    
    /**
     * 
     * @param id
     * @param name 
     */
    public Category(Long id, String name) {
        super();
        
        this.id = id;
        this.name = name;
    }
    
    /**
     * 
     * @param name 
     */
    public Category(String name) {
        super();
        
        this.name = name;
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

    @Override
    public String toString() {
        return "Category{" + "id=" + this.id + ", name=" + this.name + '}';
    }
}
