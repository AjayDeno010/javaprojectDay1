package org.Task1;

import java.util.Scanner;

public class First10naturalNumber {
    public static void main(String[] args) {
        for(int i=1;i<10; i++){
            System.out.println("First 10 Natural number"+" "+ i);
        }

        //sum and average of 5 numbers
       int a[]={1,2,3,4,5};
        int b=0;
        for (int i = 0; i < 5; i++) {
            b= b+a[i];
        }
        System.out.println(b);
        b=b/5;
        System.out.println(b);
        //cube number
        int d;
        Scanner aa= new Scanner(System.in);
       int a1= aa.nextInt();
      d= a1*a1*a1;
      System.out.println("cubic Number"+" "+d);

      //tables
//       int num;
//        for(int i=0;i<=10;++i){
//            num=5;
//            System.out.println();
        int num = 5;
        for(int i = 1; i <= 10; i++)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
        }


    }

