/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudusinghibernate.model;

/**
 *
 * @author Ravindu
 */
public class Registration  {

    private String userID;
    private String userName;
    private String address;
    private String email;
    private String contact;
    private String password;
    private String createTime;
    private String lastUpdateTime;

    @Override
    public String toString() {
        return "Registration{" + "userID=" + userID + ", userName=" + userName + ", address=" + address + ", email=" + email + ", contact=" + contact + ", password=" + password + ", createTime=" + createTime + ", lastUpdateTime=" + lastUpdateTime + '}';
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Registration(String userID, String userName, String address, String email, String contact, String password, String createTime, String lastUpdateTime) {
        this.userID = userID;
        this.userName = userName;
        this.address = address;
        this.email = email;
        this.contact = contact;
        this.password = password;
        this.createTime = createTime;
        this.lastUpdateTime = lastUpdateTime;
    }

    public Registration() {
    }
}
