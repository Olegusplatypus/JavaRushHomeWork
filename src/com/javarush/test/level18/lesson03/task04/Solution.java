package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream input = new FileInputStream(reader.readLine());
            Map<Integer,Integer> map = new HashMap<>();
            int min=0;
            while (input.available() > 0) {
                int  key = input.read();
                min++;
                if (map.containsKey(key)) {
                    int value = map.get(key);
                    map.put(key, ++value);
                }
                else { map.put(key, 1);}
                for (Integer a : map.values()) {
                    if (a<min) min=a;}
            }
            for (Map.Entry<Integer,Integer> pair: map.entrySet()) {
//                System.out.println(pair.getKey()+":"+pair.getValue());
                if ((pair.getValue()).equals(min))
                {
                    System.out.println(pair.getKey()+" ");
                }
            }
            input.close();
        }catch (Exception e) {e.printStackTrace();}
    }
    }

