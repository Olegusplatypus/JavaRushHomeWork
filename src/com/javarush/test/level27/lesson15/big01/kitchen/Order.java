package com.javarush.test.level27.lesson15.big01.kitchen;

import com.javarush.test.level27.lesson15.big01.ConsoleHelper;
import com.javarush.test.level27.lesson15.big01.Tablet;

import java.util.List;

/**
 * Created by Oleg on 18.07.2016.
 */
public class Order {
private List<Dish> dishes;
    private Tablet tablet;

    public Order(List<Dish> dishes, Tablet tablet) {
        this.dishes = ConsoleHelper.getAllDishesForOrder();
        this.tablet = tablet;
    }

    @Override
    public String toString()     {
        return dishes.size()>0 ? String.format("Your order: %s of %s", dishes, tablet) : "";
    }

}
