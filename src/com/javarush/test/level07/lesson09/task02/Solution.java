package com.javarush.test.level07.lesson09.task02;

import java.util.ArrayList;
import java.util.Scanner;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextLine());
        }
        list.remove(2);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(list.size()-1-i));
        }
    }
}
