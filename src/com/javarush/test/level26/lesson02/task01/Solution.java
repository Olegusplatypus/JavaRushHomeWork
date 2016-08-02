package com.javarush.test.level26.lesson02.task01;

import java.util.Arrays;
import java.util.Comparator;

/* Почитать в инете про медиану выборки
Реализовать логику метода sort, который должен сортировать данные в массиве по удаленности от его медианы
Вернуть отсортированный массив от минимального расстояния до максимального
Если удаленность одинаковая у нескольких чисел, то выводить их в порядке возрастания
*/
public class Solution {
    public static void main(String[] args) {
        Integer array [] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Before sort");
        System.out.println(Arrays.asList(array));
        sort(array);
        System.out.println("After sort");
        System.out.println(Arrays.asList(array));
    }
    public static Integer[] sort(Integer[] array) {
      Arrays.sort(array);

        final int median;
        if (array.length %2 != 0)
            median = array[(array.length - 1)/2];
        else
            median = (array[(array.length)/2 - 1] + array[(array.length)/2])/2;
        Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer n1, Integer n2) {
               int distance = Math.abs(n1 - median) - Math.abs(n2 - median);
                if (distance == 0)
                    return n1-n2;
                else
                    return distance  ;
            }
        };
        Arrays.sort(array,comparator);
        //implement logic here
        return array;
    }
}
