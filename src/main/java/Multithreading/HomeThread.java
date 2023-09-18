package Multithreading;

public class HomeThread {
    //synchronised
//    public static synchronized void print(String name) throws InterruptedException {
//        for(int i=0;i<5;i++){
//            System.out.print("Hello");
//            Thread.sleep(1000);
//            System.out.println(name);
//        }
//
//    }
    public   void print(String name) throws InterruptedException {
        for(int i=0;i<5;i++){
            System.out.print("Hello");
            synchronized (this) {
                Thread.sleep(1000);
            }
            System.out.println(name);
        }

    }
}
