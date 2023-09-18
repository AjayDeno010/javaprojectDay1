package Collections;

import java.util.ArrayList;

public class Genrics <T>{
     //Genrics<t extends Number> will accept only number related data type

        //Genrices means we need to mention <T> as data type java will accept all data type.
        // java will decide the data type during run time
     private T Name;
     public Genrics(T username){
         this.Name=username;

     }
     public T getname(){

         return Name;
     }
     //Gen methods
     public <T> void add(ArrayList<T> Array, T obj){
         //? wild card character
         //if we use ? it will support all type of data types ArrayList<?>
      //genric method should give T in both values in parameter like for Array and obj T
         //both need to be same data type if it different java will throw error
     }

     public static void main(String[] args) {
         Genrics<Integer> ref= new Genrics<>(1234567);
         ref.getname().getClass().getName();// to get the name of the data type
         ref.add(new ArrayList<Integer>(),12); // both array and obj data type should same
     }

}
