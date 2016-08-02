package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

/**
 * Created by Oleg on 09.07.2016.
 */
interface Command {
    void execute() throws InterruptOperationException;
}
