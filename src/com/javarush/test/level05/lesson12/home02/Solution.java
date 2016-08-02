package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("jo",23,"dfsd");  //создай по два объекта каждого класса тут
        Man man2 = new Man("joel",45,"dfsdf");  //создай по два объекта каждого класса тут
        Woman woman1 = new Woman("jordan",32,"dfsd");  //создай по два объекта каждого класса тут
        Woman woman2 = new Woman("joan",54,"dfsd");  //создай по два объекта каждого класса тут

        System.out.println(man1.name + " " + man1.age + " " + man1.address); //выведи их на экран тут
        System.out.println(man2.name + " " + man2.age + " " + man2.address); //выведи их на экран тут
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address); //выведи их на экран тут
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address); //выведи их на экран тут
    }

    public static class Man {
        String name;
        int age;
        String address;


        Man(String name, int age ,String address ) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

    }

    public static class Woman {
        String name;
        String address;
        int age;

        Woman(String name, int age ,String address ) {
            this.name = name;
            this.address = address;
            this.age = age;
        }


        //добавьте тут ваши классы
    }
}