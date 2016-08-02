package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String k = reader.readLine();
        int l = Integer.parseInt(k);
        if (l >= 1 && l <= 7) {
            String day;
            switch (l) {
                case 1:
                    day = "понедельник";
                    System.out.println(day);
                    break;
                case 2:
                    day = "вторник";
                    System.out.println(day);
                    break;
                case 3:
                    day = "среда";
                    System.out.println(day);
                    break;
                case 4:
                    day = "четверг";
                    System.out.println(day);
                    break;
                case 5:
                    day = "пятница";
                    System.out.println(day);
                    break;
                case 6:
                    day = "суббота";
                    System.out.println(day);
                    break;
                case 7:
                    day = "воскресенье";
                    System.out.println(day);
                    break;
                default:
                    break;
            }
        }
            else
            System.out.println("такого дня недели не существует");
        //напишите тут ваш код

    }

}