package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());  //напишите тут ваш код
        int b = Integer.parseInt(reader.readLine());  //напишите тут ваш код
        int c = Integer.parseInt(reader.readLine());   //напишите тут ваш код
        int x;
if (a!=b && a!=c)
    x = 1;
        else
    if (a!=b && b!=c)
        x = 2;
        else x = 3;
        System.out.println(x);
    }
}
