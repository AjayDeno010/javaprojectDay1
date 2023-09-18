package JavaFeature8;

public  interface BaseClass {
     void Ajay();
     default void Deno(){
          System.out.println("Printing from default");
     }
     static  void Kumar(){
          System.out.println("Printing from Static ");
     }

}
