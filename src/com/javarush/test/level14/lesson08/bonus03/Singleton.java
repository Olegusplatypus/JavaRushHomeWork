package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Oleg on 02.03.2016.
 */
public final class Singleton {
    private static final  Singleton _instance = new Singleton();
    private Singleton() {}
public static Singleton getInstance(){return _instance;}
}
