package Collections;

import com.sun.tools.javac.Main;

public class CopyArray {
    public static void main(String[] args) {
        int[] a= new int[]{12,34,65,78,90,23,76};
        int[] b= new int[]{};
        for (int i=0;i<a.length;i++){

            b[i]=a[i];
        }
       for (int i=0;i<b.length;i++){
           System.out.println(b[i]);
       }
    }
}
