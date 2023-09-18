package Multithreading;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        //we can create thread in two ways
        //one by class extends thread and another by interface implements runable
        // both thread just override the run method
        //how to call the thread by instance of object.start();
        //Thread.currentThread().getId()----> to get the id of thread
        //Thread priority---> thread priority starts from 1 to 10 by default it is 5
        //Thread.currentThread().setPriority(5);-------> even after set priority also CPU will not gurantee to take

       Mythread thread= new Mythread();
//        thread.start();
//        for(int i=0;i<5;i++){
//            System.out.println("From Main");
//            Thread.sleep(2000);
//        }
        Implementsrunable threadbro= new Implementsrunable();
        Thread thread1= new Thread(threadbro);
        thread1.start();
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            System.out.println("From Main");
            Thread.sleep(2000);
        }
        //To set Name for Thread
        //Thread.currentThread().setName("Ajay");
        System.out.println(Thread.currentThread().getName());
        //Get Id
        System.out.println(Thread.currentThread().getId());
        // thread.yeield-> it will wait for all other same priority thread to complete//it will give suggestion but CPU wont gurantee
        Thread.yield();
        //Thread.join();-> is method which used to wait for some time of other thread execution
        thread.join();//-> main thread wait
        //this method will wait and execute completley after only it will got for next line of execution
        //deadlock-> when we call thread.join() in both the classes deadlock will happen
        //main thread will wait child thread to complete
        //child thread will wait main thread to complete
        thread.interrupt();// this method used to interuput(distrub)
//        Thread f= ()-> {System.out.println("");};




    }

}
