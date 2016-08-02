package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read= new BufferedReader(new InputStreamReader(System.in));
        String t = read.readLine();
        FileReader reader = new FileReader(t);
        FileWriter writer = new FileWriter(read.readLine());
        StringBuilder builder = new StringBuilder();
        while (reader.ready())
        {
           char ch = (char) reader.read();
            builder.append(ch);
        }

        String [] array = (builder.toString()).split(" ");
        builder = new StringBuilder();
        System.out.println(array.toString());
        for (String item:array) {
            if(Solution.checkStringtoInt(item)) {
                builder.append(item+" ");
            }
        }
        writer.write(builder.toString());
        read.close();
        reader.close();
        writer.close();


    }
    public static boolean checkStringtoInt(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }

        return true;

}
}
