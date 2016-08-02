package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileWriter outputStream  = new FileWriter(fileName);
        ArrayList<String> list = new ArrayList<>();
        while(true)
        {
            String s = reader.readLine();
            String f = s+"\t\n";
            list.add(f);
            if (s.equals("exit"))
            {
                for (String t: list)
                {
                    outputStream.write(t);
                }
                outputStream.close();
                break;
            }

        }



    }
}
