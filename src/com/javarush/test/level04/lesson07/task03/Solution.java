package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
     Scanner sc = new Scanner(System.in);
        int a = sc.nextInt ();
        int b = sc.nextInt ();
        int c = sc.nextInt ();
        int a1 = (a > 0) ? 1 : 0;
        int b1 = (b > 0) ? 1 : 0;
        int c1 = (c > 0) ? 1 : 0;
        System.out.println(a1+b1+c1);
    }
}
