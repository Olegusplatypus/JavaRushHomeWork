package com.javarush.test.level25.lesson05.home01;

/**
 * Created by Oleg on 18.05.2016.
 */
public class LoggingStateThread extends Thread {
    private Thread target;
    private State state;

    LoggingStateThread(Thread target) {
        this.target = target;
        setDaemon(true);
        state = target.getState();
        System.out.println(state);
    }

    public void run() {
        while (state != State.TERMINATED) {
            if (target.getState() != state) {
                state = target.getState();
                System.out.println(state);
            }
        }
    }
}
