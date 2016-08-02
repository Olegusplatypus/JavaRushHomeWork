package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args[0].equals("-c")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String filename = reader.readLine();
            reader.close();

            StringBuilder result = new StringBuilder();
            result.append(getID(filename)).append(getName(args)).append(getPrice(args)).append(getQuantity(args));
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(filename, true)));
            output.println(result);
            output.close();
        } else return;
    }
    public static StringBuilder getName(String[] args) {
        StringBuilder name = new StringBuilder();
        for (int i = 1; i < args.length - 2; i++)
            name.append(args[i] + " ");
        name = SetSpace(name.toString(),30);
        return name;
    }
    public static StringBuilder getPrice(String[] args) {
        StringBuilder price = new StringBuilder();
        price.append(SetSpace(args[args.length - 2],8));
        return price;
    }

    public static StringBuilder getQuantity(String[] args) {
        StringBuilder quantity;
        quantity= SetSpace(args[args.length - 1],4);
        return quantity;
    }

    public static StringBuilder getID(String filename) throws Exception {
        BufferedReader readline = new BufferedReader(new FileReader(filename));
        StringBuilder id = new StringBuilder();
        long maxID = 0;
        String line;
        while ((line = readline.readLine()) != null) {
            id.append(line.substring(0, 8).replaceAll("\\s",""));
            long a = Long.parseLong(id.toString());
            if (maxID < a) maxID = a;
            id.delete(0, id.length());
        }
        maxID++;
        id.append(maxID);
        id=SetSpace(id.toString(),8);
        readline.close();
        return id;
    }
    public static StringBuilder SetSpace (String prebuilder, int size){
        StringBuilder aftersetting=new StringBuilder(prebuilder);
        if (prebuilder.length()<size)
            while (aftersetting.length() < size) {
                aftersetting.append(" ");}
            else if (prebuilder.length()>size)
            aftersetting.delete(size, aftersetting.length());
        return aftersetting;
    }
    }


