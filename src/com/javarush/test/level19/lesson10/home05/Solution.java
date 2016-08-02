package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
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
                for (char ch : item.toCharArray()) {
                    if (Character.isDigit(ch)) {
                        list.add(item + " ");
                        break;
                    }
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for (String item:list) {
            builder.append(item);
        }
        FileWriter writer = new FileWriter(args[1]);
        writer.write(builder.toString());
        reader.close();
        writer.close();
    }}

