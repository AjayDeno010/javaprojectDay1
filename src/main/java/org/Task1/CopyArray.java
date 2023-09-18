package org.Task1;

public class CopyArray {
    public static void main(String[] args) {
        int[] a= new int[]{1,2,3,4,5,6};
        int[] b= new int[a.length];
        for (int i=0;i<a.length;i++){
           b[i]=a[i];
        }
        for (int k:
            b ) {
            System.out.println(k);
        }
    }
}
