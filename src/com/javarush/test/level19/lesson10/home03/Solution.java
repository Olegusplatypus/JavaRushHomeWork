package com.javarush.test.level19.lesson10.home03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.*;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String line;
        Calendar bd = new GregorianCalendar();
        int size;
        while ((line=reader.readLine())!=null) {
            String name="";
            String[] items = line.split(" ");
            size=items.length;
            bd.set(Integer.parseInt(items[size-1]),Integer.parseInt(items[size-2])-1,Integer.parseInt(items[size-3]));
            for (int i = 0; i <size-3 ; i++)
                name = name+items[i]+" ";
            name= name.trim();
            PEOPLE.add(new Person (name,bd.getTime()));
        }
        reader.close();
    }

}
