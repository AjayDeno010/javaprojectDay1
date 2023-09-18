package org.Task1;

import java.util.Arrays;

public class Arrayequals {
    public static void main(String[] args) {
        int[] a= new int[]{1,2,3,4,5,6,7};
        int[] b= new int[]{1,2,3,4,5,6,7};
        if(Arrays.equals(a,b)){
            System.out.println("Array are equal");
        }else
            System.out.println("Array are not equal ");
    }
}
