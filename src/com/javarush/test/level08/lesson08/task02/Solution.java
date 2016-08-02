package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static void main(String[] args) {                //этот метод добавлен исключительно для вывода на экран
        System.out.println(removeAllNumbersMoreThan10(createSet()));
    }
    public static HashSet<Integer> createSet()
    {
       HashSet<Integer> set = new HashSet<Integer>();
        {

            for (int i = 3; i <23 ; i++) {
                set.add(i);
            }
        }//напишите тут ваш код
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {


        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
        {
            int a = iterator.next();
            if(a>10)
               iterator.remove();
        }
        return set;
    }
}
