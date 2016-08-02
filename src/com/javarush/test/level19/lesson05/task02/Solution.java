package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        BufferedReader toread = new BufferedReader(new FileReader(reader.readLine()));
        String line;
        int counter=0;
        while ((line=toread.readLine())!=null)
        {
            String [] arr = line.split("world");
            counter+=arr.length-1;
        }
        System.out.println(counter);
        toread.close();
        reader.close();

    }
}
