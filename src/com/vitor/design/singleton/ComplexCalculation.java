package com.vitor.design.singleton;

import java.math.BigInteger;

public class ComplexCalculation {

    public static void main(String[] args) throws InterruptedException {
        ComplexCalculation complexCalculation = new ComplexCalculation();
        BigInteger bigInteger = complexCalculation.calculateResult(BigInteger.valueOf(222222222), BigInteger.valueOf(334532454),BigInteger.valueOf(333333333), BigInteger.valueOf(334532454));

        System.out.println(bigInteger);
    }
    
    
    public BigInteger calculateResult(BigInteger base1, BigInteger power1, BigInteger base2, BigInteger power2) throws InterruptedException {
        BigInteger result = null;
        /*
            Calculate result = ( base1 ^ power1 ) + (base2 ^ power2).
            Where each calculation in (..) is calculated on a different thread
        */
        PowerCalculatingThread t1 = new PowerCalculatingThread(base1, power1);
        PowerCalculatingThread t2 = new PowerCalculatingThread(base2, power2);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        result =  t1.getResult().add(t2.getResult());
        return result;
    }

    private static class PowerCalculatingThread extends Thread {
        private BigInteger result = BigInteger.ONE;
        private BigInteger base;
        private BigInteger power;

        public PowerCalculatingThread(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
           /*
           Implement the calculation of result = base ^ power
           */
            result = BigInteger.valueOf(Double.valueOf(Math.pow(base.doubleValue(), power.doubleValue())).longValue());
        }

        public BigInteger getResult() { return result; }
    }
}
