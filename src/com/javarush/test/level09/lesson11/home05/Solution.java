package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> vowels = new ArrayList<Character>();
        ArrayList<Character> constsnts = new ArrayList<Character>();
        String text = sc.nextLine();
        char[] CharArray = text.toCharArray();
        for (int i = 0; i < CharArray.length; i++) {
            if (isVowel(CharArray[i]))
                vowels.add(CharArray[i]);
            else if (CharArray[i] == ' ')
                continue;

            else constsnts.add(CharArray[i]);
        }//напишите тут ваш код
        for (char a : vowels) {
            System.out.print(a + " ");}
            System.out.println();
            for (char b : constsnts) {
                System.out.print(b + " ");
            }
        }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
