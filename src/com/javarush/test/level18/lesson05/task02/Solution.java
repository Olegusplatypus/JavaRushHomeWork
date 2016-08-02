package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream stream = new FileInputStream(reader.readLine());
            int count = 0;
        while(stream.available()>0) {
            int a = stream.read();
            if (a == (int)',') count++;
        }
            System.out.println(count);
            reader.close();
            stream.close();

    }
}
