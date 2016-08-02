package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());  //напишите тут ваш код
        int b = Integer.parseInt(reader.readLine());  //напишите тут ваш код
        int c = Integer.parseInt(reader.readLine());  //напишите тут ваш код  //напишите тут ваш код
        int x,y,z;
if(a>=b && b>=c)
{x=a;
    y=b;
    z=c;}
     else
if(a>=c && c>=b)
{x=a;
    y=c;
    z=b;}
        else
if(b>=a && a>=c)
{x=b;
    y=a;
    z=c;}
else
if(b>=c && c>=a)
{x=b;
    y=c;
    z=a;}
        else
if(c>=b && b>=a)
{x=c;
    y=b;
    z=a;}
        else
{x=c;
    y=a;
    z=b;}
        System.out.println(x + " "+ y + " " +z);
        }
}
