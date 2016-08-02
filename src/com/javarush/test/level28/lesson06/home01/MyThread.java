package com.javarush.test.level28.lesson06.home01;

/**
 * Created by Vayol on 20.07.2016.
 */
public class MyThread extends  Thread
{
    public static int threadCount = 0;
    public MyThread()
    {
        start();
    }

    public MyThread(Runnable target)
    {
        super(target);
        start();
    }

    public MyThread(ThreadGroup group, Runnable target)
    {
        super(group, target);
        start();
    }

    public MyThread(String name)
    {
        super(name);
        start();
    }

    public MyThread(ThreadGroup group, String name)
    {
        super(group, name);
        start();
    }

    public MyThread(Runnable target, String name)
    {
        super(target, name);
        start();
    }

    public MyThread(ThreadGroup group, Runnable target, String name)
    {
        super(group, target, name);
        start();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize)
    {
        super(group, target, name, stackSize);
        start();
    }


    @Override
    public synchronized void start()
    {
        threadCount++;
        int priority = threadCount % 10;
        if (priority == 0) priority = 10;

        int max = currentThread().getThreadGroup().getMaxPriority();
        if (priority > max)
            this.setPriority(max);
        else
            this.setPriority(priority);
        super.start();
    }
}
