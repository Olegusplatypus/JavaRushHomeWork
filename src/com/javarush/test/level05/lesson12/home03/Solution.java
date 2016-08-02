package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Cat cat = new Cat("Tom", 13 , 6, 4);
        Dog dog = new Dog("Wolf", 13 , 6, 4);
        //напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog
    {
        String name;
        int height;
        int tail;
        int dumb;

        public Dog(String name, int height, int tail, int dumb)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
            this.dumb = dumb;
        }
    }
    public static class Cat
    {
        String name;
        int height;
        int tail;
        int kill;

        public Cat(String name, int height, int tail, int kill)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
            this.kill = kill;
        }
    }//добавьте тут ваши классы

}
