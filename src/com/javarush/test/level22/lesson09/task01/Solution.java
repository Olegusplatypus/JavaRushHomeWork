package com.javarush.test.level22.lesson09.task01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример содержимого файла
рот тор торт о
о тот тот тот
Вывод:
рот тор
о о
тот тот
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader =new BufferedReader(new FileReader(reader.readLine()));
        StringBuilder builder = new StringBuilder();
        while (fileReader.ready())
        {
            builder.append(fileReader.readLine()+" ");
        }
        String arr []= builder.toString().split(" ");
        for (int i = 0; i < arr.length - 1; i++)
        {
            String word = arr[i];
            for (int j = i+1; j <arr.length ; j++) {
                StringBuilder b = new StringBuilder(word);
                String rev = b.reverse().toString();
                if (rev.equals(arr[j])&& i!=j && !rev.equals("") && !arr[i].equals(" ") && !arr[j].equals(" "))
                {
                    Pair pair = new Pair();
                    pair.first=word;
                    pair.second=rev;
                    result.add(pair);
                    word="";
                    arr[j]="";
                    arr[i]="";
                }}
            }
        for (Pair pair:result) {
            System.out.println(pair);
        }

    }

    public static class Pair {
        String first;
        String second;


        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
