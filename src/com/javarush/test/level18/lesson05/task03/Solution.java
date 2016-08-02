package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();
        String f3 = reader.readLine();
        FileInputStream inStream = new FileInputStream(f1);
        FileOutputStream out1 = new FileOutputStream(f2);
        FileOutputStream out2 = new FileOutputStream(f3);

        byte [] array1 = new byte[(inStream.available()+1)/2];
        byte [] array2 = new byte[(inStream.available())/2];
        while(inStream.available()>0){
         int count =  inStream.read(array1);
            out1.write(array1,0,count);
            int count2 = inStream.read(array2);
            out2.write(array2,0,count2);
        }
        reader.close();
        inStream.close();
        out1.close();
        out2.close();
    }
}
