package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static{  labels.put(76.8,"gfhgf");
        labels.put(76.9,"tygfhgf");
        labels.put(79.8,"gfhgfhty");
        labels.put(74.8,"gfhgfhty");
        labels.put(73.8,"tyhgfhgf");}

    public static void main(String[] args) {


        System.out.println(labels);
    }
}
