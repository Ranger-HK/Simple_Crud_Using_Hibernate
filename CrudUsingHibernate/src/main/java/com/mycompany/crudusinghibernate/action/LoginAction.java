/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudusinghibernate.action;

import com.mycompany.crudusinghibernate.dao.LoginDao;
import com.opensymphony.xwork2.ActionSupport;
import java.security.InvalidKeyException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;

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
