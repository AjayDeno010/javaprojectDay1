package org.Task1;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        int c;
        float d;
        System.out.println("Enter the First Number");
        Scanner in1= new Scanner(System.in);
        int avg1=in1.nextInt();
        System.out.println("Enter the second  Number");
        Scanner in2= new Scanner(System.in);
        int avg2=in2.nextInt();
        System.out.println("Enter the third  Number");
        Scanner in3= new Scanner(System.in);
        int avg3=in3.nextInt();
        c= avg1+ avg2+avg3;
        d= c/3;
        System.out.println("Average of three number is"+" "+d);


    }
}
