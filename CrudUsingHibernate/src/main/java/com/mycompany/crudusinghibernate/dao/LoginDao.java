/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudusinghibernate.dao;

import com.mycompany.crudusinghibernate.db.DbConnection;
import com.mycompany.crudusinghibernate.util.Encryption;
import java.security.InvalidKeyException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/**
 *
 * @author Ravindu
 */
public class LoginDao {

    Encryption en = new Encryption();

    public boolean checkEqualityUser(String userName, String password) throws ClassNotFoundException, SQLException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        DbConnection dbConnection = new DbConnection();
        Connection connection = dbConnection.getConnection();
        PreparedStatement pstm = connection.prepareStatement("select * from Registration where userName=?");
        pstm.setObject(1, userName);
//        pstm.setObject(2, password);
        ResultSet rst = pstm.executeQuery();

        if (rst.next()) {
            String passwordEncrypt = rst.getString(6);
            String passwordDecrypt = en.decrypt(passwordEncrypt);
            if (password.equals(passwordDecrypt)) {
                return true;
            } else {
                return false;
            }
            //return true;
        } else {
            return false;
        }
    }
}
