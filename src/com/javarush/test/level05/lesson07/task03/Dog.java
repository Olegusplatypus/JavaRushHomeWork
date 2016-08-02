package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    String name;
    int growth;
    String colour;
    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int age) {
        this.name = name;
        this.growth = age;
    }
    public void initialize(String name, int age, String sex) {
        this.name = name;
        this.growth = age;
        this.colour = sex;
    }
    //напишите тут ваш код

}
