package com.javarush.test.level07.lesson04.task01;

import java.io.IOException;
import java.util.Scanner;

/* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
       int [] array = new int[20];
        Scanner sc = new Scanner(System.in);
        int a;
        for (int i = 0; i <array.length ; i++) {
            a = sc.nextInt();
            array[i]=a;
        }//Инициализируйте (создайте и заполните) массив тут
        return array;
    }

    public static int max(int[] array) {
       int max=array[0];
        for (int i = 1; i <array.length ; i++) {
            if(array[i]>max){
                max = array[i];
            }
        } //Найдите максимальное значение в этом методе
        return max;
    }
}
