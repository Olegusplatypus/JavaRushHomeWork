package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {


    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stal", new Date("JULY 1 1980"));
        map.put("Stalffne", new Date("AUGUST 1 1980"));
        map.put("Stalggggne", new Date("OCTOBER 1 1980"));
        map.put("Stallohhhhne", new Date("OCTOBER 1 1980"));
        map.put("Stallonjjje", new Date("OCTOBER 1 1980"));
        map.put("Stallonekkk", new Date("OCTOBER 1 1980"));
        map.put("Stallonekklll", new Date("OCTOBER 1 1980"));
        map.put("Stalloneiio", new Date("OCTOBER 1 1980"));
        map.put("Stallonccce", new Date("OCTOBER 1 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<String,Date> pair = it.next();
            if (pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 || pair.getValue().getMonth() == 7) {
                it.remove();
        }



            }  //напишите тут ваш код

        }
    }
