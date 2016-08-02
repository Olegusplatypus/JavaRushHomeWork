package com.javarush.test.level26.lesson15.big01;

import com.javarush.test.level26.lesson15.big01.exception.NotEnoughMoneyException;

import java.util.*;

/**
 * Created by Oleg on 08.06.2016.
 */
public class CurrencyManipulator {
    private String currencyCode;
    private Map<Integer, Integer> denominations = new HashMap<>();

    public String getCurrencyCode() {
        return currencyCode;
    }

    public CurrencyManipulator(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    public  void addAmount(int denomination, int count){
        if(denominations.containsKey(denomination))
            denominations.put(denomination, denominations.get(denomination) + count);
        else
            denominations.put(denomination,count);
    }

    public Map<Integer, Integer> getDenomination() {
        return denominations;
    }
    public int getTotalAmount(){
        int result = 0;
        for(Map.Entry<Integer,Integer> pair : denominations.entrySet())
            result = result + (pair.getKey() * pair.getValue());

        return result;
    }
    public boolean hasMoney(){
        return (getTotalAmount() != 0);
    }
    public boolean isAmountAvailable(int expectedAmount){
        return (getTotalAmount() >= expectedAmount);
    }
    public Map<Integer, Integer> withdrawAmount(int expectedAmount) throws NotEnoughMoneyException{

        Map<Integer,Integer> copy = new TreeMap<>(Collections.<Integer>reverseOrder());
        Map<Integer, Integer> result = new TreeMap<>(Collections.<Integer>reverseOrder());

        copy.putAll(denominations);
        for (Map.Entry<Integer,Integer> entry:copy.entrySet()) {
            while (true) {
                if (expectedAmount < entry.getKey() || entry.getValue() <= 0)
                    break;
                expectedAmount -= entry.getKey();
                copy.put(entry.getKey(), entry.getValue() - 1);
                if (result.containsKey(entry.getKey()))
                    result.put(entry.getKey(), result.get(entry.getKey()) + 1);
                else
                    result.put(entry.getKey(), 1);
            }
        }
            if (expectedAmount > 0)
                throw new NotEnoughMoneyException();
        denominations.putAll(copy);
        return result;
    }
}
