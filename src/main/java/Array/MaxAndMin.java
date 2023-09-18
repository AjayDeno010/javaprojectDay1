package Array;

import java.util.Arrays;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] Array= new int[]{7,4,1,2,3,43,45,98,5,2};

        int max= Array[0];
        int min= Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] > max){
                max= Array[i];
            }

        }
        System.out.println(max);
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] < min){
                min= Array[i];
            }

        }
        System.out.println(min);
        int len = Array.length;

        for (int i = len-1; i >= 0; i--) {
            System.out.println("Reverse Array"+" "+Array[i]);

        }


    }
}
