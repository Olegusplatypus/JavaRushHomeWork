package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Oleg on 28.02.2016.
 */
public class UkrainianHen extends Hen{
    public int getCountOfEggsPerMonth(){return 300;}
    public  String getDescription() {
        String Description = super.getDescription()+" Моя страна - "+Country.UKRAINE+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
        return Description;
    }
}
