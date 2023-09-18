package ProcessorAndConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Processor {
    List<Integer> list= new ArrayList<>();
    Object lock = new Object();
    public int value=0;
    int limit=5;
    int Bottom=0;
  public void processorreq() throws InterruptedException {
      synchronized (lock) {
          while (true) {
              if (list.size() == limit) {
                  System.out.println("Consumer should remove the element");
                  lock.wait();
              } else{
                  System.out.println("Adding"+ " "+value);
                  list.add(value);
                  value++;

              }
              Thread.sleep(500);
          }
      }
  }
    public void Consumer() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                if (list.size() == Bottom) {
                    System.out.println("waiting for producer to add the element ");
                    lock.wait();
                } else{
                    value= value-1;
                    System.out.println("Removed"+" "+list.remove(value));
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }
}
