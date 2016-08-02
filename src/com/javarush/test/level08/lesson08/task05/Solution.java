package com.javarush.test.level08.lesson08.task05;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args) {

        for (Map.Entry<String, String> pair: removeTheFirstNameDuplicates(createMap()).entrySet()) {
            System.out.println(pair.getKey() +" - "+pair.getValue());
        }
    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("a","name");
        map.put("as","nakme");
        map.put("asd","nameds");
        map.put("asdf","nameds");
        map.put("sdfgh","namegfddgsdsfg");
        map.put("sdgfhfg","nameghfghgfhfdghgfd");
        map.put("wer","name");
        map.put("ertetw","name");
        map.put("rtyreyty","name");
        map.put("bvvcb","name");  //напишите тут ваш код
        return map;
    }

    public static HashMap<String, String> removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (String value : copy.values())
            if (Collections.frequency(copy.values(), value) > 1)
                removeItemFromMapByValue(map, value);
        //напишите тут ваш код
        return map;
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
