package Multithreading;

public class Executionforhomethread {
    public static void main(String[] args) {


        HomeThread homeThread = new HomeThread();
//        HomeThread homeThread1 = new HomeThread();
//        HomeMainThread myThread1 = new HomeMainThread("Ajay", homeThread);
//        HomeMainThread myThread2 = new HomeMainThread("Deno", homeThread1);
        HomeMainThread myThread1 = new HomeMainThread("Ajay", homeThread);
        HomeMainThread myThread2 = new HomeMainThread("Deno", homeThread);
        Thread ref = new Thread(myThread1);
        Thread ref1 = new Thread(myThread2);
        ref.start();
        ref1.start();



    }




}
