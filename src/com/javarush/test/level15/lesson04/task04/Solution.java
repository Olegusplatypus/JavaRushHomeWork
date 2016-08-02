package com.javarush.test.level15.lesson04.task04;

/* Мужчина или женщина?
1. В методе main создать 2 человека man и woman. man с типом Man, woman с типом Woman.
2. Изменить метод printName так, чтобы он выполнялся для man и woman.
3. Реализация метода printName должна быть одна.
*/

public class Solution {
    public static void main(String[] args) {
      Man  man = new Man("vfds");
        Woman woman = new Woman("dfvfg");

        printName(man);
        printName(woman);
    }

    public static void printName(Human ob) {
        System.out.println(ob);
    }

    public static class Human {
        public String name;
        Human (String name){this.name=name;}

    }

    public static class Man extends Human {
        Man (String name){super(name);}
    }

    public static class Woman extends Human {
        Woman (String name){super(name);}
    }
}
