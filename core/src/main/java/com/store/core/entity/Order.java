/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.entity;

import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Orders")
public class Order implements java.io.Serializable {
    
    @Id
    @Column(name="ID", nullable=false, length=11)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Basic
    @Column(name="DATE", nullable=false)
    private Date date;
    
    @ManyToOne
    @JoinColumn(name="CUSTOMER_ID", nullable=false)
    private Customer customer;
    
    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="ORDERS_PRODUCTS", joinColumns={@JoinColumn(name="ORDER_ID", nullable=false)}, 
            inverseJoinColumns={@JoinColumn(name="PRODUCT_ID", nullable=false)})
    @MapKeyColumn(name="QUANTITY", unique=false)
    private Map<Integer, Product> products;
    
    /**
     * 
     * @see com.store.core.entity.Order
     */
    public Order() {
        super();
    }
    
    /**
     * 
     * @param id
     * @param date
     * @param customer
     * @param products 
     */
    public Order(Long id, Date date, Customer customer, Map<Integer, Product> products) {
        super();
        
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.products = products;
    }
    
    /**
     * 
     * @param id
     * @param date
     * @param customer 
     */
    public Order(Long id, Date date, Customer customer) {
        super();
        
        this.id = id;
        this.date = date;
        this.customer = customer;
    }
    
    /**
     * 
     * @param date
     * @param customer
     * @param products 
     */
    public Order(Date date, Customer customer, Map<Integer, Product> products) {
        super();
        
        this.date = date;
        this.customer = customer;
        this.products = products;
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
    public Date getDate() {
        return date;
    }
    
    /**
     * 
     * @param date 
     */
    public void setDate(Date date) {
        this.date = date;
    }
    
    /**
     * 
     * @return 
     */
    public Customer getCustomer() {
        return customer;
    }
    
    /**
     * 
     * @param customer 
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    /**
     * 
     * @return 
     */
    public Map<Integer, Product> getProducts() {
        return products;
    }
    
    /**
     * 
     * @param products 
     */
    public void setProducts(Map<Integer, Product> products) {
        this.products = products;
    }
    
    @Override
    public String toString() {
        return "Order{" + "id=" + this.id + ", date=" + this.date + ", customer=" + this.customer.toString() + ", products=" + products + '}';
    }
    
    @Transient
    public String print() {
        final StringBuilder sb = new StringBuilder();
        
        sb.append("\n\n").append("*******************************************************************").append("\n");
        sb.append(this.id).append("- ").append(this.date.toString()).append("\n");
        sb.append("\t").append(this.customer.getId()).append("- ").append(this.customer.getName()).append("\n");
        
        for (Entry<Integer, Product> entry: this.products.entrySet()) {
            final Product product = entry.getValue();
            final Integer quantity = entry.getKey();
            
            sb.append("\t\t").
                    append(product.getCategory().getName()).
                    append(" - ").
                    append(product.getName()).
                    append(" - ").
                    append(product.getPrice()).
                    append(" - ").
                    append(quantity).append("\n");
        }
        sb.append("*******************************************************************").append("\n");
        
        return sb.toString();
    }
}
