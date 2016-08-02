package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        List<String> list = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            String array[] = line.split(" ");
            for (String item : array) {
             if(item.length()>6) list.add(item+",");
                    }
                }
        StringBuilder builder = new StringBuilder();
        for (String item:list) {
            builder.append(item);
        }
        builder.deleteCharAt(builder.length()-1);
        FileWriter writer = new FileWriter(args[1]);
        writer.write(builder.toString());
        reader.close();
        writer.close();
    }}


