/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author josephchakola
 */
public class Account {
    
    private String routingNumber;
    private String accountNumber;
    private String bankName;
    private int balance;
    private Date createdOn;
    
    public Account() {
    }

    public Account(String routingNumber, String accountNumber, String bankName, String balance) {
        this.routingNumber = routingNumber;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.balance = Integer.parseInt(balance);
        this.createdOn = new Date();
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = Integer.parseInt(balance);
    }

    public Date getCreatedOn() {
        return createdOn;
    }
    
    
    
}
