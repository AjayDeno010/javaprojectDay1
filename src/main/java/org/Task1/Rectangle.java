package org.Task1;

public class Rectangle {
    /*Write a program to print the area of two rectangles having sides (4,5) and (5,8)
    respectively by creating a class named 'Rectangle' with a method named 'Area'
    which returns the area and length and breadth passed as parameters to its constructor*/
    int Length;
    int width;
    int area;
    public Rectangle(int length, int Width){
     Length=length;
     width=Width;
    }
    public int Area(){
        area = Length*width;
//      System.out.println("Area of Triangle"+" "+area);
        return area;

    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,5);
        r.Area();
        Rectangle r1 = new Rectangle(5,8);
        r1.Area();
    }
}
