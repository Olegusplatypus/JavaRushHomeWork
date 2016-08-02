package com.javarush.test.level07.lesson06.task05;

import java.util.ArrayList;
import java.util.Scanner;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();  //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add (sc.nextLine());
        }
        int G=0;//можно было сделать и циклом for, так сделал для разнообразия.
                while(G<13){
        String a = list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0,a);
              G++;
        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }    //напишите тут ваш код

    }

