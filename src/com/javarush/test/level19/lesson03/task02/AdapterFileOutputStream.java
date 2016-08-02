package com.javarush.test.level19.lesson03.task02;

/* Адаптер
Используйте класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter{
    private FileOutputStream output;
    public AdapterFileOutputStream(FileOutputStream output){
        this.output=output;
    }
    public void flush() throws IOException{
     output.flush();
    }

    public void writeString(String s) throws IOException{
        output.write(s.getBytes());
    }

    public void close() throws IOException {
        output.close();
    }
}

