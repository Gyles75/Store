/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.core.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author Gyles
 */
public final class HibernateUtil {
    
    private final static SessionFactory sessionFactory;
    
    /**
     * 
     * @see com.store.core.util.HibernateUtil
     */
    private HibernateUtil() {
    }
    
    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        }catch(HibernateException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
    
    /**
     * 
     * @return 
     */
    public final static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    /**
     * 
     * @return
     * @throws HibernateException 
     */
    public final static Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }
    
    public final static void exportSchema() {
        final Configuration configuration = new Configuration().configure();
        final SchemaExport exporter = new SchemaExport(configuration);
        
        exporter.setOutputFile("/Users/Gyles/Desktop/schema.sql");
        exporter.create(false, false);
    }
}
