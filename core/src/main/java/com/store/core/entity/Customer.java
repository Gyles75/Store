/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.entity;

import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Customers")
public class Customer implements java.io.Serializable {
      
    @Id
    @Column(name="ID", nullable=false, length=11)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Basic
    @Column(name="NAME", nullable=false)
    private String name;
    
    @ManyToMany(mappedBy="customer", fetch=FetchType.EAGER)
    private Set<Order> orders;
    
    /**
     * 
     * @see com.store.core.entity.Customer
     */
    public Customer() {
        super();
    }
    
    /**
     * 
     * @param id
     * @param name
     * @param orders 
     * @see com.store.core.entity.Order
     */
    public Customer(Long id, String name, Set<Order> orders) {
        super();
        
        this.id = id;
        this.name = name;
        this.orders = orders;
    }
    
    /**
     * 
     * @param name
     * @param orders 
     * @see com.store.core.entity.Order
     */
    public Customer(String name, Set<Order> orders) {
        super();
        
        this.name = name;
        this.orders = orders;
    }
    
    /**
     * 
     * @param name
     */
    public Customer(String name) {
        super();
        
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + "}";
    }
}
