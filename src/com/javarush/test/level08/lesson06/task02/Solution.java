package com.javarush.test.level08.lesson06.task02;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Провести 10 тысяч вставок, удалений
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
*/
//код изменен для расчета времени выполнения каждой операции.
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // ArrayList
        Date start = new Date();
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        Date end = new Date();
        int time = (int) (end.getTime() - start.getTime());
        System.out.println("arrayList shows the next result to ADD: " + time);

        start = new Date();
        get10000(arrayList);
        end = new Date();
        time = (int) (end.getTime() - start.getTime());
        System.out.println("arrayList shows the next result to GET: " + time);

        start = new Date();
        set10000(arrayList);
        end = new Date();
        time = (int) (end.getTime() - start.getTime());
        System.out.println("arrayList shows the next result to SET: " + time);

        start = new Date();
        remove10000(arrayList);
        end = new Date();
        time = (int) (end.getTime() - start.getTime());
        System.out.println("arrayList shows the next result to REMOVE: " + time);



        // LinkedList
        Date start2 = new Date();
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        Date end2 = new Date();
        int time2 = (int) (end2.getTime() - start2.getTime());
        System.out.println("arrayList shows the next result to ADD: " + time2);

        start2 = new Date();
        get10000(linkedList);
        end2 = new Date();
        time2 = (int) (end2.getTime() - start2.getTime());
        System.out.println("arrayList shows the next result to GET: " + time2);

        start2 = new Date();
        set10000(linkedList);
        end2 = new Date();
        time2 = (int) (end2.getTime() - start2.getTime());
        System.out.println("arrayList shows the next result to SET: " + time2);

        start2 = new Date();
        remove10000(linkedList);
        end2 = new Date();
        time2 = (int) (end2.getTime() - start2.getTime());
        System.out.println("arrayList shows the next result to REMOVE: " + time2);
    }

    public static void insert10000(List list)
    {

        for (int i = 0; i <10000 ; i++) {

            list.add(i,new Object());

        }   //напишите тут ваш код

    }

    public static void get10000(List list)
    {

        for (int i = 0; i <10000 ; i++) {

            list.get(i);
            //напишите тут ваш код
        }
    }

    public static void set10000(List list)
    {

        for (int i = 0; i <10000 ; i++) {

            list.set(i,new Object());
           //напишите тут ваш код
        }   //напишите тут ваш код

    }

    public static void remove10000(List list)
    {

        for (int i = 0; i <10000 ; i++) {

            list.remove(0);
             //напишите тут ваш код
        }

    }
}
