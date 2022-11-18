/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudusinghibernate.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ravindu
 */
public class DbConnection {

    public Connection connection;

    public DbConnection() {
    }

    public Connection getConnection() throws ClassNotFoundException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/simple_crud_using_strusts2", "root", "19990202Ravi@:&pra");
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return connection;
    }

    public void connectionClose() throws SQLException {
        connection.close();
    }
}
