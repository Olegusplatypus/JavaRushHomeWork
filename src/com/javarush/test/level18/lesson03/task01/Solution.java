package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       try {
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           FileInputStream input = new FileInputStream(reader.readLine());
           int max = 0;
           while (input.available() > 0) {
               int a = input.read();
              if (a>max) max=a;
           }
           System.out.println(max);
           input.close();
       }catch (Exception e) {e.printStackTrace();}
    }
}
