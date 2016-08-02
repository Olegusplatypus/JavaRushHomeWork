package com.javarush.test.level26.lesson15.big01;

import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.text.ParseException;
import java.util.ResourceBundle;

/**
 * Created by Oleg on 08.06.2016.
 */
public class ConsoleHelper  {
    private static ResourceBundle res = ResourceBundle.getBundle("com/javarush/test/level26/lesson15/big01/resources/common_en");
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void printExitMessage (){
        writeMessage(res.getString("the.end"));
    }
    public static void writeMessage(String message){
        System.out.println(message);
    }
    public static String readString() throws InterruptOperationException {
        String text = null;
        try {
            text = reader.readLine();
            if (text.toUpperCase().equals(res.getString("operation.EXIT"))) {
                writeMessage(res.getString("the.end"));
                throw new InterruptOperationException();
            }
        }catch (IOException ignored){}
    return text;
    }
    public static String askCurrencyCode() throws InterruptOperationException {
        String currencyCode;

            do {
                writeMessage(res.getString("choose.currency.code"));
                currencyCode = readString();
                if (currencyCode.length() != 3)
                    writeMessage(res.getString("invalid.data"));
            }while(currencyCode.length() != 3);
        return currencyCode.toUpperCase() ;
    }
    public static String[] getValidTwoDigits(String currencyCode) throws InterruptOperationException {
        String input;
        String array [];
        boolean isOK = false;
            do {
                writeMessage(res.getString("choose.denomination.and.count.format"));
                input = readString();
                array = input.split(" ");
                int d,c;

                try{
                    d = Integer.parseInt(array[0]);
                    c = Integer.parseInt(array[1]);
                }catch (Exception e){ writeMessage(res.getString("invalid.data"));;
                    continue;
                }
                if (d <= 0 || c <= 0 || array.length > 2)
                    writeMessage(res.getString("invalid.data"));
                else isOK = true;
            }while(!isOK);

        return array;
    }
    public static Operation askOperation() throws InterruptOperationException,IllegalArgumentException {
        writeMessage(res.getString("choose.operation"));
        writeMessage(res.getString("operation.INFO") + " - 1");
        writeMessage(res.getString("operation.DEPOSIT") + " - 2");
        writeMessage(res.getString("operation.WITHDRAW") + " - 3");
        writeMessage(res.getString("operation.EXIT") + " - 4");
        boolean isOK = false;
        int num = 0;
        while(!isOK) {
            try {
                num = Integer.parseInt(readString());
            } catch (NumberFormatException e) {
                writeMessage(res.getString("invalid.data"));
                continue;
            }
            try {
                if (num > 4 || num < 1) {
                    throw new IllegalArgumentException();
                } else
                    isOK = true;
            }catch (IllegalArgumentException e){ writeMessage(res.getString("invalid.data"));}
        }
        return Operation.getAllowableOperationByOrdinal(num);
    }
}
