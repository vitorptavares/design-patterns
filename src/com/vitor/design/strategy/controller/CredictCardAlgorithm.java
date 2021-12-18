package com.vitor.design.strategy.controller;

public class CredictCardAlgorithm implements Payment{
    private String name;
    private String cardNumber;


    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with Card");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CredictCardAlgorithm(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }
}
