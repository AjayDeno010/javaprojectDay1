package Module_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Non_Premetivedatatpe_Array {

    public static void main(String[] args) {
//       String[] names={"Ajay","Deno","Kumar","Jaya","Pavithra","Subha"};
//        System.out.println("printing the 0th index"+" "+names[0]);
//        System.out.println(names.toString());
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
//        int[] arr={};
//        //: Java Program to Check if two Arrays are Equal or not Input : arr1[] = {1, 2, 5, 4, 0};
//        // arr2[] = {1, 2, 5, 4, 0}; Output : Yes
//        int[] arr1={1,2,3,4,0};
//        int[] arr2={1,2,3,4,0};
//        Boolean status=false;
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i]==arr2[i]){
//                status=true;
//
//            }
//
//        }
//        System.out.println("Array Status"+" "+status);
//    // Java Program to find largest element in an array Input : arr[] = {10, 20, 4} Output : 20
//        // Input : arr[] = {20, 10, 20, 4, 100} Output : 100
//        int[] Array1={20,10,20,3,4,100,109};
//        int max= Array1[1];
//        for (int i = 0; i < Array1.length; i++) {
//            if(Array1[i] > max){
//                max=Array1[i];
//            }
//
//        }
//        System.out.println("Largest Number"+" "+max);
//        //Q 3: Given an array, the task is to write a Java program to check whether a
//        // specific element is present in this Array or not. Input: arr[] = [5, 1, 1, 9, 7, 2, 6, 10],
//        // key = 7 Output: true Input: arr[] = [-1, 1, 5, 8], key = -2 Output: false
//        System.out.println("write the number to check specific element");
//        Scanner s= new Scanner(System.in);
//        int k=s.nextInt();
//        int[] A10={5, 1, 1, 9, 7, 2, 6, 10};
//        for (int i = 0; i <A10.length ; i++) {
//            if(A10[i]==k){
//                System.out.println("found"+" "+k);
//                break;
//            }
//
//        }
//        System.out.println("Not Found Raaa Goapl"+" "+k);
//     // Java Program for factorial of a number For example factorial of 6 is 65432*1 which is 720.
//        Scanner sc = new Scanner(System.in);
//        int number =sc.nextInt();
//        int m=1; //m=30
////        int n=0;
//        for (int i = number; i >= 1; i--) {
//
//            m = i*m; // m=6
//
//        }
//        System.out.println(m);
//        // printing odd number
//        ArrayList<Integer> ak= new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            if(i%2==1){
//               ak.add(i);
//            }
//
//        }
//        System.out.println(ak);
//
//        int[] copy1= {1,2,3,4,5,6,7,78,8};
//        int[] copy2= new int[copy1.length];
//        for(int i=0;i< copy1.length;i++){
//            copy2[i] = copy1[i];
//        }
//        for(int ref:copy2){
//            System.out.println(ref);
//        }
//        // Write a Java program to find the maximum and minimum value of an array
//        int[] hello= new int[]{7,44,5,3,55,80,23,23};
//        int min = hello[1];
//
//        for (int i=0;i<hello.length;i++){
//            if (hello[i]<min){
//               min = hello[i];
//            }
//        }
//        System.out.println("minimum"+" "+min);
//        //maximum
//        int high = hello[0];
//        for (int i = 1; i < hello.length; i++) {
//            if(hello[i]>high){
//                high=hello[i];
//            }
//        }
//        System.out.println("Maximum"+" "+high);
        // Write a Java program to find the common elements between two arrays (string values) Array1 : [Python, JAVA, PHP, C#, C++, SQL] Array2 : [MySQL, SQL, SQLite, Oracle, PostgreSQL, DB2, JAVA]
        //Common element is : [JAVA, SQL]
        String[] Array2= new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] Array3= new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        int minlength =Math.min(Array2.length, Array3.length);
        for (int i = 0; i <minlength; i++) {
             if(Array2[i].equals(Array3[i])){

                 System.out.println("equals"+" "+Array3[i]);

             }

        }

    }
}
