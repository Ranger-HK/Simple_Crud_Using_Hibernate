/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudusinghibernate.dao;

import com.mycompany.crudusinghibernate.db.DbConnection;
import com.mycompany.crudusinghibernate.model.Registration;
import com.mycompany.crudusinghibernate.util.Encryption;
import com.mycompany.crudusinghibernate.util.FactoryConfiguration;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ravindu
 */
public class RegistrationDao {

    Encryption encryption = new Encryption();

    DbConnection dbConnection = new DbConnection();

    public boolean registerUser(Registration registration) throws ClassNotFoundException, SQLException, InvalidKeyException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction beginTransaction = session.beginTransaction();
        session.save(registration);
        beginTransaction.commit();
        session.close();
        return true;
    }

    public ArrayList<Registration> report() throws SQLException, ClassNotFoundException {
        List<Registration> list = new ArrayList();
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction beginTransaction = session.beginTransaction();
        list = session.createQuery("from Registration").list();

        return (ArrayList<Registration>) list;
    }

    public boolean updateUser(Registration registration) throws ClassNotFoundException, SQLException {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction beginTransaction = session.beginTransaction();
        session.update(registration);
        beginTransaction.commit();
        session.close();
        return true;
    }

    public boolean deleteUser(String userID) throws ClassNotFoundException, SQLException {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction beginTransaction = session.beginTransaction();
        Registration registration = session.get(Registration.class, userID);
        session.delete(registration);
        beginTransaction.commit();
        session.close();
        return true;
    }
}
