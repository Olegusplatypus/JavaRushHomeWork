package com.javarush.test.level19.lesson10.bonus01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Отслеживаем изменения
Считать в консоли 2 имени файла - file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME
Пример:
оригинальный   редактированный    общий
file1:         file2:             результат:(lines)

строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка4                           REMOVED строка4
строка5        строка5            SAME строка5
строка0                           ADDED строка0
строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка5                           ADDED строка5
строка4        строка4            SAME строка4
строка5                           REMOVED строка5
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args)  {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
    String file1 = reader.readLine();
    String file2 = reader.readLine();
    reader.close();
    List<String> list1 = readFile(file1);
    List<String> list2 = readFile(file2);

    list1.add("");
    list2.add("");
    List<LineItem> Testlines = new ArrayList<LineItem>();
    while (true) {
        if (list1.size() == 0 || list2.size() == 0) {
            break;
        }
        String f1 = list1.get(0);
        String f2 = list2.get(0);

        if (f1.equals(f2)) {
            Testlines.add(new LineItem(Type.SAME, f1));
            list1.remove(0);
            list2.remove(0);
        } else if (list2.size() > 1 && f1.equals(list2.get(1))) {
            Testlines.add(new LineItem(Type.ADDED, f2));
            list2.remove(0);
        } else if (list1.size() > 1 && f2.equals(list1.get(1))) {
            Testlines.add(new LineItem(Type.REMOVED, f1));
            list1.remove(0);
        } else {
            Testlines.clear();
            break;
        }
    }
    if (!Testlines.isEmpty()) {
        Testlines.remove(Testlines.size() - 1);
        lines.addAll(Testlines);
    }
    for (LineItem t : lines) {
        System.out.println(t.type + " " + t.line);
    }
}catch(IOException e) {e.printStackTrace();}
    }
    public static List<String> readFile(String filename) {
        List <String> list = new ArrayList<>();
        try{
        BufferedReader lineReader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line=lineReader.readLine())!=null){
                list.add(line);
            }
            lineReader.close();
         }catch (IOException e) {e.printStackTrace();}
        return list;
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
