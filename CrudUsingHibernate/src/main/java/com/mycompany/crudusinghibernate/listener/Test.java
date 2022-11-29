/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudusinghibernate.listener;

/**
 *
 * @author atlas
 */
import com.mycompany.crudusinghibernate.model.Registration;
import com.mycompany.crudusinghibernate.util.FactoryConfiguration;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author 
 */
public class Test {

    public static void main(String args[]) throws ClassNotFoundException {
        Registration registration = new Registration(
                  "userID",
                  "userName",
                  "address",
                  "email",
                  "contact",
                 "password",
                  "formatDateTime",
                  "s"
          );
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction beginTransaction = session.beginTransaction();
        session.save(registration);
        beginTransaction.commit();
        session.close();
        
    }
}
