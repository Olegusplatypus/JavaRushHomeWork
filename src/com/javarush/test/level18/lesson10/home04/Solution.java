package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream input1 = new FileInputStream(file1);
        FileInputStream input2 = new FileInputStream(file2);
        reader.close();

        byte [] a = new byte [input1.available()];
        byte [] b = new byte [input2.available()];
        input1.read(a);
        input2.read(b);


        FileOutputStream output = new FileOutputStream(file1,false);
        output.write(b);
        output = new FileOutputStream(file1,true);
        output.write(a);

            input1.close();
            input2.close();
            output.close();
    }
}
