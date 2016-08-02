package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream input = new FileInputStream(args[0]);
       final  Map<Character, Integer> map = new TreeMap<Character, Integer>() {
       };
        while (input.available() > 0) {
            char key = (char) input.read();
            if (map.containsKey(key)) {
                int value = map.get(key);
                map.put(key, ++value);
            } else {
                map.put(key, 1);
            }
        }
        for (Map.Entry<Character, Integer> pair : map.entrySet())
        {
            System.out.println((pair.getKey()) + " " + pair.getValue());
        }
        input.close();
    }
}

