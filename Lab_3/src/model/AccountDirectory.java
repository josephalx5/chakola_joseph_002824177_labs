/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author josephchakola
 */
public class AccountDirectory {
    
    private ArrayList<Account> accountList;

    public AccountDirectory() {
        accountList = new ArrayList();
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }
    
    public void addAccount(Account account){
        accountList.add(account);
    }
    public Account getAccount(int index){
        return accountList.get(index);
    }
    public void deleteAccount(int index){
        accountList.remove(index);
    }
    public Account searchAccount(String accountNumber){
        for(Account a: accountList){
            if(a.getAccountNumber().equals(accountNumber)){
                return a;
            }
        }
        return null;
    }
    
    
    
}
