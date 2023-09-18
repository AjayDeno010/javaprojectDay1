package org.Task1;

import java.util.Scanner;

public class Area1 {
    /*Write a program to print the area of a rectangle by creating a class named 'Area'
    taking the values of its length and breadth as parameters of its constructor
    and having a method named 'returnArea' which returns the area of the rectangle.
    Length and breadth of rectangle are entered through keyboard.*/
    int Length;
    int Breath;
    public Area1(int Length,int Breath){
         this.Length=Length;
         this.Breath=Breath;
    }
    public int returnArea(){
     return Length*Breath;
    }

    public static void main(String[] args) {

        System.out.println("Enter Length of rectangle ");
        Scanner L1= new Scanner(System.in);
        int Length=L1.nextInt();
        System.out.println("Enter the Breath of rectangle ");
        Scanner B1= new Scanner(System.in);
        int Breath=B1.nextInt();
        Area1 a = new Area1(Length,Breath);
        System.out.println("Area of rectangle "+" "+ a.returnArea());

    }
}
