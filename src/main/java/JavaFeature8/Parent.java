package JavaFeature8;

public class Parent {

    public static void main(String[] args) {
        //anonymous method
        BaseClass Bs=new BaseClass() {
            @Override
            public void Ajay() {
                System.out.println("Hello Ajay");
            }
        };
        //Lamda expression
//        BaseClass Bs1 = ()-> System.out.println("Hello Ajay");
        Bs.Deno();
        Bs.Ajay();






    }
}
