package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream input = new FileInputStream(reader.readLine());
            int min=10000;
            while (input.available() > 0) {
                int a = input.read();
                if (a<min) min=a;
            }
            System.out.println(min);
            input.close();
        }catch (Exception e) {e.printStackTrace();}
    }
    }

