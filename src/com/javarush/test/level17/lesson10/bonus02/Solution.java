package com.javarush.test.level17.lesson10.bonus02;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion
!!!РЕКОМЕНДУЕТСЯ выполнить level17.lesson10.bonus01 перед этой задачей!!!

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u  - обновляет соответствующие данные людей с заданными id
-d  - производит логическое удаление всех людей с заданными id
-i  - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople
Порядок вывода данных соответствует вводу данных
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных)
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        if (args[0].equals("-c")) create(args);
        else if (args[0].equals("-u")) update(args);
        else if (args[0].equals("-d")) delete(args);
        else if (args[0].equals("-i")) inform(args);
        else return;
        }

    public synchronized static void delete(String[] args){
        for (int i = 1; i <=args.length-1 ; i++) {
            int id = Integer.parseInt(args[i]);
            Person person = allPeople.get(id);
            person.setName(null);
            person.setSex(null);
            person.setBirthDay(null);
        }
    }
    public synchronized static void inform(String[] args){
        for (int i = 1; i <=args.length-1 ; i++) {
        int id = Integer.parseInt(args[i]);
        Person person = allPeople.get(id);
        StringBuilder builder = new StringBuilder();
        String name = person.getName();
        String sex;
        Date bd = person.getBirthDay();
        if (person.getSex().equals(Sex.MALE)) sex="м"; else sex="ж";
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String birthday = format.format(bd);
        builder.append(name+" ").append(sex+" ").append(birthday);
        System.out.println(builder);
    }
    }
    public synchronized static void update(String[] args){
        for (int i = 1; i <=args.length-1 ; i=i+4) {
        int id = Integer.parseInt(args[i]);
        Person person = allPeople.get(id);
        person.setName(args[i+1]);
        if (args[i+2].equals("м")) person.setSex(Sex.MALE);
        else if (args[i+2].equals("ж")) person.setSex(Sex.FEMALE);
        Date bd=null;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        try {bd=format.parse(args[i+3]);}
        catch (Exception e) {e.printStackTrace();}
        person.setBirthDay(bd);}
    }
    public synchronized static void create(String[] args){
        for (int i = 1; i <=args.length-1 ; i=i+3) {
            Date bd = null;
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            try {
                bd = format.parse(args[i+2]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (args[i+1].equals("м")) allPeople.add(Person.createMale(args[i], bd));
            else if (args[i+1].equals("ж")) allPeople.add(Person.createFemale(args[i], bd));
            System.out.println(allPeople.size() - 1);
        }
    }
}