package com.javarush.test.level20.lesson02.task03;

import java.io.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполните карту properties данными из файла.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
Реализуйте логику записи в файл и чтения из файла для карты properties.
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() {
   try{
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String filename = reader.readLine();
       InputStream inputStream = new FileInputStream(filename);
       load(inputStream);
       reader.close();
       inputStream.close();
   }
        catch (IOException e){e.printStackTrace();}
        catch (Exception e){e.printStackTrace();}
        //implement this method - реализуйте этот метод
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties property = new Properties();
        for (Map.Entry<String,String> entry:properties.entrySet()) {
            property.setProperty(entry.getKey(), entry.getValue());
        }
        property.store(outputStream, null);
        //implement this method - реализуйте этот метод
    }

    public void load(InputStream inputStream) throws Exception {
        Properties property = new Properties();
        property.load(inputStream);
        Enumeration<?> enumeration = property.propertyNames();
        while (enumeration.hasMoreElements()) {
            String key = (String) enumeration.nextElement();
            properties.put(key,property.getProperty(key));
        //implement this method - реализуйте этот метод
    }
}
}
