package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws Exception {

        FileInputStream input = new FileInputStream(args[0]);
        int count = 0;
        while (input.available()>0){
            int a = input.read();
            if ((a>=65 && a<=90)||(a>=97 && a<=122))
                count++;
        }
        input.close();
        System.out.println(count);
    }
}
