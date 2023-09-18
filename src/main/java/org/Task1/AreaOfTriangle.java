package org.Task1;

public class AreaOfTriangle {
    /*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5
    units by creating a class named 'Triangle' without any parameter in its constructor*/
    int base= 3;
    int length =4;
    int height = 5;
    float c;

    public void areaoftriangle(){
        c = base*height/2;
        System.out.println("Area of triangle"+" "+c);
    }
    public void perameteroftriangle(){

        c = base*length*height;
        System.out.println("perameter of triangle"+" "+c);
    }

    public static void main(String[] args) {
        AreaOfTriangle At= new AreaOfTriangle();
        At.areaoftriangle();
        At.perameteroftriangle();
    }
}
