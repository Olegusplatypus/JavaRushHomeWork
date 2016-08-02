package com.javarush.test.level05.lesson05.task04;
import com.javarush.test.level05.lesson05.task01.*;
/* Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
*/

public class Solution {
    public static void main(String[] args) {

        Cat cat1 = new Cat("wfeddsgv",6,4,2);
        Cat cat2 = new Cat("dsasd",3,5,4);
        Cat cat3 = new Cat("dsas",1,3,4);
        //напишите тут ваш код
    }

    public static class Cat {

        public static int count = 0;
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
