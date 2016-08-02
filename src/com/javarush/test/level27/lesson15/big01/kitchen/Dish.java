package com.javarush.test.level27.lesson15.big01.kitchen;

import java.util.Arrays;

/**
 * Created by Oleg on 18.07.2016.
 */
public enum Dish {
    Fish, Steak, Soup, Juice, Water;

    public static String allDishesToString(){
       return Arrays.toString(values()).substring(1, Arrays.toString(values()).length() - 1);
    }
}
