package Multithreading;

import java.util.concurrent.Callable;

public class Calable  implements Callable<Integer> {
    public static void main(String[] args) {

    }
    int total=0;
    @Override
    public Integer call() throws Exception {
        for (int i=0;i<3;i++){
            System.out.println("Inside child block");
            total=total+i;
        }

        return total;
    }
}
