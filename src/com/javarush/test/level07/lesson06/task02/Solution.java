package com.javarush.test.level07.lesson06.task02;

import java.util.ArrayList;
import java.util.Scanner;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String s = sc.nextLine();
            list.add(s);
        }
        String first = list.get(0);
        int max = first.length();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                String text = list.get(j);
                int var = text.length();
                if (var > max) {
                    max = var;
                }
            }
            String unic = list.get(i);
            int ab = unic.length();
            if (ab >= max) {
                System.out.println(unic);
            }
        }
    }
}//напишите тут ваш к