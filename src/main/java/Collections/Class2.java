package Collections;

public class Class2 {

    public static void main(String[] args) {
        Class1 ref= new Class1("Ajay");
        Class1 ref1= new Class1("Ajay");
        System.out.println(ref.equals(ref1));
        System.out.println(ref.hashcode());
        System.out.println(ref1.hashcode());

    }

}
