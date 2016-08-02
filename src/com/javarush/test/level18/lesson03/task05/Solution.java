package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream input = new FileInputStream(reader.readLine());
            Map<Integer,Integer> map = new HashMap<>();
            List<Integer> list = new ArrayList<>();
            while (input.available() > 0) {
                int  key = input.read();
                 map.put(key, 1);}
            for (Integer key:map.keySet()) {
                list.add(key);
            }
            reader.close();
            input.close();

            for (int i = list.size()-1; i > 0 ; i--) {
                for (int j = 0; j < i ; j++) {
                    if (list.get(j)>list.get(j+1))
                    {
                        int t = list.get(j);
                        list.set(j,list.get(j+1));
                        list.set(j+1,t);
                    }
                }
            }
            for (int a:list)
                  {
                      System.out.print(a+" ");
            }

        }catch (Exception e) {e.printStackTrace();}
    }
    }

