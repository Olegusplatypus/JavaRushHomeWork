package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args)throws Exception{
        FileInputStream input = new FileInputStream(args[0]);
        int countAll=0;
        int countSpace=0;
        while (input.available()>0){
            int read = input.read();
            countAll++;
            if (read==32) countSpace++;
        }
        input.close();
        int a = (int) ((double)countSpace*100/countAll*100);
        double b = (double) a/100;
        System.out.println(b);


    }
}
