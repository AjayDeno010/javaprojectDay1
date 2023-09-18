package Multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Worker {
    Lock lock= new ReentrantLock(); // instead of sychron
    Condition condition= lock.newCondition(); // for await method and signal

    public void producer() throws InterruptedException {
        lock.lock();
        System.out.println("printing from producer");
        Thread.sleep(500);
        condition.await();
        System.out.println("producer method again");
    }
    public void Consumer() throws InterruptedException {
        lock.lock();
        System.out.println("printing from consumer");
        Thread.sleep(500);
        System.out.println("In consumer");
        condition.signal();
        lock.unlock();
    }
}
