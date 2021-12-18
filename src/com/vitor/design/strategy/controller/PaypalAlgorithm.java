package com.vitor.design.strategy.controller;

public class PaypalAlgorithm implements Payment{
    private String email;
    private String password;

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with Paypal");
    }

    public PaypalAlgorithm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
