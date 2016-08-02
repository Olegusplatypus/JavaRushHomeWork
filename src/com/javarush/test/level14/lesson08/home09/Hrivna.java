package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Oleg on 01.03.2016.
 */
public class Hrivna extends Money {
    public String getCurrencyName() {
        return "HRN";
    }
    public Hrivna (double amount){super(amount);}
    public double getAmount(){return super.getAmount();};
}

