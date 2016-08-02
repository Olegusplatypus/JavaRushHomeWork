package com.javarush.test.level22.lesson09.task03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/* Составить цепочку слов
В методе main считайте с консоли имя файла, который содержит слова, разделенные пробелом.
В методе getLine используя StringBuilder расставить все слова в таком порядке,
чтобы последняя буква данного слова совпадала с первой буквой следующего не учитывая регистр.
Каждое слово должно участвовать 1 раз.
Метод getLine должен возвращать любой вариант.
Слова разделять пробелом.
В файле не обязательно будет много слов.

Пример тела входного файла:
Киев Нью-Йорк Амстердам Вена Мельбурн

Результат:
Амстердам Мельбурн Нью-Йорк Киев Вена
*/
public class Solution {
    public static void main(String[] args)  {

       try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader =new BufferedReader(new FileReader(reader.readLine()));
        StringBuilder builder = new StringBuilder();
        while (fileReader.ready()){
            builder.append(fileReader.readLine());
            String words [] = builder.toString().split(" ");
            //...
            StringBuilder result = getLine(words);
            System.out.println(result.toString());
        }}catch (IOException e) {e.printStackTrace();}
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder build = new StringBuilder();
        if (words == null || words.length == 0) return build;
        if (words.length == 1) {
            build.append(words[0].trim());
            return build;}
while (true) {
    Collections.shuffle(Arrays.asList(words));
    boolean isOK = true;
    for (int i = 1; i <words.length ; i++) {
        char lastchar = Character.toLowerCase(words[i-1].charAt(words[i-1].length()-1));
        char firstchar = Character.toLowerCase(words[i].charAt(0));
        if (lastchar!=firstchar) {isOK=false;break;}
    }
    if (isOK) break;

}
                for (String word:words) {
                    build.append(word+" ");
                }
        return build.deleteCharAt(build.length()-1);
    }
}
