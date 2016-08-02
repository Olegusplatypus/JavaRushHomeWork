package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();
        if (args[0].equals("-d")) deleteItem(args, filename);
        else if (args[0].equals("-u")) updateItem(args, filename);
        else return;
    }

    public static void deleteItem(String[] args, String filename) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            if (!(line.substring(0, 8).trim()).equals(args[1]))
                lines.add(line);
        }
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
        for (String item : lines) {
            writer.println(item);
        }
        reader.close();
        writer.close();

    }

    public static void updateItem(String[] args, String filename) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        List<String> lines = new ArrayList<>();
        String line;
        StringBuilder result = new StringBuilder();
        while ((line = reader.readLine()) != null)
            lines.add(line);
        StringBuilder id = new StringBuilder(SetSpace(args[1],8));
        result.append(id).append(getName(args)).append(getPrice(args)).append(getQuantity(args));

        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
        for (String item : lines) {
            if  (item.substring(0,8).equals(id.toString()))
            lines.set(lines.indexOf(item),result.toString());
        }
        for (String item : lines) {
                     System.out.println(item);
            writer.println(item);
        }
        reader.close();
        writer.close();
    }
    public static StringBuilder getName(String[] args) {
        StringBuilder name = new StringBuilder();
        for (int i = 2; i < args.length - 2; i++)
            name.append(args[i] + " ");
        name = SetSpace(name.toString(), 30);
        return name;
    }

    public static StringBuilder getPrice(String[] args) {
        StringBuilder price = new StringBuilder();
        price.append(SetSpace(args[args.length - 2], 8));
        return price;
    }

    public static StringBuilder getQuantity(String[] args) {
        StringBuilder quantity;
        quantity = SetSpace(args[args.length - 1], 4);
        return quantity;
    }

        public static StringBuilder SetSpace(String prebuilder, int size) {
        StringBuilder aftersetting = new StringBuilder(prebuilder);
        if (prebuilder.length() < size)
            while (aftersetting.length() < size) {
                aftersetting.append(" ");
            }
        else if (prebuilder.length() > size)
            aftersetting.delete(size, aftersetting.length());
        return aftersetting;
    }
}


