package com.javarush.test.level17.lesson10.bonus01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        if (args.length < 2 || args.length > 5 || args.length == 3) {
            return;
        }
            switch (args.length) {
                case 4:
                    if (args[0].equals("-c")) create(args); else return; break;
                case 5: if (args[0].equals("-u")) update(args); else return; break;
                case 2: if (args[0].equals("-d")) delete(args);
                 else if (args[0].equals("-i")) inform(args) ; else return; break;
            }
        }
    public static void delete(String[] args){
        int id = Integer.parseInt(args[1]);
        Person person = allPeople.get(id);
        person.setName(null);
        person.setSex(null);
        person.setBirthDay(null);
    }
    public static void inform(String[] args){
        int id = Integer.parseInt(args[1]);
        Person person = allPeople.get(id);
        StringBuilder builder = new StringBuilder();
        String name = person.getName();
        String sex;
        Date bd = person.getBirthDay();
        if (person.getSex().equals(Sex.MALE)) sex="м"; else sex="ж";
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
        String birthday = format.format(bd);
        builder.append(name+" ").append(sex+" ").append(birthday);
        System.out.println(builder);
    }
    public static void update(String[] args){
        int id = Integer.parseInt(args[1]);
        Person person = allPeople.get(id);
        person.setName(args[2]);
        if (args[3].equals("м")) person.setSex(Sex.MALE);
        else if (args[3].equals("ж")) person.setSex(Sex.FEMALE);
        Date bd=null;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        try {bd=format.parse(args[4]);}
        catch (Exception e) {e.printStackTrace();}
        person.setBirthDay(bd);
    }
    public static void create(String[] args){
        Date bd=null;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        try {bd=format.parse(args[3]);}
        catch (Exception e) {e.printStackTrace();}
        if (args[2].equals("м"))  allPeople.add(Person.createMale(args[1], bd));
        else if (args[2].equals("ж")) allPeople.add(Person.createFemale(args[1], bd));
        else return;
        System.out.println(allPeople.size()-1);
    }
    }
