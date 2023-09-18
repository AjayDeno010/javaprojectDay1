package Multithreading;

public class Mythread extends Thread {
         static Thread main;
        public void run(){
            for(int i=0;i<5;i++){
                System.out.println("From child");

            }
        }
        public void childthread() throws InterruptedException {
            System.out.println("child one performing");
            main.join();
        }




    }

