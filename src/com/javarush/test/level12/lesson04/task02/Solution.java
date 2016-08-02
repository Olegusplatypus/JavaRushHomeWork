package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Solution sol = new Solution();
        int a = sol.print(5);
        Integer A = sol.print(7);
    }

   public int print(int a){return a;}
   public  Integer print(Integer a){return a;}
    //Напишите тут ваши методы
}
