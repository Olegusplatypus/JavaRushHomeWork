package com.javarush.test.level07.lesson04.task02;

import java.util.Scanner;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
     String [] array = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length-2 ; i++) {
            array[i]= sc.nextLine();
        }
        for (int i = 1; i <= array.length  ; i++) {
            System.out.println(array[array.length-i]);
        }//напишите тут ваш код

    }
}