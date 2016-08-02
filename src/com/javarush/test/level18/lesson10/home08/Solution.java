package com.javarush.test.level18.lesson10.home08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file;
        while (!(file=reader.readLine()).equals("exit")){
            new ReadThread(file).start();
    }
    }

    public static class ReadThread extends Thread {
        public String fileName;
        public ReadThread(String fileName) {
          this.fileName=fileName;
          //implement constructor body
        }
        public int getMostFrequentByte (FileInputStream input) throws Exception{
            Map<Integer,Integer> map = new HashMap<>();
            int max=0;
            int result=0;
            while (input.available() > 0) {
                int  key = input.read();
                if (map.containsKey(key)) {
                    int value = map.get(key);
                    map.put(key, ++value);
                }
                else { map.put(key, 1);}
                for (Integer a : map.values()) {
                    if (max<a) max=a;}
            }
            for (Map.Entry<Integer,Integer> pair: map.entrySet()) {
                if ((pair.getValue()).equals(max))
                {
                   result = pair.getKey();
                }
            }
            return result;
        }
        public void run() {
            try {
                FileInputStream input = new FileInputStream(fileName);
                resultMap.put(fileName,getMostFrequentByte(input));

            } catch (Exception e){e.printStackTrace();}
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
