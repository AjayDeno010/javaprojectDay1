package Multithreading;

import javax.xml.namespace.QName;

public class HomeMainThread implements Runnable{
    String Name;
    HomeThread HomeThread;

    public HomeMainThread(String name, HomeThread homeThread) {
        Name = name;
       this.HomeThread=homeThread;
    }

    @Override
    public void run() {
        try {
            HomeThread.print(Name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
