package org.Task1;

public class ArrayMax {
    public int large(){
        int[] a={12,67,98,90,56};
        int max= a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]> max){
                max = a[i];

            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayMax a= new ArrayMax();
        System.out.println("Largest number"+ a.large());

    }


}
