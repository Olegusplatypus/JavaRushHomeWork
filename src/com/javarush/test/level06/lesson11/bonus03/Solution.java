package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int [] nums = new int [5];
        for (int i = 0; i <nums.length ; i++) {
            nums [i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i <nums.length ; i++) {
            int min = nums[i];
            int min_i = i;
            for (int j = i+1; j <nums.length ; j++) {
if (nums [j]<min){
    min=nums[j];
    min_i=j;
}
            }
if (i!=min_i){
    int tmp = nums[i];
    nums[i]=nums[min_i];
    nums[min_i]= tmp;
}
            System.out.println(nums[i]);
        }
        //напишите тут ваш код
    }
}
