package org.Task1;

public class Factorial {
    public void fact(){
        int fact=1;
        int number =5;
        for(int i=1;i<=number;i++){
            fact= fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+ fact);
    }

    public static void main(String[] args) {
        Factorial f=new Factorial();
        f.fact();
    }
}
