package com.javarush.test.level22.lesson09.task02;

import java.util.LinkedHashMap;
import java.util.Map;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {
    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<>();
        map.put("name","Ivanov");
        map.put("country","Ukraine");
        map.put("city","Kiev");
        map.put("age",null);
        StringBuilder b = getCondition(map);
        System.out.println(b.toString());
            }

    public static StringBuilder getCondition(Map<String, String> params) {

        StringBuilder build = new StringBuilder();
        if (params == null || params.size() == 0)
            return build;
        for (Map.Entry<String,String> entry:params.entrySet()) {
            if (entry.getValue()!=null)
                build.append(String.format("%s = '%s' and ",entry.getKey(),entry.getValue()));
        }
        String t = build.toString();
        t = t.substring(0,t.lastIndexOf(" and "));
        build = new StringBuilder(t);
        return build;
    }
}
