/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudusinghibernate.action;

import com.mycompany.crudusinghibernate.dao.RegistrationDao;
import com.mycompany.crudusinghibernate.model.Registration;
import com.opensymphony.xwork2.ActionSupport;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Ravindu
 */
public class RegisterAction extends ActionSupport {

    Map<String, Object> result = new HashMap<>();

    public Map<String, Object> getResult() {
        return result;
    }

    public void setResult(Map<String, Object> result) {
        this.result = result;
    }
    RegistrationDao registrationDao = new RegistrationDao();

    @Override
    public String execute() throws IOException, ClassNotFoundException, SQLException, InvalidKeyException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException {
        HttpServletResponse response = ServletActionContext.getResponse();
        HttpServletRequest request = ServletActionContext.getRequest();
        PrintWriter writer = response.getWriter();
        boolean register = false;
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = time.format(format);
        String s = "sa";
        Registration registration = new Registration(
                request.getParameter("userID"),
                request.getParameter("userName"),
                request.getParameter("address"),
                request.getParameter("email"),
                request.getParameter("contact"),
                request.getParameter("password"),
                formatDateTime,
                s
        );
        register = registrationDao.registerUser(registration);

        if (register) {

            result.put("status", "200");
            return SUCCESS;
        } else {
            result.put("status", "400");
            return SUCCESS;
        }

    }

    public String getAllUser() throws SQLException, ClassNotFoundException, IOException {
        ArrayList<Registration> details = registrationDao.report();
        HttpServletResponse response = ServletActionContext.getResponse();
        HttpServletRequest request = ServletActionContext.getRequest();

        if (details == null) {
            return SUCCESS;
        } else {
            result.put("data", details);
            return SUCCESS;
        }

    }

    public String updateUser() throws ClassNotFoundException, SQLException {

        HttpServletResponse response = ServletActionContext.getResponse();
        HttpServletRequest request = ServletActionContext.getRequest();

        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String lastDateTime = time.format(format);
        String name = request.getParameter("userID");
        System.out.println(name);
        Registration registration = new Registration(
                request.getParameter("userID"),
                request.getParameter("userName"),
                request.getParameter("address"),
                request.getParameter("email"),
                request.getParameter("contact"),
                request.getParameter("password"),
                " ",
                lastDateTime
        );
        System.out.println(registration);
        boolean updateUser = registrationDao.updateUser(registration);
        if (updateUser) {
            result.put("status", "200");
            return SUCCESS;
        } else {
            result.put("status", "400");
            return SUCCESS;
        }
    }

    public String deleteUser() throws ClassNotFoundException {

        HttpServletResponse response = ServletActionContext.getResponse();
        HttpServletRequest request = ServletActionContext.getRequest();

        String userID = request.getParameter("userID");
        try {
            if (registrationDao.deleteUser(userID)) {
                result.put("status", "200");
                return SUCCESS;
            } else {
                result.put("status", "400");
                return SUCCESS;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SUCCESS;
    }
}
