package org.Task1;

import java.util.Scanner;

public class positivenegative {


    public static void main(String[] args) {

        System.out.println("Enter some of digit number");
        Scanner sc = new Scanner(System.in);
       float a=  sc.nextFloat();
        if(a < 0){
            System.out.println("Entered number is Negative ");
        } else if(a>0){
            System.out.println("Entered number is postive ");
        } else if(a == 0){
            System.out.println("Entered number is Zero");
        }
    }
}