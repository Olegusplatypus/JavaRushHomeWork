package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream input = new FileInputStream(file1);
        FileOutputStream output = new FileOutputStream(file2);
        reader.close();

      while(input.available()>0){
          byte [] data = new byte[input.available()];
          input.read(data);
          output.write(getCount(data));
      }
        input.close();
        output.close();


    }
    public static byte [] getCount(byte[] data){
        StringBuilder builder = new StringBuilder();
        String[] textar = new String(data).split(" ");
        for (String element:textar)
             {
                 builder.append(Math.round(Double.parseDouble(element))).append(" ");
        }
        byte [] finaly = builder.toString().getBytes();
        return finaly;

    }
}
