package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.CurrencyManipulator;
import com.javarush.test.level26.lesson15.big01.CurrencyManipulatorFactory;

import java.util.Collection;
import java.util.ResourceBundle;


/**
 * Created by Oleg on 09.07.2016.
 */
 class InfoCommand implements Command {
    private ResourceBundle res = ResourceBundle.getBundle("RESOURCE_PATH + info_en");
    @Override
    public void execute() {
        ConsoleHelper.writeMessage(res.getString("before"));
        Collection<CurrencyManipulator> list = CurrencyManipulatorFactory.getAllCurrencyManipulators();
        boolean hasMoney = false;
        for (CurrencyManipulator item:list){
            if (item.getTotalAmount() > 0) {
                hasMoney = !hasMoney;
                break;
            }
        }
        if (list.isEmpty() || !hasMoney) {
            ConsoleHelper.writeMessage(res.getString("no.money"));
            return;
        }

        for (CurrencyManipulator item:list) {
            System.out.printf("%s - %s\n",item.getCurrencyCode(),item.getTotalAmount());
        }
    }
}
