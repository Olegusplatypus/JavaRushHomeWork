package com.javarush.test.level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String text = outputStream.toString();
        System.setOut(console);
        toCalculate(text);
    }
    public static void toCalculate(String text){
        String array [] = text.split(" ");
        if (array[1].equals("+"))
            System.out.println(array[0]+" + "+array[2] + " = "+(Integer.parseInt(array[0])+ Integer.parseInt(array[2])));
        else if (array[1].equals("-"))    System.out.println(array[0]+" - "+array[2] + " = "+(Integer.parseInt(array[0])- Integer.parseInt(array[2])));
        else if (array[1].equals("*"))  System.out.println(array[0]+" * "+array[2] + " = "+(Integer.parseInt(array[0])* Integer.parseInt(array[2])));
        }
    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

