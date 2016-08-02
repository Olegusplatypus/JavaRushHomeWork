package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        //reading and sorting filenames
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file;
       List<String> list = new ArrayList<>();
        while (!(file = reader.readLine()).equals("end")) {
           list.add(file);
        }
        reader.close();
        Collections.sort(list);

        //reading and writing data
        String path = list.get(0).substring(0,list.get(0).lastIndexOf(".part"));
        File resultFile = new File(path);
        FileOutputStream output = new FileOutputStream(resultFile);

        for (String item:list) {
            FileInputStream input=new FileInputStream(item);
            byte [] bytes = new byte[input.available()];
           while(input.available()>0){
             input.read(bytes);
               output.write(bytes);
           }
            input.close();
        }
        output.close();


    }
}