package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    Solution (){}
    Solution (String s){}
    Solution (String s,String t){}
    public Solution (String s,String t, int i){}
    public Solution (String s,String t, int i, int y){}
    public Solution (String s,String t, int i, int y,boolean b){}
    protected Solution (String s,String t,boolean b, int i, int y){}
    protected Solution (String s,String t,int i,boolean b,  int y){}
    protected Solution (String s,boolean b, String t,boolean f, int i, int y){}
    private Solution (String s,boolean b, String t,boolean f){}
    private Solution (String s,boolean b, int y){}
    private Solution (String t,boolean f, int i, int y){}

}

