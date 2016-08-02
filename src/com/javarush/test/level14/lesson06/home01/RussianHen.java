package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Oleg on 28.02.2016.
 */
public class RussianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 100;
    }

    public String getDescription() {
        String Description = super.getDescription()+" Моя страна - "+Country.RUSSIA+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
        return Description;
    }
}

