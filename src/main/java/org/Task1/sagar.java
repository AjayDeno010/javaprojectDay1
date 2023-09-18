package org.Task1;

public class sagar {

    public void calculate(){
        //gets divided by itself and one
        //56
        //1 to 28
        int primes = 0;
        for(int i=1; i<100; i++){
            //i=25, f = 1
            int factors=1;
            for(int j=2; j<=i/2; j++){
                if(i%j==0){
                    factors++;
                }
            }
            if(factors<2) {
                primes++;
                System.out.println(i);
            }
        }
        System.out.println("Total Primes found: " + primes);
    }

    public static void main(String[] args) {
        sagar m= new sagar();
        m.calculate();

    }
}
