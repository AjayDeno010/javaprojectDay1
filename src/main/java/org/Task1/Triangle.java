package org.Task1;

public class Triangle {
    int base= 3;
    int length =4;
    int height = 5;
    float c;
    public Triangle(int base, int length, int height){
        this.length = length;
        this.base=base;
        this.height=height;
    }
    public void areaoftriangle(){
        c = base*height/2;
        System.out.println("Area of triangle"+" "+c);
    }
    public void perameteroftriangle(){

        c = base*length*height;
        System.out.println("perameter of triangle"+" "+c);

    }

    public static void main(String[] args) {
        Triangle t = new Triangle(24,56,89);
        t.areaoftriangle();
        t.perameteroftriangle();
    }
}
