package com.javarush.test.level27.lesson15.big01;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Oleg on 18.07.2016.
 */
public class Tablet {
    private final int number;
    private static Logger log = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }
    public void createOrder(){
        try {
            throw new IOException("Some exception");
        } catch (Exception ex) {
            log.log(Level.SEVERE, "Exception: ", ex);
        }
    }

    public int getNumber() {
        return number;
    }
}
