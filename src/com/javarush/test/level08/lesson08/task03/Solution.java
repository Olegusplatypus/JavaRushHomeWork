package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args) {  // метод добавлен исключительно для вывода на экран
        System.out.println(getCountTheSameFirstName(createMap(),"Петр"));
        System.out.println(getCountTheSameLastName(createMap(),"Иванов"));
    }
    public static HashMap<String, String> createMap()
    {
      HashMap<String,String> map = new HashMap<>();  //напишите тут ваш код
map.put("Иванов","Петр");
map.put("Джо","Петр");
map.put("Брикотыавфкин","Петр");
map.put("Брикаыфвафывоткин","Ахаха");
map.put("Брикфцуоткин","Имя");
map.put("Брикцукйцукоткин","Джана");
map.put("Брицйуаавпавпкоткин","Остап");
map.put("Кардиган","Тесла");
map.put("Бонд","Артем");
map.put("Джобс","Петр");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {

        int count = 0;
        for (Map.Entry<String,String> pair: map.entrySet()) {
            if (pair.getValue().equals(name))
                count ++;
        }
return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {

        int count = 0;
        for (Map.Entry<String,String> pair: map.entrySet()) {
            if (pair.getKey().equals(lastName))
                count ++;
        }
        return count;  //напишите тут ваш код

    }
}
