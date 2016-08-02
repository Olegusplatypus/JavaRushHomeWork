package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      try{ String url = reader.readLine();
          String afterQuestionMark = url.substring(url.indexOf('?')+1);
      String [] array= afterQuestionMark.split("&");
         List<String> values = new ArrayList<>();
         List<String> keys = new ArrayList<>();
          for (String element:array) {
              if(element.contains("="))
              {
                  String [] separates = element.split("=");
                  keys.add(separates[0]);
                  if(separates[0].equals("obj")) {
                      values.add(separates[1]);
                  }
              }
              else{keys.add(element);}
          }
          for (String a:keys) {System.out.print(a+" ");}

          if (!values.isEmpty()) doObj(values);
      }
      catch (Exception e){e.printStackTrace();
      }
    }
    public static void doObj(List <String> list) {
        System.out.println("");
        for (String obj : list) {
            try {
                alert(Double.parseDouble(obj));
            } catch (Exception e) {
                alert(obj);
            }
        }
    }
    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
