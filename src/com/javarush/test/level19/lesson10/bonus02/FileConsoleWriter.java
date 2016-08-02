package com.javarush.test.level19.lesson10.bonus02;

/* Свой FileWriter
Реализовать логику FileConsoleWriter
Должен наследоваться от FileWriter
При записи данных в файл, должен дублировать эти данные на консоль
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;
class Solution{
public static void main(String[]args) throws Exception{
    FileConsoleWriter writer = new FileConsoleWriter(args[0]);
    String text = "text to write in file";
    char [] ch = {'g','e','t'};
    int c = 345456;
    writer.write(c);
    writer.close();
        }}
public class FileConsoleWriter extends FileWriter {

    public FileConsoleWriter(String filename) throws IOException{
        super(filename);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        super(fileName, append);
    }

    public FileConsoleWriter(File file) throws IOException {
        super(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        super(file, append);
    }

    public FileConsoleWriter(FileDescriptor fd) {
        super(fd);
    }

    @Override
    public void write(char[] cbuf) throws IOException {
        super.write(cbuf,0,cbuf.length);
        System.out.println(cbuf);
    }

    @Override
    public void write(char[] cbuf,int off,int len) throws IOException {
        super.write(cbuf,off,len);
        System.out.println(String.valueOf(cbuf,off,len));
    }
    @Override
    public void write(String str,int off,int len) throws IOException {
        super.write(str,off,len);
        System.out.println(str.substring(off,len));
    }
    @Override
    public void write(int c) throws IOException {
        super.write(c);
        System.out.println((char)c);
    }

    @Override
    public void write(String str) throws IOException {
        super.write(str,0,str.length());
        System.out.println(str);
    }



}

