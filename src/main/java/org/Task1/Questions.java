package org.Task1;

public class Questions {
    public static void main(String[] args) {
//        //print reverse 123456
//        int i=123456;
//        int b,c=0;
//        //% will dive remainder
//        // / will give quotient
////        b= i%10; //b=6
//        while(i>0){
//            b=i%10;
//            c= c*10+b; //c=6
//            System.out.println(b);
//            i = i/10;
//
//        }
//        System.out.println(c);
// print the armstrong number in 1000
        int j,m=0,y; //m=8
        for(int i=1;i<=1000;i++) {
            y=i;
            while (i >=0){
                j=i%10;
                j=j*j*j;
                m=m+j;
                i=i/10;

            }
            if (m==y){
                System.out.println(m);
            }
          m=0;
        }
    }

}
