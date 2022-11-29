/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudusinghibernate.dao;

import com.mycompany.crudusinghibernate.db.DbConnection;
import com.mycompany.crudusinghibernate.model.Registration;
import com.mycompany.crudusinghibernate.util.Encryption;
import com.mycompany.crudusinghibernate.util.FactoryConfiguration;
import java.security.InvalidKeyException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Ravindu
 */
public class LoginDao {

    Encryption en = new Encryption();

    public boolean checkEqualityUser(String userName, String password) throws ClassNotFoundException, SQLException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
      
        Session session = FactoryConfiguration.getInstance().getSession();
        Query query = session.createQuery("from Registration where userName=:userName and password=:password");
        query.setParameter("userName", userName);        
        query.setParameter("password", password);
        Registration registration =(Registration) query.uniqueResult();
        if (registration != null) {
            return true;
            
        }
        return false;

        
        
    }
}
