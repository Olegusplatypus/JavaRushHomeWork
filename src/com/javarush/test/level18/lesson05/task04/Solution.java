package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();
        FileInputStream inStream = new FileInputStream(f1);
        FileOutputStream outStream = new FileOutputStream(f2);

        byte[] array = new byte[inStream.available()];

        while (inStream.available() > 0) {
            int count = inStream.read(array);
// making array reverse
        for (byte i = 0; i < (array.length) / 2; i++) {
            array[i] = (byte) (array[i] + array[array.length - 1 - i]);
            array[array.length - 1 - i] = (byte) (array[i] - array[array.length - 1 - i]);
            array[i] = (byte) (array[i] - array[array.length - 1 - i]);}

            outStream.write(array,0,count);
    }
        reader.close();
        inStream.close();
        outStream.close();

    }
    }

