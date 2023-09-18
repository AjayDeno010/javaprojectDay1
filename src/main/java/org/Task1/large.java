package org.Task1;

public class large {
    /* Given an array, the task is to write a Java program to check whether a
    specific element is present in this Array or not.
    Input: arr[] = [5, 1, 1, 9, 7, 2, 6, 10], key = 7 Output: true
    Input: arr[] = [-1, 1, 5, 8], key = -2 Output: false */
    public static void main(String[] args) {
        int[] arr= new int[]{5,1,1,9,7,2,6,10};
        for(int i=0;i<arr.length;i++){
            if(i==7){
                System.out.println("true");
                break;
            }
        }
        int[] arr1= new int[]{-1,1,5,8};
        boolean test = false;
//        int k=0;
        for(int j=0;j<arr1.length;j++) {
            if (j == -2) {
              test =true;
             break;
            }
        }
        System.out.println(test);
//        if(k>0){
//            System.out.println("true");
//        }else if(k==0){
//            System.out.println("False");
//        }




    }
}
