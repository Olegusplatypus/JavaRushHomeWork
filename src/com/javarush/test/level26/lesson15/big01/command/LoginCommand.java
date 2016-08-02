package com.javarush.test.level26.lesson15.big01.command;


import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.util.ResourceBundle;


/**
 * Created by Oleg on 09.07.2016.
 */
 class LoginCommand implements Command {
    private ResourceBundle validCreditCards = ResourceBundle.getBundle("RESOURCE_PATH + verifiedCards");
    private ResourceBundle res = ResourceBundle.getBundle("RESOURCE_PATH + login_en");

    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage(res.getString("before"));
        String num1 = null;
        String pin1 = null;

        while (true){
            ConsoleHelper.writeMessage(res.getString("specify.data"));

            num1 = ConsoleHelper.readString();
            if (num1.length() != 12 || num1 == null || pin1 == null || pin1.length() != 4){
                ConsoleHelper.writeMessage(res.getString("not.verified.format"));
                ConsoleHelper.writeMessage(res.getString("try.again.with.details"));
                continue;
            }
                        if (!validCreditCards.containsKey(num1)){
                ConsoleHelper.writeMessage(res.getString("not.verified.format"));
                ConsoleHelper.writeMessage(res.getString("try.again.or.exit"));
                continue;
            }
            if (!validCreditCards.getString(num1).equals(pin1))
           {
               ConsoleHelper.writeMessage(res.getString("not.verified.format"));
               ConsoleHelper.writeMessage(res.getString("try.again.or.exit"));
               continue;
           }
            ConsoleHelper.writeMessage(res.getString("success.format"));
            break;
        }
    }
}
