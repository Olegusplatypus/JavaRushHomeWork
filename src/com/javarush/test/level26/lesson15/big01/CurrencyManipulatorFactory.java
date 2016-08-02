package com.javarush.test.level26.lesson15.big01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Oleg on 08.06.2016.
 */
public final class CurrencyManipulatorFactory {
    private CurrencyManipulatorFactory() {
    }

    static HashMap<String, CurrencyManipulator> map = new HashMap<>();
    static boolean isExist = false;
    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode){
        isExist = false;
        CurrencyManipulator current;

        if (map.containsKey(currencyCode))
            return map.get(currencyCode);
        else {
            current = new CurrencyManipulator(currencyCode);
            map.put(currencyCode, current);
            return current;
        }
    }
    public static Collection getAllCurrencyManipulators(){
        Collection<CurrencyManipulator> list = new ArrayList<>();
        for (CurrencyManipulator item:map.values()) {
            list.add(item);
        }
        return list;
    }
}
