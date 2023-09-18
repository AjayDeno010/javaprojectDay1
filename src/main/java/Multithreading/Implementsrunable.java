package Multithreading;

public class Implementsrunable implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("From child");

        }
    }





}
