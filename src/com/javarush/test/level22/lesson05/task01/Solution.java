package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        int countSpaces=0;
        int fourthSpace=0;
        int fifthSpace=0;
            if (string==null) throw new TooShortStringException();
            else {
                for (int i = 0; i <string.length() ; i++) {
                    if (string.charAt(i)==' ') {
                        countSpaces++;
                        if (countSpaces==4) fourthSpace=i;
                    }
                    if (countSpaces==5) {fifthSpace=i; break;}
                }
                if (countSpaces<4) throw new TooShortStringException();
                else if (fifthSpace==0) fifthSpace=string.length();
                else if (fifthSpace==fourthSpace+1) fifthSpace++;
        }
        return string.substring(string.indexOf(' ')+1,fifthSpace);
    }
        public static class TooShortStringException extends Exception {
        }
}