package com.javarush.test.level19.lesson10.home08;

/* Перевертыши
1 Считать с консоли имя файла.
2 Для каждой строки в файле:
2.1 переставить все символы в обратном порядке
2.2 вывести на экран
3 Закрыть потоки. Не использовать try-with-resources

Пример тела входного файла:
я - программист.
Амиго

Пример результата:
.тсиммаргорп - я
огимА
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader namereader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(namereader.readLine()));
        List<String> list = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null)
        {
            StringBuilder builder = new StringBuilder(line);
            list.add(builder.reverse().toString());
        }
        for (String item: list)
        {
            System.out.println(item);
        }
        namereader.close();
        reader.close();
    }
}
