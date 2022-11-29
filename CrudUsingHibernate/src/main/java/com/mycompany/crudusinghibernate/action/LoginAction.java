/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudusinghibernate.action;

import com.mycompany.crudusinghibernate.dao.LoginDao;
import com.mycompany.crudusinghibernate.model.Registration;
import com.opensymphony.xwork2.ActionSupport;
import java.security.InvalidKeyException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Ravindu
 */
public class LoginAction extends ActionSupport {

    Map<String, String> result = new HashMap<>();

    public Map<String, String> getResult() {
        return result;
    }

    public void setResult(Map<String, String> result) {
        this.result = result;
    }

    LoginDao loginDao = new LoginDao();

    @Override
    public String execute() throws ClassNotFoundException, SQLException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {

        HttpServletResponse response = ServletActionContext.getResponse();
        HttpServletRequest request = ServletActionContext.getRequest();

        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        boolean bool = loginDao.checkEqualityUser(userName, password);
        System.out.println("2");

        List<Registration> list = new ArrayList();
        StandardServiceRegistry build = new StandardServiceRegistryBuilder().configure("hibernete.cfg.xml").build();
        System.out.println("3");
        Metadata meta = new MetadataSources(build).getMetadataBuilder().build();
        System.out.println("4");
        SessionFactory sessionFactory = meta.getSessionFactoryBuilder().build();
        System.out.println("5");
        Session openSession = sessionFactory.openSession();
        System.out.println("6");
        org.hibernate.Transaction t = openSession.beginTransaction();
        System.out.println("7");
        list = openSession.createQuery("from Registration").list();
        System.out.println("8");
        t.commit();

        System.out.println("9");

        if (bool) {
            result.put("status", "200");
            return SUCCESS;
        } else {
            result.put("status", "400");
            return SUCCESS;
        }

    }

//    @Override
//    public String execute() {
//        System.out.println("Done");
//        return SUCCESS;
//    }
}
