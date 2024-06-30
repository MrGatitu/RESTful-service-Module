package com.example.REST.service.Test;

public class BankUsers {
    String id;
    String name;
    String balance;

    public BankUsers(String id,String name, String balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getBalance() {
        return balance;
    }
}
