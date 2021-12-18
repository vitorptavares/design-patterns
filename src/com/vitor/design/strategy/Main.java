package com.vitor.design.strategy;

import com.vitor.design.strategy.controller.CredictCardAlgorithm;
import com.vitor.design.strategy.controller.PaypalAlgorithm;
import com.vitor.design.strategy.controller.ShoppingCart;
import com.vitor.design.strategy.model.Product;

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product("234", 25);
        Product shirts = new Product("987", 15);

        cart.addProduct(pants);
        cart.addProduct(shirts);

        //É aqui que o strategy decide qual pagamento alg será realizado
        cart.pay(new PaypalAlgorithm("vitortavares984@gmail.com", "123456"));

        cart.pay(new CredictCardAlgorithm("Vitor", "456789321"));


    }
}
