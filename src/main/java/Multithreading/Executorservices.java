package Multithreading;

import java.util.concurrent.*;

public class Executorservices {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Executor service will create thread pool[10] task
        //if we are creating 15 task--> 10 task will pick first and parllely will call reamaining thread once completed

        ExecutorService service= Executors.newSingleThreadExecutor();
        service.submit(new Mythread());
        service.shutdown();
        //new fixed thread pool
        ExecutorService service1= Executors.newFixedThreadPool(2);
        service.submit(new Mythread());
        service1.shutdown();
        //Schedule at fixedrate
        ScheduledExecutorService service2= Executors.newScheduledThreadPool(2);
        service2.scheduleAtFixedRate(new Mythread(),0,1000, TimeUnit.MILLISECONDS);
        service2.shutdown();
        //callable interface
        ExecutorService service4= Executors.newFixedThreadPool(2);
        Future<Integer> future=service4.submit(new Calable());
        future.get(); // this will get the return value
        //at this point main thread will wait for some time to execute this child thread future.get()
        service4.shutdown();
    }
}
