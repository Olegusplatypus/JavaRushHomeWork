package com.javarush.test.level20.lesson10.bonus04;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* Свой список
Посмотреть, как реализован LinkedList.
Элементы следуют так: 1->2->3->4  и так 4->3->2->1
По образу и подобию создать Solution.
Элементы должны следовать так:
1->3->7->15
    ->8...
 ->4->9
    ->10
2->5->11
    ->12
 ->6->13
    ->14
Удалили 2 и 9
1->3->7->15
    ->8
 ->4->10
Добавили 16,17,18,19,20 (всегда добавляются на самый последний уровень к тем элементам, которые есть)
1->3->7->15
       ->16
    ->8->17
       ->18
 ->4->10->19
        ->20
Удалили 18 и 20
1->3->7->15
       ->16
    ->8->17
 ->4->10->19
Добавили 21 и 22 (всегда добавляются на самый последний уровень к тем элементам, которые есть.
Последний уровень состоит из 15, 16, 17, 19. 19 последний добавленный элемент, 10 - его родитель.
На данный момент 10 не содержит оба дочерних элемента, поэтому 21 добавился к 10. 22 добавляется в следующий уровень.)
1->3->7->15->22
       ->16
    ->8->17
 ->4->10->19
        ->21

Во внутренней реализации элементы должны добавляться по 2 на каждый уровень
Метод getParent должен возвращать элемент, который на него ссылается.
Например, 3 ссылается на 7 и на 8, т.е.  getParent("8")=="3", а getParent("13")=="6"
Строки могут быть любыми.
При удалении элемента должна удаляться вся ветка. Например, list.remove("5") должен удалить "5", "11", "12"
Итерироваться элементы должны в порядке добавления
Доступ по индексу запрещен, воспользуйтесь при необходимости UnsupportedOperationException
Должно быть наследование AbstractList<String>, List<String>, Cloneable, Serializable
Метод main в тестировании не участвует
*/
public class Solution extends AbstractList<String> implements List<String>, Cloneable, Serializable
{
    public static void main(String[] args) {
        List<String> list = new Solution();
        for (int i = 1; i < 16; i++) {
            list.add(String.valueOf(i));
        }
        System.out.println("Expected 3, actual is " + ((Solution) list).getParent("8"));
        System.out.println("Expected 7, actual is " + ((Solution) list).getParent("15"));
        list.remove("1");
        list.remove("5");
        System.out.println("Expected null, actual is " + ((Solution) list).getParent("11"));
        System.out.println("size Expected 12, actual is " + list.size());
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println("Expected 2, actual is " + ((Solution) list).getParent("a"));
        System.out.println("Expected a, actual is " + ((Solution) list).getParent("b"));
        System.out.println("Expected a, actual is " + ((Solution) list).getParent("c"));
        System.out.println("Expected 7, actual is " + ((Solution) list).getParent("d"));
        System.out.println("Expected 8, actual is " + ((Solution) list).getParent("e"));
        System.out.println("size Expected 17, actual is " + list.size());
        list.remove("4");
        System.out.println("size Expected 9, actual is " + list.size());



          }
    public int size = 0;
    Entry<String> head = new Entry<String>(null,null);
    Entry<String> prev = head;

      // generate and fill new queue
    public Queue<Entry<String>> getQueue(Entry<String> element){
        Queue<Entry<String>> queue = new LinkedList<>();
        Queue<Entry<String>> queue2 = new LinkedList<>();
        if (element != head)
            queue.add(element);
        do{
            if(element.next1 != null) queue2.add(element.next1);
            if(element.next2 != null) queue2.add(element.next2);
            if(!queue2.isEmpty()) element = queue2.poll();
            queue.add(element);

        }while (!queue2.isEmpty());
        return queue;
    }
    public Entry<String> findEntry(String text){

        Queue<Entry<String>> queue = getQueue(head);
        for (Entry<String> el:queue){
            if (text.equals(el.value))
                return el;
        }
        return null;
    }

    public String getParent(String value) {

        if (findEntry(value) != null)
            return findEntry(value).prev == null?null:findEntry(value).prev.value;
        else
            return null;
        //have to be implemented
        }
public static class Entry<String>{
    String value;
    Entry<String> next1;
    Entry<String> next2;
    Entry<String> prev;

    public Entry(String element, Entry<String> prev)
    {
        this.value = element;
        this.prev = prev;
    }
}
    @Override
    public String get(int index)
    {
       return null;
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public boolean add(String value)
    {
        Entry<String> newEntry = new Entry(value,prev);

        //check next1 of prev Entry
        if (prev.next1 == null){
            prev.next1 = newEntry;
            newEntry.prev = prev;
            size++;
        }
        //check next1 of prev Entry
        else if(prev.next2 == null){
            prev.next2 = newEntry;
            newEntry.prev = prev;
            size++;
        }
        else
        {
            //if both next1 and next2 are not free check other entry
            Queue<Entry<String>> queue = getQueue(head);
            for (Entry<String> element : queue)
            {
                if (element.next1 == null || element.next2 == null)
                {
                    prev = element;
                    break;
                }
            }
            add(value);
        }
        return true;
    }

    @Override
    public boolean remove(Object o)
    {
        Queue<Entry<String>> delQue = getQueue(findEntry((String) o));
        prev = findEntry((String) o).prev;
        for (Entry<String> entry : delQue)
        {
            if (entry.prev != null && entry.next1 != null && entry.prev.next1.equals(entry))
                entry.prev.next1 = null;
            else if (entry.prev != null)
                entry.prev.next2 = null;
            entry = null;
            size--;
        }
        return true;
    }
}
