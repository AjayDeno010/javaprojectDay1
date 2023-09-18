package org.Task1;

public class MaxAndMin {
    public static void main(String[] args) {


        int[] a = new int[]{1, 2, 10, 4,-1, 20, 6, 7, 99};
        int max = a[1];
        int min = a[1];
        for (int i = 0; i <a.length;i++){
            if(a[i]>max){
                max=a[i];
            }else if(a[i]<min){
                min=a[i];

            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
