package com.javarush.test.level27.lesson09.home01;

public class TransferObject {
    private int value;
    protected volatile boolean isValuePresent = false; //use this variable

    public synchronized int get() {
        while (isValuePresent) {
            System.out.println("Got: " + value);
            isValuePresent = !isValuePresent;
        }
        this.notify();
        return value;
    }

    public synchronized void put(int value) {
        while(!isValuePresent) {
            this.value = value;
            System.out.println("Put: " + value);
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isValuePresent = !isValuePresent;
        }

    }
}
