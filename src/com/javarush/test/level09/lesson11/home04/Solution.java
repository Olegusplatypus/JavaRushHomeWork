package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
     Scanner sc = new Scanner (System.in);
        String text = sc.nextLine();
        SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy",Locale.ENGLISH);  //создание формата даты для чтения с клавиатуры
        Date docDate= format1.parse(text);                                        //преобразование текста в дату
        SimpleDateFormat format2 = new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH); //создание нового формата даты для окончательного вывода на экран
        String text1 = format2.format(docDate);                                      //преобразование нового формата даты в строку для вывода на экран

       text1 = text1.toUpperCase();

        System.out.println(text1);//напишите тут ваш код
    }
}
