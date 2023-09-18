package org.Task1;

import java.util.Scanner;

public class Gratestnumberfromuser {
    public static void main(String[] args) {
        System.out.println("Enter the First Number");
        Scanner sc1 = new Scanner(System.in);
        int A1 = sc1.nextInt();
        System.out.println("Enter the second Number");
        Scanner sc2 = new Scanner(System.in);
        int A2 = sc2.nextInt();
        System.out.println("Enter the second Number");
        Scanner sc3 = new Scanner(System.in);
        int A3 = sc3.nextInt();
        if (A1 > A2 && A1 > A3) {
            System.out.println("Grater Number is" + A1);
        } else if (A2 > A1 && A2 > A3) {
            System.out.println("Grater Number is" + A2);
        } else if (A3 > A1 && A3 > A2) {
            System.out.println("Grater Number is" + A3);

        }

    }
}
