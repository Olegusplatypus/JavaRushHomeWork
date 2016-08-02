package com.javarush.test.level27.lesson15.big01;


import com.javarush.test.level27.lesson15.big01.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg on 18.07.2016.
 */
public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static String readString(){
        String text = null;
        try {
            text = reader.readLine();
        }catch (IOException ignored){}
        return text;
    }
    public static void writeMessage(String message){
        System.out.println(message);
    }
    public static List<Dish> getAllDishesForOrder() throws IllegalArgumentException {
        List<Dish> list = new ArrayList<>();
        writeMessage("Choose a dish, please");
        String string = null;
        Dish dish;
        while (!string.equals("exit")) {

                string = readString();
                dish = Dish.valueOf(string);
                list.add(dish);
        }
        return list;
        }
    }

