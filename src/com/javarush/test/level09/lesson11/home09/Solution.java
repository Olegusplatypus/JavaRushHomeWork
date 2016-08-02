package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
      HashMap<String,Cat> map = new HashMap<String,Cat>();
//        map.put("1",new Cat("1"));//напишите тут ваш код
//        map.put("2",new Cat("2"));//напишите тут ваш код
//        map.put("3",new Cat("3"));//напишите тут ваш код
//        map.put("4",new Cat("4"));//напишите тут ваш код
//        map.put("5",new Cat("5"));//напишите тут ваш код
//        map.put("6",new Cat("6"));//напишите тут ваш код
//        map.put("7",new Cat("7"));//напишите тут ваш код
//        map.put("8",new Cat("8"));//напишите тут ваш код
//        map.put("9",new Cat("9"));//напишите тут ваш код
//        map.put("10",new Cat("10"));//напишите тут ваш код
        Cat cat1= new Cat("апрар"); map.put("Vasilyy1",cat1);
        Cat cat2= new Cat("Vasiрвпарваlyy2"); map.put("Vasilyy2",cat2);
        Cat cat3= new Cat("Vasвапрвilyy3"); map.put("Vasilyy3",cat3);
        Cat cat4= new Cat("Vasвапрваilyy4"); map.put("Vasilyy4",cat4);
        Cat cat5= new Cat("Vasвапрваilyy5"); map.put("Vasilyy5",cat5);
        Cat cat6= new Cat("Vasвапрвilyy6"); map.put("Vasilyy6",cat6);
        Cat cat7= new Cat("Vasваправilyy7"); map.put("Vasilyy7",cat7);
        Cat cat8= new Cat("Vasваправilyy8"); map.put("Vasilyy8",cat8);
        Cat cat9= new Cat("Vasiврарlyy9"); map.put("Vasilyy9",cat9);
        Cat cat10= new Cat("Vasiрвапрlyy0"); map.put("Vasilyy0",cat10);
        return  map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
//      Set<Cat> set = new HashSet<>();
//        for (Map.Entry<String,Cat> pair: map.entrySet())
//            set.add(pair.getKey());
//        return set;
        Set<Cat> set = new HashSet<Cat>();
        for (Map.Entry<String,Cat> pair: map.entrySet() ) {
            set.add(pair.getValue());

        }
        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
