package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
     String s = "S";
        int array [] [] = new int [10] [10];//так а зачем тут массив???
        int i =0 ,j = 0;
        while (i<10)
        {
            while (j<10) {
                System.out.print(s);
            j++;
            }
            j=0;
            System.out.println();
            i++;
        }

        //напишите тут ваш код

    }
}
