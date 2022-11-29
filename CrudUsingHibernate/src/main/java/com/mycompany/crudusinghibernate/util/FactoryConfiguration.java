/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudusinghibernate.util;

import com.mycompany.crudusinghibernate.model.Registration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author atlas
 */
public class FactoryConfiguration {
    
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;
    
    private FactoryConfiguration(){
         
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Registration.class);
        sessionFactory = configuration.buildSessionFactory();
                
    
    }
    
    public static FactoryConfiguration getInstance (){
        if (factoryConfiguration==null) {
              factoryConfiguration = new FactoryConfiguration();
              
            
        }
        return factoryConfiguration;
    }
    
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
