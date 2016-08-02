package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    String name;
    int growth;
    String colour;
    Dog(String name){
        this.name = name;
    }
    Dog(String name, int age) {
        this.name = name;
        this.growth = age;
    }
    Dog(String name, int age, String sex) {
        this.name = name;
        this.growth = age;
        this.colour = sex;
    }  //напишите тут ваш код

}
