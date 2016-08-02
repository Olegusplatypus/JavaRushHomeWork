package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.CurrencyManipulator;
import com.javarush.test.level26.lesson15.big01.CurrencyManipulatorFactory;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;
import com.javarush.test.level26.lesson15.big01.exception.NotEnoughMoneyException;

import java.util.Collections;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.TreeMap;

/**
 * Created by Oleg on 09.07.2016.
 */
 class WithdrawCommand implements Command {
    private ResourceBundle res = ResourceBundle.getBundle("RESOURCE_PATH + withdraw_en");
    @Override
    public void execute() throws InterruptOperationException {
        String currencyCode = ConsoleHelper.askCurrencyCode();
        CurrencyManipulator manipulator = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);
        int amount = 0;
        ConsoleHelper.writeMessage(res.getString("before"));
        while (true) {
            try {
                ConsoleHelper.writeMessage(res.getString("specify.amount"));
                amount = Integer.parseInt(ConsoleHelper.readString());
            } catch (NumberFormatException e) {
                ConsoleHelper.writeMessage(res.getString("specify.not.empty.amount"));
                continue;
            }
            if (amount <= 0) {
                ConsoleHelper.writeMessage(res.getString("specify.not.empty.amount"));
                continue;
            }
            if (!manipulator.isAmountAvailable(amount)) {
                ConsoleHelper.writeMessage(res.getString("not.enough.money"));
                continue;
            }
            if (manipulator.isAmountAvailable(amount)) {

            Map<Integer, Integer> map = null;
            try {
                map = manipulator.withdrawAmount(amount);
            } catch (NotEnoughMoneyException e) {
                ConsoleHelper.writeMessage(res.getString("exact.amount.not.available"));
                continue;
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                ConsoleHelper.writeMessage("\t" + entry.getKey() + " - " + entry.getValue());
            }
        }
            ConsoleHelper.writeMessage(String.format(res.getString("success.format"),amount,currencyCode));
            break;
        }
    }
}
