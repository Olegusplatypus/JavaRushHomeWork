package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution {
    public static HashSet<String> createSet() {
        Set<String> set = new HashSet<String>();
        {
            set.add("Ложь");
            set.add("Лаа");
            set.add("Лап");
            set.add("Лар");
            set.add("Ладья");
            set.add("Локон");
            set.add("Лакон");
            set.add("Лара");
            set.add("Лад");
            set.add("Лапа");
            set.add("Лыжа");
            set.add("Лдан");
            set.add("Ладно");
            set.add("Лист");
            set.add("Лира");
            set.add("Лоно");
            set.add("Лады");
            set.add("Лагн");
            set.add("Ланос");
            set.add("Лось");
            //напишите тут ваш код

        }
        return (HashSet<String>)set;
    }
}
