package com.javarush.test.level14.lesson08.bonus01;

import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
//        2
        try
        {
            int [] array = new int [20];
            array[21]=5;

        } catch (ArrayIndexOutOfBoundsException e)
        {
            exceptions.add(e);
        }
//        3
        try
        {
            Object [] array = new Integer [20];
            array[10]=5.5;

        } catch (ArrayStoreException e)
        {
            exceptions.add(e);
              }
//        4
    try
        {
            Object i = Integer.valueOf(42);
            String s = (String)i;

        } catch (ClassCastException e)
        {
            exceptions.add(e);
        }
//        5
        try
    {
        int [] array = new int [-2];

    } catch (NegativeArraySizeException e)
    {
        exceptions.add(e);
    }
//6
        try
        {
            int [] array = new int [20];
            array[21]=5;

        } catch (IndexOutOfBoundsException e)
        {
            exceptions.add(e);
        }
//        7
        try
        {
           Object [] o = null;
          int a =o.length;
        }
 catch (NullPointerException e)
        {
            exceptions.add(e);
 }
//    8
            try {
                String s = "FOOBAR";
                int i = Integer.parseInt(s);

            }
            catch (NumberFormatException e) {
                exceptions.add(e);}
        //    9
            try {
                String s=null;
               if (s==null)
                   throw new IllegalStateException();
            }
            catch (IllegalStateException e) {
                exceptions.add(e);}
        //    10
            try {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException e) {
                exceptions.add(e);}
            //Add your code here
        }
    }

