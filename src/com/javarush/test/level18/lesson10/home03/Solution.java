package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        reader.close();
        FileInputStream input2 = new FileInputStream(file2);
        FileInputStream input3 = new FileInputStream(file3);
        FileOutputStream output1 = new FileOutputStream(file1);

        byte [] a = new byte [input2.available()];
        byte [] b = new byte [input3.available()];
        while (input2.available()>0){
            output1.write(a,0,input2.read(a));}
        while (input3.available()>0){
            output1.write(b,0,input3.read(b));}

            input2.close();
            input3.close();
        output1.close();

    }
}
