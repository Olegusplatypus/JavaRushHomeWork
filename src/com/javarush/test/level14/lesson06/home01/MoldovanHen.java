package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Oleg on 28.02.2016.
 */
public class MoldovanHen extends Hen{
    public int getCountOfEggsPerMonth(){return 80;}
    public  String getDescription() {
        String Description = super.getDescription()+" Моя страна - "+Country.MOLDOVA+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
        return Description;
    }
}
