package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception{
        Map<String,Double> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String line;
        double maxValue=0;
        while ((line=reader.readLine())!=null)
        {
            String arr [] = line.split(" ");
            if (map.containsKey(arr[0]))
            {double value = map.get(arr[0]);
                double summ = value+Double.parseDouble(arr[1]);
                if(summ>maxValue) maxValue=summ;
                map.put(arr[0],summ);}
            else {
                double value = Double.parseDouble(arr[1]);
                map.put(arr[0], value);
                if (maxValue<value) maxValue = value;
            }
        }
        reader.close();
        for (Map.Entry<String,Double> entry:map.entrySet()) {
            if(entry.getValue().equals(maxValue))
            System.out.println(entry.getKey());
        }
    }
}
