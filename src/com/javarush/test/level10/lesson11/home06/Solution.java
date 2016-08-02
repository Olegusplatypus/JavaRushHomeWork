package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
      String name;
        int age;
        int weigth;
        boolean sex;
        String intellect;
        boolean kinoteist;
        Human(String name,String kinoteist){}
        Human(String name,int age, int weigth ){}
        Human(String name,int age, int weigth, boolean sex  ){}
        Human(String name,int age, int weigth, boolean sex,   boolean kinoteist ){}
        Human(String name,int age, int weigth, boolean sex,   boolean kinoteist,  String intellect){}
        Human(String name,int age, boolean kinoteist){}
        Human(String name,int age, int weigth, boolean sex,    String intellect){}
        Human(String name,int age, int weigth,  String intellect){}
        Human(String name,int age,  String intellect){}
        Human(String name,int age){}
        //напишите тут ваши переменные и конструкторы
    }
}
