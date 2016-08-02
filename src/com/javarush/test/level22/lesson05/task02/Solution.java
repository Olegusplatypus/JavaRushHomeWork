package com.javarush.test.level22.lesson05.task02;

/* Между табуляциями
Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException{
        if (string==null) throw new TooShortStringException();
        int index1, index2;
        String result;
        try {
            index1 = string.indexOf("\t")+1;
            index2 = string.indexOf("\t",index1);
        }catch (Exception e) {throw new TooShortStringException();}
        if (index1==-1 || index2==-1) throw new TooShortStringException();
        else if (index1==index2) result="";
        else result=string.substring(index1,index2);
        return result;
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("tab0\ttab\ttab1\t"));       //tab
        System.out.println(getPartOfString("\t\t"));                    //
        System.out.println(getPartOfString("123\t123"));                //Exception
        System.out.println(getPartOfString(null));                      //Exception
    }
}
