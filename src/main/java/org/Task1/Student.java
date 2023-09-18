package org.Task1;

public class Student {
    /*Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
    Assign the value of roll_no as '2' and that of name as "John" by
    creating an object of the class Student. */
    /*Assign and print the roll number, phone number and address of two students having
    names "Sam" and "John" respectively by creating two objects of class 'Student'*/
    String Name;
    int Roll_no;
//    public Student(String name,int roll_no){
//
//        this.Name=name;
//        this.Roll_no=roll_no;
//        System.out.println(roll_no);
//        System.out.println(name);
//
//    }
    // Two students data
    public void Sam(int rollnumber, long phonenumber, String Address){
        System.out.println("RollNumber"+" "+rollnumber);
        System.out.println("PhoneNumber"+" "+phonenumber);
        System.out.println("Address"+" "+Address);
    }
    public void john(int rollnumber, long phonenumber, String Address){
        System.out.println("RollNumber"+" "+rollnumber);
        System.out.println("PhoneNumber"+" "+phonenumber);
        System.out.println("Address"+" "+Address);
    }

    public static void main(String[] args) {
//        Student s = new Student("john",2);
        Student s1= new Student();
        s1.Sam(1234567,9841175642l,"No4, chetty street 6th cross Melayanambakkam");
        Student s2= new Student();
        s2.john(7654321,9952914574l,"No4, chetty street 6th cross Melayanambakkam");
    }

}
