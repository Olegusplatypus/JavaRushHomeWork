package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader input = new BufferedReader(new FileReader(fileName));
        ArrayList<Integer> list = new ArrayList<Integer>();
        String text ;
        while ((text=input.readLine())!=null)
        {
            int data = Integer.parseInt(text);
            if (data%2==0) list.add(data);
        }

        Collections.sort(list);
        for (int a:list) {
            System.out.println(a);
        }

    }
}
