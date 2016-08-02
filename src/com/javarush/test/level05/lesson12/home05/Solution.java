package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String h = "сумма";
        int a;
        int summ = 0;
        while (true) {
            String s = reader.readLine();
            if (s.equals(h))
                break;
            else
            a = Integer.parseInt(s);
            summ += a;
        }//напишите тут ваш код
        System.out.println(summ);
    }
}

